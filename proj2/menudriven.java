import java.util.*;
import java.lang.Math;
public class menudriven{
public static void main()
{
    Scanner sc = new Scanner(System.in);
    System.out.println("\n enter a number: ");
    int num= sc.nextInt();
    while(true)
    {
    System.out.println("\n entered number: "+num);    
    System.out.println("\n Menu \n 1. check for perfect square ");
    System.out.println(" 2. Palindrome \n 3. Smallest digit \n 4. Exit\n enter option:");
    int option= sc.nextInt();
    if(option==1)
    {
        int sqroot=(int)(Math.sqrt(num));
        if(sqroot*sqroot==num)
        {System.out.println(num+" is a perfect square");
        }
        else
        System.out.println(num+" is not a perfect square");
            
        
    }
    else if(option==2)
    {
      int n=num,digit,rev=0;
        while(n>0)  
    {  
    digit=n%10;  
    n=n/10;  
    rev=rev*10+digit;  
    }  
     if(rev==num)
     System.out.println(num+" is a palindrome");
     else
     System.out.println(num+" is not a palindrome");
    }
    else if(option==3)
    {
        int n=num,digit,small;
        small=n%10;
        while(n>0)  
    {  
        
    digit=n%10;  
    if(digit<small)
        small=digit;
    n=n/10;
     }
    System.out.println("smallest digit in "+num+" is "+small); 

        
        
    }
    else
       break;
    
    
    }
}
}