import java.util.Scanner;
class Vowel
{
   public static void main() throws Exception
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a character : ");
	char ch=sc.next().charAt(0); 
	
    char ch=Character.toUpperCase(ch);
    if(ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch =='U') 
       System.out.println("It is a Vowel");
	
    else if((ch != 'A'||ch != 'E'||ch != 'I'||ch != 'O'||ch != 'U')&& Character.isLetter(ch)==true)
        System.out.println("It is a Consonant.");
    else 
        System.out.println("It is a Special Character.");
	
	
	

    }   
}
