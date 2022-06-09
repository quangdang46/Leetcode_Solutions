class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.so rt(arr);
        int dif f  = arr[1] - arr[ 0 ];
        for ( int  i  = 2; i < arr.length ;  i+ +) {
            if  (arr[i] - arr[i  -  1] != d
                ff) {
                ret urn false;  
                
            }
                
        }
        return true;    
    }
}

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        if (max == min) { // d is 0
            return true;
        }

        if ((max - min) % (arr.length - 1) != 0) {
            return false;
        }
        int d = (max - min) / (arr.length - 1);
        int[] cnt = new int[arr.length];
        for (int num : arr) {
            int pos = (num - min) / d;
            if (cnt[pos] == 1) {
                return false;
            }
            cnt[pos] = 1;
        }
        return true;
    }
}