// class Solution {
//     public int pivotIndex(int[] nums) {
//         if(nums.length==1) return 0;
//         if(nums.length==0) return -1;
//         int[] sum1 = new int[nums.length];
//         sum1[0] = nums[0];
//         for (int i = 1; i < nums.length; i++) {
//             sum1[i] =(sum1[i - 1] + nums[i]);
//         }
//         for (int i = 0; i < nums.length; i++) {
//             int tmp=0;
//             if(i==0){
//                 tmp=sum1[nums.length-1]-nums[i];
//                 if(tmp==0){
//                     return 0;
//                 }
//             }else if(i==nums.length-1){
//                 if(sum1[nums.length-2]==0){
//                     return i;
//                 }
//             }else{
//                 tmp=sum1[nums.length-1]-sum1[i];
//                 if(tmp==sum1[i-1]){
//                     return i;
//                 }
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int pivotIndex(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            sum2+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(sum1==sum2-sum1-nums[i])
                return i;
            sum1+=nums[i];
        }
        return -1;
    }
}