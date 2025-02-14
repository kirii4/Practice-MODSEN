import java.util.Scanner;

public class task3 { // SingleNumber
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Введите элементы массива (целые числа):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int single = singleNumber(nums);
        System.out.println("Число, которое появляется один раз: " + single);
        
        scanner.close();
    }
}