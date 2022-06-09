// class Solution {
//     public double myPow(double x, int n) {
//         return (double) Math.pow(x, n);
//     }
// }

class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        return pow(x, nn);
    }

    public double pow(double x, long n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        if (n % 2 == 0) {
            return pow(x * x, n / 2);
        } else {
            return x * pow(x * x, n / 2);
        }
    }

}