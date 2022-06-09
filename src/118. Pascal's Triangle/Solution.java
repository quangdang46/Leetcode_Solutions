// class Solution {
//     public static int C(int k, int n) {
//         if (k == 0 || k == n) return 1;
//         if (k == 1) return n;
//         return C(k - 1, n - 1) + C(k, n - 1);
//     }
//     public List<List<Integer>> generate(int numRows) {
//         int i = 0;
//         List<List<Integer>> res = new ArrayList<>();
//         while(i<numRows){
//             List<Integer> list = new ArrayList<Integer>();
//             for(int j=0;j<i;j++){
//                 list.add(C(j,i));
//             }
//             res.add(list);
//         }
//         return res;
//     }
// }

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; ++i) {
            Integer[] temp = new Integer[i + 1];
            Arrays.fill(temp, 1);
            ans.add(Arrays.asList(temp));
        }

        for (int i = 2; i < numRows; ++i)
            for (int j = 1; j < ans.get(i).size() - 1; ++j)
                ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));

        return ans;
    }
}
