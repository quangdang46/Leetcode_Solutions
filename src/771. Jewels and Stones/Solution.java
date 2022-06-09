class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
        
    }
}


class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int amount = 0;
        
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) > -1) {
                amount++;
            }
        }

        return amount;
    }
}