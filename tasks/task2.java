import java.util.HashMap;
import java.util.Scanner;

public class task2 { // TwoSum
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите элементы массива через пробел:");
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        
        System.out.println("Введите целевое число:");
        int target = scanner.nextInt();
        scanner.close();

        int[] result = twoSum(nums, target);
        System.out.println("Индексы: [" + result[0] + ", " + result[1] + "]");
    }
}