import java.util.Stack;

public class BalancedParenthesis {

    static boolean isBalanced(String brackets) {
        Stack<Character> stack = new Stack<>();
        for (char e : brackets.toCharArray()) {
            if (e == '{')
                stack.add('{');
            else {
                if (stack.isEmpty() || stack.peek() == '}')
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String curlyBrackets = "{}{{}}{}}";
        boolean isValid = isBalanced(curlyBrackets);
        System.out.println(isValid);
    }
}
