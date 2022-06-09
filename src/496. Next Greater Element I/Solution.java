class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int cnt = 0;
        for (int i = 0; i < nums1.length; i++) {
            int j = 0, k = nums2.length;
            while (j < k && nums1[i] != nums2[j]) {
                j++;
            }
            while (j < k && nums1[i] >= nums2[j]) {
                j++;
            }
            if (j < k) {
                result[cnt++] = nums2[j];
            } else {
                result[cnt++] = -1;
            }
        }

        return result;
    }
}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> numToNextGreater = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>(); // decreasing stack

        for (final int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num)
                numToNextGreater.put(stack.pop(), num);
            stack.push(num);
        }

        for (final int num : nums1)
            if (numToNextGreater.containsKey(num))
                ans.add(numToNextGreater.get(num));
            else
                ans.add(-1);

        return ans.stream().mapToInt(i -> i).toArray();
    }
}
