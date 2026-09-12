package string.assignment_problems;

import java.util.Scanner;

public class Problem4
{
    private static double rowAverage(int[] row)
    {
        int sum = 0;

        for (int i = 0; i < row.length; i++)
        {
            sum += row[i];
        }

        return (double) sum / row.length;
    }

    static String classifyMatches(int[][] runsPerOver, int threshold)
    {
        String result = "";

        for (int i = 0; i < runsPerOver.length; i++)
        {
            double average = rowAverage(runsPerOver[i]);

            if (average >= threshold)
            {
                result += "Match " + i + ": Power Surge";
            }
            else
            {
                result += "Match " + i + ": Normal";
            }

            if (i < runsPerOver.length - 1)
            {
                result += " | ";
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of matches: ");
        int matches = scanner.nextInt();

        int[][] runsPerOver = new int[matches][];

        for (int i = 0; i < matches; i++)
        {
            System.out.print("Enter number of overs for match " + i + ": ");
            int overs = scanner.nextInt();

            runsPerOver[i] = new int[overs];

            System.out.println("Enter runs for match " + i + ":");

            for (int j = 0; j < overs; j++)
            {
                runsPerOver[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter the threshold: ");
        int threshold = scanner.nextInt();

        System.out.println(classifyMatches(runsPerOver, threshold));
    }
}