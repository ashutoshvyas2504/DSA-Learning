class Solution {
    public int reverse(int x) {
        double reverse = 0;
        while (x != 0) {
            double digit = x % 10;
            reverse = reverse * 10 + digit;
            if (reverse >= Integer.MAX_VALUE ||
                reverse <= Integer.MIN_VALUE) {
                return 0;
            } // Integer Overflow Check
            x /= 10;

        }

        return (int) reverse;
    }
}