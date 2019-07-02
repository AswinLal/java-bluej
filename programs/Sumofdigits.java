import java.util.*;

public class Sumofdigits {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n enter the number:");
        int n= sc.nextInt();
        int sum=0,i;
        i=n;
        while(i>0)
        {
            sum=sum+i%10;
            i=i/10;
            
        }
        System.out.println("\n sum of digits of the given number "+n+" is "+sum);
    }
}
    