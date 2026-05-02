class Solution {
    public String longestCommonPrefix(String[] strs) {
        // StringBuilder res = new StringBuilder();
        // for(int i=0; i<strs[0].length(); i++){
        //     for(String str : strs){
        //         if(i==str.length() || str.charAt(i) != strs[0].charAt(i))
        //             return res.toString();
        //     }
        //     res.append(strs[0].charAt(i));
        // }
        // return res.toString();
        String str0 = strs[0];  // takes the first string as base 
        for(int i=0; i<str0.length(); i++){  // iterates through entire len of first str
            for(int j=1; j<strs.length; j++){  // j iterates from 2nd to last str in every round
                if(i >= strs[j].length() || str0.charAt(i) != strs[j].charAt(i))
                    return str0.substring(0,i);
            }
        }
        return str0;
    }
}