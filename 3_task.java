// Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.

import java.util.Stack;

class J7 {

    public static int prec(char c) {

        if (c == '*' || c == '/') {
            return 3;
        }

        if (c == '+' || c == '-') {
            return 4;
        }

        if (c == '&') {
            return 8;
        }

        if (c == '^') {
            return 9;
        }

        if (c == '|') {
            return 10;
        }

        return Integer.MAX_VALUE;
    }

    public static boolean isOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }

    public static String infixToPostfix(String infix) {

        if (infix == null || infix.length() == 0) {
            return infix;
        }

        Stack<Character> s = new Stack<>();

        String postfix = "";

        for (char c : infix.toCharArray()) {

            if (c == '(') {
                s.add(c);
            }

            else if (c == ')') {

                while (s.peek() != '(') {
                    postfix += s.pop();
                }
                s.pop();
            }

            else if (isOperand(c)) {
                postfix += c;
            }

            else {

                while (!s.isEmpty() && prec(c) >= prec(s.peek())) {
                    postfix += s.pop();
                }

                s.add(c);
            }
        }

        while (!s.isEmpty()) {
            postfix += s.pop();
        }

        return postfix;
    }

    public static void main(String[] args) {
        String infix = "A*(B*C+D*E)+F";

        String postfix = infixToPostfix(infix);
        System.out.println(postfix);
    }
}
