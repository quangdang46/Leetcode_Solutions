class Solution {
    public int mostWordsFound(String[] sentences) {
        int max_len = 0;
        for (String s : sentences) {
            max_len = Math.max(max_len, s.split(" ").length);
        }
        return max_len;
    }
}

class Solution {
    public int mostWordsFound(String[] sentences) {

        int max = 0;

        for (int i = 0; i < sentences.length; i++) {
            int cnt = count(sentences[i]);

            if (max < cnt) {
                max = cnt;
            }
        }

        return max;
    }

    public static int count(String str) {
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

}