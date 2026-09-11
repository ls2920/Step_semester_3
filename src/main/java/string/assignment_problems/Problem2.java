package string.assignment_problems;
import java.util.Scanner;
public class Problem2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        classifyNumber(number);
    }
    public static void classifyNumber(int number)
    {
        if(number > 0)
        {
            System.out.println("Positive");
        }
        else if(number < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}