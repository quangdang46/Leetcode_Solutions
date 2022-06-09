class Solution {
    public boolean checkIfExist(int[] arr) {
        // Array to ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        // Check if there are two numbers that are the same
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) * 2 == 0) {
                list.remove(0);
                if(list.contains(0)) {
                    return true;
                }
                list.add(0);
            }
            if (list.contains(list.get(i) * 2)) {
                return true;
            }
        }
        return false;
    }
}