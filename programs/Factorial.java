import java.util.*;
class Factorial{  
 public static void main(){  
  int i,fact=1;  
  Scanner sc = new Scanner(System.in);
  System.out.printf("enter number: ");
  int number = sc.nextInt();
      
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  