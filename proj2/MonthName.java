import java.util.*;
public class MonthName
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter month number:");
        int num=sc.nextInt();
        
        
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        if(num>0 && num<=12)
        {   
            System.out.println(num+":"+months[num-1]);
        }
        else
        System.out.println("invalid number");
    }
}