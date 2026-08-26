/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    Map<Integer, List<int[]>> map = new HashMap<>();
    int min = 0, max = 0;

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        dfs(root, 0, 0);

        List<List<Integer>> res = new ArrayList<>();

        for (int c = min; c <= max; c++) {

            List<int[]> list = map.get(c);

            Collections.sort(list, (a, b) -> {
                if (a[0] == b[0])
                    return a[1] - b[1];
                return a[0] - b[0];
            });

            List<Integer> col = new ArrayList<>();

            for (int[] arr : list) {
                col.add(arr[1]);
            }

            res.add(col);
        }

        return res;
    }

    private void dfs(TreeNode node, int row, int col) {

        if (node == null) return;

        map.putIfAbsent(col, new ArrayList<>());
        map.get(col).add(new int[]{row, node.val});

        min = Math.min(min, col);
        max = Math.max(max, col);

        dfs(node.left, row + 1, col - 1);
        dfs(node.right, row + 1, col + 1);
    }
}