import java.util.*;
public class SmallestNumberinArray{
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
    int small=array[0];
    for(int i=1; i<len; i++)
    {
        if(small>array[i])
            small=array[i];
    }
    System.out.println("\n Smallest element is "+small);
}
}