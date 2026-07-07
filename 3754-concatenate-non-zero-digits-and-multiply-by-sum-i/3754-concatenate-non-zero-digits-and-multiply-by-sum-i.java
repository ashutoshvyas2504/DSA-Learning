class Solution {
    public long sumAndMultiply(int n) {
        int result = 0;
        int place = 1;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            sum += digit;   // Sum of digits

            if (digit != 0) {
                result = digit * place + result;
                place *= 10;
            }

            n /= 10;
        }

        return (long) result * sum;
    }
}