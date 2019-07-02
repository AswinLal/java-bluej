import java.util.Scanner;
 
class FloydTriangle
{
  public static void main()
  {
    int n, num = 1, c, d;
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter the number of rows of Floyd's triangle to display");
    n = sc.nextInt();
 
    System.out.println("Floyd's triangle:");
 
    for (c = 1; c <= n; c++)
    {
      for (d = 1; d <= c; d++)
      {
        System.out.print(num+" ");
        num++;
      }
 
      System.out.println(); 
    }
  }
}

