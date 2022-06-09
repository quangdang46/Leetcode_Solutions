class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int i=1;
        while(n>=i) {
            n-=i;
            count++;
            i++;
        }
        return count;
    }
}


class Solution {
    public int arrangeCoins(int n) {
         if (n < 0) {
            throw new IllegalArgumentException("Input Number is invalid. Only positive numbers are allowed");
        }
        return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
    }
}