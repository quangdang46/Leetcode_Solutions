// class Solution {
//     public int search(int[] nums, int target) {
//         int i=0,j=nums.length-1;
//         while (i <= j){
//             int mid = (i + j)/2;
//             if(nums[mid] == target) return mid;
//             else if(nums[mid]>target) j = mid-1;
//             else i = mid+1;
//         }
//         return -1;
//     }
// }


class Solution {

    public int Dequy(int nums[], int target,int l,int r) {
        if(l>r) return -1;
        int mid=(l+r)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid]<target) return Dequy(nums,target,mid+1,r);
        else return Dequy(nums,target,l,mid-1);
    }

    public int search(int[] nums, int target) {
        return Dequy(nums,target,0,nums.length-1);
    }
}