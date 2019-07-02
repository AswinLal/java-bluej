import java.util.*;
public class Pattern2{
public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("\n enter the number of columns:");
    int num=sc.nextInt();
    for(int i=1;i<=num;i++)
    {
        for(int j=0;j<i;j++)
        {           
            System.out.print("1");
        }
        System.out.print("  ");
        
    }
        
}

}