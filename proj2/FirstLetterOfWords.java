import java.util.*;
public class FirstLetterOfWords
{
public static void main() 
    {
    char letter;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a sentence:");
    String x = sc.nextLine();
    String[] words = x.split(" ");
    for (int i = 0; i < words.length; i++)
        {
            String s = words[i];
            letter=s.charAt(0);
            letter = Character.toUpperCase(letter);
            System.out.print(letter);
        }
    }
}