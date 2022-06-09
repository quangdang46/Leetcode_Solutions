class Solution {
    // public int removeElement(int[] nums, int val) {
    //     int n=nums.length;
    //     for(int i=0; i<n; i++) {
    //         if(nums[i]==val){
    //             for(int j=i; j<n-1; j++) {
    //                 nums[j]=nums[j+1];
    //             }
    //             n--;
    //             i--;
    //         }
    //     }
    //     return n;
    // }

    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]!=val) {
                nums[k++]=nums[i];
            }
        }
        return k;
    }
}