package string.assignment_problems;
import java.util.Scanner;
public class Problem2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        String result = reverseEachWord(sentence);
        System.out.println("Reversed sentence: " + result);
    }
    public static String reverseEachWord(String sentence)
    {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++)
        {
            StringBuilder word = new StringBuilder(words[i]);
            result.append(word.reverse());
            if(i < words.length - 1)
            {
                result.append(" ");
            }
        }
        return result.toString();
    }
}