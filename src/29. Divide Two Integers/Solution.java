class Solution {
    public int divide(long dividend, long divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        int sign = dividend > 0 ^ divisor > 0 ? -1 : 1;
        long ans = 0;
        long dvd = Math.abs(dividend);
        long dvs = Math.abs(divisor);
        while (dvd >= dvs) {
            long k = 1;
            while (k * 2 * dvs <= dvd)
                k *= 2;
            dvd -= k * dvs;
            ans += k;
        }
        return sign * (int) ans;
    }
}