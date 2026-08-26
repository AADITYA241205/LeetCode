class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[128];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        while (sb.length() < s.length()) {
            int max = 0;

            for (int i = 1; i < 128; i++) {
                if (arr[i] > arr[max]) {
                    max = i;
                }
            }

            for (int i = 0; i < arr[max]; i++) {
                sb.append((char) max);
            }

            arr[max] = 0;
        }

        return sb.toString();
    }
}