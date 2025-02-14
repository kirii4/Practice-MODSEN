import java.util.Stack;
import java.util.Scanner;

public class task8 {     // ValidParentheses
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': 
                case '{': 
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите строку скобок: ");
        String s = scanner.nextLine();

        boolean isValid = isValid(s);
        System.out.println("Строка скобок корректна? " + isValid);
        
        scanner.close();
    }
}