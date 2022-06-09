class Solution {
    public int mySqrt(int num) {
        long l = 0, h = num;
        while (l < h) {
            long m = (l + h) / 2;
            if (m * m < num) {
                l = m + 1;
            } else {
                h = m;
            }
        }
        return (l * l > num) ? (int)l - 1 : (int)l;
    }
}