class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i=0, j= n-1;
        while(i<j){
            char cFront = s.charAt(i);
            char cRear = s.charAt(j);
            if(!Character.isLetterOrDigit(cFront))i++;
            else if(!Character.isLetterOrDigit(cRear))j--;
            else{
                if(Character.toLowerCase(cFront)!=Character.toLowerCase(cRear)) return false;
                i++;
                j--;
            }
        }
        return true;
    }
}
