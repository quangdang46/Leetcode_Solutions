class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String op : operations) {
            if (op.equals("X++") || op.equals("++X")) {
                result++;
            } else {
                result--;
            }
        }
        return result;
    }
}

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '-')
                x--;
            else
                x++;
        }
        return x;
    }
}