class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet(nums.length, 1);
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}