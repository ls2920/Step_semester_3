package string.assignment_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1
{
    static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex)
    {
        playerScores[captainIndex] = playerScores[captainIndex] * 2;
        playerScores[viceCaptainIndex] = playerScores[viceCaptainIndex] * 1.5;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();

        double[] playerScores = new double[n];

        System.out.println("Enter the player scores:");

        for (int i = 0; i < n; i++)
        {
            playerScores[i] = scanner.nextDouble();
        }

        System.out.print("Enter captain index: ");
        int captainIndex = scanner.nextInt();

        System.out.print("Enter vice-captain index: ");
        int viceCaptainIndex = scanner.nextInt();

        applyMultipliers(playerScores, captainIndex, viceCaptainIndex);

        System.out.println(Arrays.toString(playerScores));
    }
}