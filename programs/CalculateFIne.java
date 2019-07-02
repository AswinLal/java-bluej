import java.util.*;
public class CalculateFine{
public static void main()
{
    Scanner sc = new Scanner(System.in);
    int num,fine=0;
    System.out.println("enter the number of days: ");
    num=sc.nextInt();
    if(num<=10)
    {
        fine+=num*1;
    }
    else if(num<=30)
    {   fine+=(num-10)*2+(10*1);
    }
    else
    {   fine+=(num-30)*3+(20*2)+(10*1);
    }
    System.out.println("total fine for "+num+" days is "+fine+" rupees");
}




}