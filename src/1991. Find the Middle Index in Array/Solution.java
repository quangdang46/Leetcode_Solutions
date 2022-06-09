class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=IntStream.of(nums).sum();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(2*ans==sum-nums[i]){
                return i;
            }
            ans+=nums[i];
        }
        return -1;
    }
}



class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            left[i]=sum;
        }
        sum=0;
        for(int i=nums.length-1;i>=0;i--){
            sum+=nums[i];
            right[i]=sum;
        }
        for(int i=0;i<nums.length;i++){
            if(left[i]==right[i])
                return i;
        }
        return -1;
    }
}