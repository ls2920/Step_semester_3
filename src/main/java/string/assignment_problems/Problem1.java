package string.assignment_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1
{
    static int[] twoSum(int[] nums, int target)
    {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++)
        {
            nums[i] = scanner.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = scanner.nextInt();

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}