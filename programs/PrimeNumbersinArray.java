import java.util.*;
public class PrimeNumbersinArray{
public static void main (){
    int[] array = new int [100];
    Scanner in = new Scanner (System.in);
    int count=0,k;
    System.out.println("Enter the length of the array: ");
    int len=in.nextInt();
    System.out.println("\n Enter the elements of the array: ");
    for(int i=0; i<len; i++)
    {
        array[i] = in.nextInt();
    }
    System.out.println("prime numbers if any are : \n");

    for(int i=0; i<len; i++){
        boolean isPrime = true;
        k=array[i];

        
        for (int j=2; j<k; j++){

            if(k%j==0){
                isPrime = false;
                break;
            }
        }
     
        if(isPrime)
            {
           System.out.println(k + " ");
            count=count+1;
        }
        }
        
        System.out.println("\n The number of prime numbers in the array is "+count);
}
}