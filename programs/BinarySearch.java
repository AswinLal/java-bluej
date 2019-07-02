import java.util.*;
public class BinarySearch{
public static void main(){
Scanner sc = new Scanner(System.in);
System.out.println("enter the length of ordered array:");
int len=sc.nextInt();
System.out.println("enter the array in ascending order");

int i,u,l,mid,flag=0;
int[] array;
array = new int[100];

for(i=0;i<len;i++)
{
    array[i]=sc.nextInt();
}
System.out.println("enter the number to be searched:");
int num=sc.nextInt();
  
l=0;
u=len;
mid=(u+l)/2;
while(l<=u)
    {mid=(u+l)/2;
    if(num<array[mid])
    {
        u=mid-1;
    }
    else if(num>array[mid])
    {
        l=mid+1;
    }
    else
    {
        flag=1;
        break;
    }
    }
if(flag==0)
System.out.println(num+ " not found in array");
else
System.out.println(num+ " found in array at position "+(mid+1));
}
}