import java.util.*;
public class SpyNumber{
public static void main()
{
    Scanner sc= new Scanner(System.in);
    System.out.println("\n enter a number: ");
    int num=sc.nextInt();
    int sum=0,product=1,n,digit;
    n=num;
    while(n>0)
    {
        digit=n%10;
        sum+=digit;
        product*=digit;
        n=n/10;
    }
    if(sum==product)
    System.out.println(num+" is a spy number");
    else
    System.out.println(num+" is not a spy number");
   
}
}