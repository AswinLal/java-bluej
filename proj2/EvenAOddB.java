import java.util.*;
public class EvenAOddB
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array:");
        int n=sc.nextInt();
        System.out.println("enter the elements of the array:");
        int[] arr;
        arr=new int[100];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] A,B;
        A=new int[50];
        B=new int[50];
        int j=0,k=0,lenA=0,lenB=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                A[j]=arr[i];
                lenA++;
                j++;
            }
            else
            {
                B[k]=arr[i];
                lenB++;
                k++;
            }
        }
        System.out.println("Even numbers in array A:");
        for(j=0;j<lenA;j++)
        {   
            System.out.print(A[j]+"  ");
        }
        System.out.println("\n Odd numbers in array B:");
        for(j=0;j<lenB;j++)
        {   
            System.out.print(B[j]+"  ");
        }
    }
}