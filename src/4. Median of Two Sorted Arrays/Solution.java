// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int[] nums=new int[nums1.length+nums2.length];
//         int i=0,j=0,k=0;
//         int sum=0;
//         while(i<nums1.length && j<nums2.length) {
//             if(nums1[i]<=nums2[j]){
//                 sum+=nums1[i];
//                 nums[k++]=nums1[i++];
//             }else{
//                 sum+=nums2[j];
//                 nums[k++]=nums2[j++];
//             }
//         }
//         while(i<nums1.length){
//             sum+=nums1[i];
//             nums[k++]=nums1[i++];
//         }
//         while(j<nums2.length){
//             sum+=nums2[j];
//             nums[k++]=nums2[j++];
//         }
//         return (double)(sum-nums[0]-nums[nums.length-1])/(nums.length-2);
//     }
// }

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n1 > n2)
            return findMedianSortedArrays(nums2, nums1);

        int l = 0;
        int r = n1;

        while (l <= r) {
            int partition1 = (l + r) / 2;
            int partition2 = (n1 + n2 + 1) / 2 - partition1;
            int maxLeft1 = partition1 == 0 ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int maxLeft2 = partition2 == 0 ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight1 = partition1 == n1 ? Integer.MAX_VALUE : nums1[partition1];
            int minRight2 = partition2 == n2 ? Integer.MAX_VALUE : nums2[partition2];
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1)
                return (n1 + n2) % 2 == 0
                        ? (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) * 0.5
                        : Math.max(maxLeft1, maxLeft2);
            else if (maxLeft1 > minRight2)
                r = partition1 - 1;
            else
                l = partition1 + 1;
        }

        throw new IllegalArgumentException();
    }
}
