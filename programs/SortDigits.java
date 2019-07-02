    import java.util.Scanner;

    public class SortDigits

    {
        public static void main() 
        {

            int temp;

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number:");

            
            
            int num=sc.nextInt();
            
            int n=num,dig,i=0,len=0;
            int a[] = new int[n];

            while(n>0)
            {
                dig=n%10;
                a[i]=dig;
                n=n/10;
                len+=1;
                i++;
                
            }
            for (i = 0; i < len; i++) 
            {
                for (int j = i + 1; j < len; j++) 
                {
                    if (a[i] > a[j]) 
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }          
             int result=0;   
            for (i = 0; i < len; i++)
            {
                result=result*10+a[i];                
            }
            System.out.println("number after sorting the digits is "+result);
        }
    }