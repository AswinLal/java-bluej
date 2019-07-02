import java.util.*;
public class AnnualSalTax
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the monthly salary amount:");
        double monthlysalary=sc.nextDouble();
        double annualsalary;
        annualsalary=monthlysalary*12;
        System.out.println("annualsalary is "+annualsalary);
        if(annualsalary>300000)
        System.out.println("Employee is a tax payer");
        else
        System.out.println("Employee is not a tax payer");
    }
    
}