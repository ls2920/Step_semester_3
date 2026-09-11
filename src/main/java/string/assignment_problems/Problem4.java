package string.assignment_problems;
import java.util.Scanner;
public class Problem4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ISBN code: ");
        String rawCode = sc.nextLine();
        String normalizedCode = normalizeCode(rawCode);
        validateAndFormat(normalizedCode);
    }
    public static String normalizeCode(String code)
    {
        code = code.trim();
        if(code.length() < 3)
        {
            return code.toUpperCase();
        }
        String publisher = code.substring(0, 3).toUpperCase();
        String remaining = code.substring(3);
        return publisher + remaining;
    }
    public static void validateAndFormat(String code)
    {
        if(code.length() != 13)
        {
            System.out.println("Invalid ISBN — wrong length.");
            return;
        }
        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7);
        for(int i = 0; i < publisher.length(); i++)
        {
            if(!Character.isLetter(publisher.charAt(i)))
            {
                System.out.println("Invalid ISBN — publisher code must contain letters.");
                return;
            }
        }
        for(int i = 0; i < year.length(); i++)
        {
            if(!Character.isDigit(year.charAt(i)))
            {
                System.out.println("Invalid ISBN — body must contain digits.");
                return;
            }
        }
        for(int i = 0; i < catalog.length(); i++)
        {
            if(!Character.isDigit(catalog.charAt(i)))
            {
                System.out.println("Invalid ISBN — body must contain digits.");
                return;
            }
        }
        System.out.println("[" + publisher + "] YEAR: " + year + " | CATALOG: " + catalog);
    }
}