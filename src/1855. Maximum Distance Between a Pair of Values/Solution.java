
// Time limit
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0;
        int n = nums2.length;
        int k = nums1.length;
        int max_distance = Integer.MIN_VALUE;
        while (i < n) {
            int j = 0;
            while (j < k && nums1[j] > nums2[i]) {
                j++;
            }
            while (j < k && j <= i && nums1[j] <= nums2[i]) {
                max_distance = Math.max(max_distance, Math.abs(i - j));
                j++;
            }
            i++;
        }
        return max_distance == Integer.MIN_VALUE ? 0 : max_distance;
    }
}



class Solution {

    public int maxDistance(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length, i = 0, j = 0;
        
        while(i < n1 && j < n2) {
            while(j < n2-1 && nums2[j+1] >= nums1[i]) j++;
            i++;
            j++;
        }
        
        return j-i;
    }
}


//Answer:
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans = 0;
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length)
            if (nums1[i] > nums2[j])
                ++i;
            else{
                ans = Math.max(ans, j++ - i);
                if (j == nums2.length)
                    break;
            }
        return ans;
    }
}
