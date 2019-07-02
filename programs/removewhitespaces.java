import java.util.*;
public class RemoveWhitespaces
{
public static void main() 
    {
    char letter;
    String y="";
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a sentence:");
    String x = sc.nextLine();
    String[] words = x.split(" ");
    for (int i = 0; i < words.length; i++)
        {
            String s = words[i];
            y=y.concat(s);
        }
    System.out.println(y);    
    }
}