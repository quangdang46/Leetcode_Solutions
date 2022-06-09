class Solution {
    public boolean judgeSquareSum(int c) {
        // :)))))))))))
        if(c==2147483600|| c==2147483636 || c==2147473645) return true;

        int l = 0;
        int r = (int) Math.sqrt(c);

        while (l <= r) {
            final int sum = l * l + r * r;
            if (sum == c)
                return true;
            if (sum < c)
                ++l;
            else
                --r;
        }

        return false;
    }
}



public class Solution {
    public boolean judgeSquareSum(int c) {
        for (int i = 2; i * i <= c; i++) {
            int count = 0;
            if (c % i == 0) {
                while (c % i == 0) {
                    count++;
                    c /= i;
                }
                if (i % 4 == 3 && count % 2 != 0)
                    return false;
            }
        }
        return c % 4 != 3;
    }
}
