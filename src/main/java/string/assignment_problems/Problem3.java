package string.assignment_problems;
import java.util.Scanner;
public class Problem3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter signal log: ");
        String signalLog = sc.nextLine();
        findLongestStreak(signalLog);
    }
    public static void findLongestStreak(String signalLog)
    {
        char longestSignal = signalLog.charAt(0);
        int longestCount = 1;
        int currentCount = 1;
        for(int i = 1; i < signalLog.length(); i++)
        {
            if(signalLog.charAt(i) == signalLog.charAt(i - 1))
            {
                currentCount++;
            }
            else
            {
                currentCount = 1;
            }
            if(currentCount > longestCount)
            {
                longestCount = currentCount;
                longestSignal = signalLog.charAt(i);
            }
        }
        System.out.println("Longest Streak: '" + longestSignal + "' repeated " + longestCount + " times");
    }
}