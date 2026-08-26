class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer, boolean[]> map = new HashMap<>();

        for (int i = 0; i < reservedSeats.length; i++) {

            int a = reservedSeats[i][0];
            int b = reservedSeats[i][1];

            if (!map.containsKey(a)) {
                map.put(a, new boolean[10]);
            }

            map.get(a)[b-1] = true;
        }

        int ans = (n - map.size()) * 2;

        for (boolean[] arr : map.values()) {

            boolean left = !arr[1] && !arr[2] && !arr[3] && !arr[4];
            boolean middle =!arr[3] && !arr[4] && !arr[5] && !arr[6];
            boolean right =!arr[5] && !arr[6] && !arr[7] && !arr[8];

            if (left && right) {
                ans += 2;
            }
            else if (left || middle || right) {
                ans += 1;
            }
        }

        return ans;
    }
}