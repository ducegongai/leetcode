import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> left_char_stack =  new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                left_char_stack.push(s.charAt(i));
            }
            else{
                if(left_char_stack.empty()){
                    return false;
                }
                char tmp = left_char_stack.peek();
                if((tmp=='('&&s.charAt(i)==')')||(tmp=='['&&s.charAt(i)==']')||(tmp=='{'&&s.charAt(i)=='}')){
                    left_char_stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(!left_char_stack.empty())
            return false;
        return true;
    }
}