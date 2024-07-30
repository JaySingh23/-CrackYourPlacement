import java.util.Stack;

public class Paranthesis {
    public static void main(String[] args) {
        String str = "(())";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if(stack.isEmpty())
                return false;
            else if(ch == ')' && stack.pop()!='(')
                return false;
            else if(ch == '}' && stack.pop()!='}')
                return false;
            else if(ch == ']' && stack.pop()!=']')
                return false;    
        }
        return true;
    }
    
}
