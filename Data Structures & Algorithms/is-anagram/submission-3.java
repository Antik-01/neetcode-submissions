class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> sfreq = new HashMap<>();
        Map<Character, Integer> tfreq = new HashMap<>();

        for(char ch : s.toCharArray()){
            sfreq.put(ch, sfreq.getOrDefault(ch, 0)+1);
        }
        for(char ch : t.toCharArray()){
            tfreq.put(ch, tfreq.getOrDefault(ch, 0)+1);
        }
        for(char ch : sfreq.keySet()){
            if(!sfreq.get(ch).equals(tfreq.get(ch))) return false;
        }
        for(char ch : tfreq.keySet()){
            if(!tfreq.get(ch).equals(sfreq.get(ch))) return false;
        }
        return true;
    }
}
