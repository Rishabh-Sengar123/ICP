import java.util.*;
class BC {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char lastSign = '+';
        s = s.replaceAll(" ", "");

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }

            if (!Character.isDigit(c) || i == s.length() - 1) {
                if (i == s.length() - 1 && Character.isDigit(c)) {
                    // ensures we handle the last number
                }

                if (lastSign == '+') {
                    stack.push(currentNumber);
                } else if (lastSign == '-') {
                    stack.push(-currentNumber);
                } else if (lastSign == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (lastSign == '/') {
                    stack.push(stack.pop() / currentNumber);
                }

                lastSign = c;
                currentNumber = 0;
            }
        }

        int result = 0;
        for (int num : stack) result += num;
        return result;
    }
}
