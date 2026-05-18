class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        
        int max = 0;
        int l =0 ;
        int maxf = 0;
        for(int r=0; r<s.length(); r++){
            int window = r-l+1;
            freq[s.charAt(r)-'A']++;
            maxf = Math.max(maxf, freq[s.charAt(r)-'A']);
            int req = window - maxf;
            if(req <= k){
                max = Math.max(max, window);
            }
            else{
               freq[s.charAt(l)-'A']--;
                l++; 
            }
        }
        return max;
    }
}
