class Solution {
    public String reverseParentheses(String s) {

        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder str = new StringBuilder();

        for(char ch : s.toCharArray()){

            if(ch == '('){
                stack.push(str);
                str = new StringBuilder();

            } 
            else if(ch == ')'){

                str.reverse();

                StringBuilder prev = stack.pop();

                prev.append(str);
                str = prev;

            } 
            else{
                str.append(ch);
            }
        }

        return str.toString();
    }
}