import java.util.Scanner;
import java.util.Stack;

public class task9 {      // LongestValidParentheses
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку скобок: ");
        String s = scanner.nextLine();

        int length = longestValidParentheses(s);
        System.out.println("Длина самого длинного корректного подстроки скобок: " + length);
        
        scanner.close();
    }
}