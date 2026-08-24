class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, len = 0, maxf = 0;
        int[] freq = new int[26];
        for(int r=0; r<s.length(); r++){
            int window = r-l+1;
            int curr = s.charAt(r)-'A';
            freq[curr]++;
            maxf = Math.max(maxf, freq[curr]);
            int req = window - maxf;
            if(req <= k){
                len = Math.max(len, window);
            }else{
                freq[s.charAt(l)-'A']--;
                l++;
            }
        }
        return len;
    }
}
