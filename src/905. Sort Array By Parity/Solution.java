
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=nums.length - 1;
        while (i <j){
            while (i < j && nums[i]% 2 == 0){
                i++;
            }
            while(i<j && nums[j]%2!=0){
                j--;
            }
            int tmp=nums[i];
            nums[i] = nums[j];
            nums[j]=tmp;
        }
        return nums;
    }
}


// class Solution {
//     public int[] sortArrayByParity(int[] nums) {
//         int left = 0, right = nums.length-1;
//         while (left < right) {
//             if ((nums[left] & 1) == 0) {
//                 left++;
//             }
//             else {
//                 int temp = nums[left];
//                 nums[left] = nums[right];
//                 nums[right] = temp;
//                 right--;
//             }
//         }
//         return nums;
//     }
// }