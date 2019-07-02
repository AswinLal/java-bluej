import java.util.*;
public class NivenNumber{
public static void main()
{
    Scanner sc= new Scanner(System.in);
    System.out.println(" enter the number:");
    int num = sc.nextInt();
    int n=num,dig,sumdig=0;
    while(n>0)
    {
        dig=n%10;
        sumdig+=dig;
        n=n/10;
        
    }
    if(num%sumdig==0)
    System.out.println(num+" is a Niven number");
    else
    System.out.println(num+" is not a Niven number");
}
}
