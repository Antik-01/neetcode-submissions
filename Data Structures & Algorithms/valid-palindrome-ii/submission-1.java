class Solution {
    public boolean validPalindrome(String s) {
        char[] sArr = s.toCharArray();
        int i = 0, j = sArr.length - 1;
        while (i < j) {
            if (sArr[i] != sArr[j]) {
                return isPalindrome(sArr, i+1, j) || isPalindrome(sArr, i, j-1);
            }
            i++;
            j--;
        }
        return true;
    }
    private boolean isPalindrome(char[] sArr, int i, int j){
        while(i<j){
            if(sArr[i++]!=sArr[j--]) return false;
        }
        return true;
    }
}