class Solution {
    public void rotate(int[] nums, int k) {
      k %= nums.length;
      reverse(nums, 0, nums.length - 1);
      reverse(nums, 0, k - 1);
      reverse(nums, k, nums.length - 1);
    }
  
    private void reverse(int[] nums, int l, int r) {
      while (l < r)
        swap(nums, l++, r--);
    }
  
    private void swap(int[] nums, int l, int r) {
      final int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
    }
}
  
//Time limit
// class Solution {
//     public void add(int[] nums, int n){
//         for(int i=nums.length-1;i>0;i--){
//             nums[i] = nums[i-1];
//         }
//         nums[0] = n;
//     }
//     public void rotate(int[] nums, int k) {
//         for(int i=0;i<k;i++){
//             add(nums,nums[nums.length-1]);
//         }
//     }
// }