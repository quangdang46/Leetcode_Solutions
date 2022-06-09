class Solution {

    public static sumSquared(int n){
        String s=Integer.toString(n);
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=Math.pow(s.charAt(i)-'0',2);
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            n = sumSquared(n);
            if (n == 1)
                return true;
        }
        return false;
    }
}

class Solution {
    public boolean isHappy(int n) {
        int num = 0;
        int i = 0;
        int temp;
        while (i < 6) {
            while (n > 0) {
                temp = n % 10;
                num += temp * temp;
                n /= 10;
            }
            if (num == 1)
                return true;
            else {
                n = num;
                num = 0;
            }
            i++;
        }
        return false;
    }
}