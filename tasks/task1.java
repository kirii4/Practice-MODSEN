import java.util.Scanner;

public class task1 {    // PalindromeNumber
    public static boolean isPalindrome(int x) {
        
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        if (isPalindrome(x)) {
            System.out.println(x + " является палиндромом.");
        } else {
            System.out.println(x + " не является палиндромом.");
        }

        scanner.close();
    }
}