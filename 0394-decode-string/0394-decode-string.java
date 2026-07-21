class Solution {
    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> mainStack = new Stack<>();

        int num = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            } 
            else if(ch == '['){
                numberStack.push(num);
                num = 0;
                mainStack.push(ch + "");
            } 
            else if(ch != ']'){
                mainStack.push(ch + "");
            } 
            else {
                String str = "";

                while(!mainStack.peek().equals("[")){
                    str = mainStack.pop() + str;
                }

                mainStack.pop();

                int repetationNumber = numberStack.pop();

                StringBuilder sb = new StringBuilder("");

                while(repetationNumber > 0){
                    sb.append(str);
                    repetationNumber--;
                }

                mainStack.push(sb.toString());
            }
        }

        StringBuilder ans = new StringBuilder("");

        while(mainStack.size() > 0){
            ans.insert(0, mainStack.pop());
        }

        return ans.toString();
    }
}