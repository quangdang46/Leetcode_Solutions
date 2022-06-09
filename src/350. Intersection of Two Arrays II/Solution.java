class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int map[] = new int[1001], i = 0;
        for (int e : nums1)
            map[e]++;
        for (int e : nums2)
            if (map[e]-- > 0)
                nums1[i++] = e;
        return Arrays.copyOf(nums1, i);
    }
}

   