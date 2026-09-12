package string.assignment_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5
{
    static class Player implements Comparable<Player>
    {
        private String name;
        private int matchesPlayed;
        private double battingAverage;
        private boolean injured;

        public Player(String name, int matchesPlayed, double battingAverage, boolean injured)
        {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        public int compareTo(Player other)
        {
            return Double.compare(other.battingAverage, this.battingAverage);
        }
    }

    static boolean isDraftable(int matchesPlayed)
    {
        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured)
    {
        return matchesPlayed >= 5 && !injured;
    }

    static String draftAndRank(Player[] players)
    {
        Player[] draftable = new Player[players.length];
        int count = 0;

        for (int i = 0; i < players.length; i++)
        {
            if (isDraftable(players[i].matchesPlayed) ||
                    isDraftable(players[i].matchesPlayed, players[i].injured))
            {
                draftable[count] = players[i];
                count++;
            }
        }

        Player[] result = Arrays.copyOf(draftable, count);

        Arrays.sort(result);

        String output = "";

        for (int i = 0; i < result.length; i++)
        {
            output += (i + 1) + ". " + result[i].name;

            if (i < result.length - 1)
            {
                output += " | ";
            }
        }

        return output;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();

        scanner.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter details for player " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Matches played: ");
            int matchesPlayed = scanner.nextInt();

            System.out.print("Batting average: ");
            double battingAverage = scanner.nextDouble();

            System.out.print("Injured (true/false): ");
            boolean injured = scanner.nextBoolean();

            scanner.nextLine();

            players[i] = new Player(name, matchesPlayed, battingAverage, injured);
        }

        System.out.println(draftAndRank(players));
    }
}