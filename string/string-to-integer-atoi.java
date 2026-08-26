class Solution {
    public int myAtoi(String s) {

        s = s.trim();

        long ans = 0;

        if (s.length() == 0) return 0;

        int sign = 1;
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        if (i == s.length() || !Character.isDigit(s.charAt(i)))
            return 0;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            if (sign == -1) {
                if (ans > Integer.MAX_VALUE / 10 ||
                        (ans == Integer.MAX_VALUE / 10 && digit > 8))
                    return Integer.MIN_VALUE;
            } else {
                if (ans > Integer.MAX_VALUE / 10 ||
                        (ans == Integer.MAX_VALUE / 10 && digit > 7))
                    return Integer.MAX_VALUE;
            }

            ans = ans * 10 + digit;
            i++;
        }

        return (int) (ans * sign);
    }
}