// class Solution {
//     public int thirdMax(int[] nums) {
//         int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
//         for (int num : nums) {
//             if (num > max1) {
//                 max3 = max2;
//                 max2 = max1;
//                 max1 = num;
//             } else if (num > max2 && num < max1) {
//                 max3 = max2;
//                 max2 = num;
//             } else if (num > max3 && num < max2) {
//                 max3 = num;
//             }
//         }
//         return max3 == Integer.MIN_VALUE ? max1 : max3;

//     }
// }

class Solution {
    public static void insert(long[] maxArr, int val) {
        int i = 0;
        while (i < maxArr.length) {
            if (val == maxArr[i]) {
                // Ko duoc trung
                return;
            } else if (val > maxArr[i]) {
                // Chen val vao maxArr[i]
                break;
            } else// val < maxArr
            {
                i++;
            }
        }
        // 4 3 2 | 3
        if (i < maxArr.length) {
            for (int j = maxArr.length - 2; j >= i; j--) {
                maxArr[j + 1] = maxArr[j];
            }
            maxArr[i] = val;
        }
    }

    public int thirdMax(int[] a) {
        long[] maxArr = { Long.MIN_VALUE,
                Long.MIN_VALUE, Long.MIN_VALUE };

        for (int i = 0; i < a.length; i++) {
            insert(maxArr, a[i]);
        }

        if (maxArr[2] == Long.MIN_VALUE)
            return (int) maxArr[0];

        return (int) maxArr[2];
    }
}