import java.util.Scanner;

public class task5 { // SearchInsertPosition
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Введите элементы массива (целые числа, отсортированные и уникальные):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Введите целевое значение: ");
        int target = scanner.nextInt();

        int position = searchInsert(nums, target);
        System.out.println("Позиция для вставки: " + position);
        
        scanner.close();
    }
}