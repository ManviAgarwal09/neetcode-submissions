class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        for(char C:s.toCharArray()){
            if(C=='('){
                st.push(')');
            }
            else if(C=='{'){
                st.push('}');}
                else if(C=='['){
                    st.push(']');
                }
                else{
                    if(st.isEmpty()||st.pop()!=C){
                        return false;
                    }
                }
            }
            return st.isEmpty();
        }
}