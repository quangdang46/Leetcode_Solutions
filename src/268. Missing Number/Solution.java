// class Solution {
//     public int missingNumber(int[] nums) {
//         int n=nums.length;
//         boolean[] check=new boolean[n+1];
//         for(int i=0; i<check.length; i++) {
//             check[i] = false;
//         }
//         for(int i=0; i<n; i++) {
//             check[nums[i]] = true;
//         }
//         for(int i=0; i<check.length; i++) {
//             if(!check[i]) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int missingNumber(int[] nums) {
        // int n=nums.length;
        // int totalSum=(n*(n+1))/2;
        // int sum=0;
        // for(int i=0;i<n;i++)
        // {
        //     sum+=nums[i];
        // }
        // return totalSum-sum;
        int result=0;
        for(int i:nums) {
            result^=i;
        }
        for(int i=0;i<=nums.length; i++){
            result^=i;
        }
        return result;
    }
}