class Solution {
    public String mergeAlternately(String word1, String word2) {
        // char[] res = new char[word1.length()+word2.length()];
        StringBuilder res = new StringBuilder();
        int w1 = 0, w2 = 0;

        while (w1 < word1.length() && w2 < word2.length()) {
            res.append(word1.charAt(w1++));
            res.append(word2.charAt(w2++));
        }
        while (w1 < word1.length()) {
            res.append(word1.charAt(w1++));
        }
        while (w2 < word2.length()) {
            res.append(word2.charAt(w2++));
        }
        return res.toString();
    }
}