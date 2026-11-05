class Solution {
    public int countIntersectingIntervals(int[][] intervals) {

        int c = 0;

        for (int i = 0; i < intervals.length; i++) {

            for (int j = i + 1; j < intervals.length; j++) {

                int s1 = intervals[i][0];
                int e1 = intervals[i][1];

                int s2 = intervals[j][0];
                int e2 = intervals[j][1];

                if (s1 <= e2 && s2 <= e1) {
                    c++;
                }
            }
        }

        return c;

    }
}