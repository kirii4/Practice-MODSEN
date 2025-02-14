import java.util.HashSet;
import java.util.Scanner;

public class task4 { // ContainsDuplicate
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            
            if (seen.contains(num)) {
                return true;
            }
            
            seen.add(num);
        }
        
        return false;
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

        boolean hasDuplicates = containsDuplicate(nums);
        System.out.println("Содержит ли массив дубликаты? " + hasDuplicates);
        
        scanner.close();
    }
}