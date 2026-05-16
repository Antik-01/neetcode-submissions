class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
            for(String s : ops){
                if(s.equals("+")){
                    int x = st.pop();
                    int y = st.pop();
                    st.push(y);
                    st.push(x);
                    st.push(x+y);
                }
                else if(s.equals("C")){
                    st.pop();
                }
                else if(s.equals("D")){
                    int x = st.pop();
                    st.push(x);
                    st.push(x*2);
                }
                else{
                    int x = Integer.parseInt(s);
                    st.push(x);
                }
            }
        int score = 0;
        for(int x : st){
            score += x;
        }
        return score;
    }
}