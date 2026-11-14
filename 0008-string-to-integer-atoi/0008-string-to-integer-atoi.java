class Solution {
    public int myAtoi(String s) {
       int i = 0;
        int n = s.length();
        while (i < n && s.charAt(i) == ' ')  i++;
        int sign = 1;
         if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (i < n && s.charAt(i) == '+') {
            i++;
        }
        long ans = 0;

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
             int digit = s.charAt(i) - '0';
              ans = ans * 10 + digit;
            long result = ans * sign;
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
             if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
             i++;
        }

        return (int)(ans * sign);
    }
}