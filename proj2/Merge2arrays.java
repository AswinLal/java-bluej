import java.util.*;
public class Merge2arrays{
public static void main()
{   
   
    int[] array1 = new int [100];
    int[] array2 = new int [100];
    int[] array3 = new int [200];
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the length of the array1: ");
    int len1=sc.nextInt();    
    System.out.println("\n Enter the elements of the array1: ");
    for(int i=0; i<len1; i++)
    {
        array1[i] = sc.nextInt();
    }
    System.out.println("Enter the length of the array2: ");
    int len2=sc.nextInt();
    
    System.out.println("\n Enter the elements of the array: ");
    for(int i=0; i<len2; i++)
    {
        array2[i] = sc.nextInt();
    }
    
    //System.out.println("\n Merged Array is : \n");
    for(int i=0; i<len1; i++)
    {
        array3[i] = array1[i];
    }
    for(int i=len1,j=0;j<len2;j++,i++)
    {
        array3[i]=array2[j];
    }
    int len3;
    len3=len1+len2;
    System.out.println("merged array of size "+len3+ " is");
    for(int i=0; i<len3; i++)
    {
        System.out.print(array3[i] +" ");
    }
    
    
    
}


}