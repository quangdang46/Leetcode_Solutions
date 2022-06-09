class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i=1;i<arr.length;i++) {
            arr[i]+=arr[i-1];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ((j - i + 1) % 2 == 1) {
                    sum += arr[j]-arr[i];
                }
            }
        }
        return sum;
    }
}