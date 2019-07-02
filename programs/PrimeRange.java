import java.util.*;

public class PrimeRange{    
 public static void main(){    
  int i,m=0,flag=0;     
  Scanner sc = new Scanner(System.in);
  System.out.printf("\n enter lower limit a: ");
  int a = sc.nextInt(); 
  System.out.printf("\n enter upper limit b: ");
  int b = sc.nextInt(); 
  for(int n=a;n<=b;n++)
  {
  flag=0; 
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number \n");      
  }else{  
      for(i=2;i<=m;i++){      
          if(n%i==0){      
              System.out.println(n+" is not prime number \n");      
              flag=1;      
              break;      
            }      
        }      
   if(flag==0)  { System.out.println(n+" is prime number \n"); }  
        }
  } 
}    
}   