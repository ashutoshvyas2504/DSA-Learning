class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack <>();
        int n = num.length();

      for(int i = 0; i<n ; i++){
        char ch = num.charAt(i);

        while(!st.isEmpty() && st.peek()> ch && k > 0){
            st.pop(); 
            k--;
        }
        st.push(ch);
      }
      while(k>0){
        st.pop();
        k--;
      }

      String ans = "";
      for(char ch : st){
        if(ch!= '0' || ans.length() != 0){
            ans+= ch;
        }
        
      }
      // used terniary operator for "0" 
        return ans.isEmpty() ? "0" : ans;
    }
}