import java.util.Scanner;

public class task6 { // MaximumSubarray
    public static int maxSubArray(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
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

        int maxSum = maxSubArray(nums);
        System.out.println("Максимальная сумма подмассива: " + maxSum);
        
        scanner.close();
    }
}