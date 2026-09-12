package string.assignment_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5
{
    static int[] rotateArray(int[] nums, int k)
    {
        k = k % nums.length;

        int[] newArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            newArray[(i + k) % nums.length] = nums[i];
        }

        return newArray;
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

        System.out.print("Enter the number of positions to rotate: ");
        int k = scanner.nextInt();

        System.out.println(Arrays.toString(rotateArray(nums, k)));
    }
}