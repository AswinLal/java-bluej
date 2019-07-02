import java.util.*;
public class Pattern1{
public static void main()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("\n enter the number of rows:");
    int num=sc.nextInt();
    for(int i=1;i<=num;i++)
    {
        for(int j=0;j<i;j++)
        {
            if(j%2==0)
            System.out.print("*"+" ");
            else
            System.out.print("@"+" ");
        }
        System.out.print("\n");
        
    }
    
    
}

}