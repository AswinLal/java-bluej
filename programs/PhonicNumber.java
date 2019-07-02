import java.util.*;
public class PhonicNumber{
public static void main()
{
    int flag=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the number:");
    int num=sc.nextInt();
    for(int i=0,j=1;j<=num;j++,i++)
    {
        if(i*j==num)
        {flag=1;
         System.out.println(num+" is a Phonic number");
        }
    }
    if(flag==0)
    System.out.println(num+" is not a Phonic number");
    


}
}