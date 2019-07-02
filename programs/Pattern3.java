import java.util.*;
public class Pattern3{
public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("\n enter the number of rows:");
    int num=sc.nextInt();
    for(int i=num;i>0;i--)
    {   if(i%2==0)
        {
        for(int j=0;j<i;j++)
            {           
            System.out.print("P");
            }
        }
        else
        for(int j=0;j<i;j++)
            {           
            System.out.print("0");
            }
        
        System.out.print("\n");
        
    }
        
}

}