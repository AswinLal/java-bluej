import java.util.*;
public class menudriven2{

    public static void main()
    {
        int option,num,i;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.println("\n Menu \n 1. generate divisors \n 2. LCM of 2 numbers");
        System.out.println("3. Average of 3 numbers \n 4. exit \n enter option:");
        option = sc.nextInt();
        if(option==1)
        {
            System.out.println("Enter Number:");
            num=sc.nextInt();
            System.out.println("Divisors are :");
            for(i=1;i<=num;i++)
            {
                if(num%i==0)
                System.out.print(i+"  ");
            }
            
        }
        
        
        
        else if(option==2)
        {
            System.out.println("enter 2 numbers to find LCM");
            int n1,n2,lcm;
            n1=sc.nextInt();
            n2=sc.nextInt();
            if(n1>n2)
            lcm=n1;
            else 
            lcm=n2;
            while(true)
            {
                if( lcm % n1 == 0 && lcm % n2 == 0 )
                {
                System.out.println("The LCM of "+n1+" and "+n2+" is "+lcm);
                break;
                }
                ++lcm;
            }
        }
        
        
        
        
        else if(option==3)
        {
            System.out.println("Enter three numbers:");
            double a,b,c;
            double avg;
            a=sc.nextDouble();
            b=sc.nextDouble();
            c=sc.nextDouble();
            avg=(a+b+c)/3;
            System.out.println("Average of "+a+","+b+" and "+c+" is "+avg);
            
        }
        else
        break;
        }   
    }
}