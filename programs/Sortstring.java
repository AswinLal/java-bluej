    import java.util.*;
    public class sortstring 
    {
        public static void main()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string : ");
            String userInput = sc.nextLine();
            char[] charArray = userInput.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                for (int j = i + 1; j < charArray.length; j++) {
                    if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {
                        char temp = charArray[i];
                        charArray[i] = charArray[j];
                        charArray[j] = temp;
                    }
                }
            }
            System.out.println("Sorted string " + String.valueOf(charArray));    
            int count[] = new int[256]; 
            String str=userInput;
            int len = str.length(); 
            for (int i = 0; i < len; i++) 
            count[str.charAt(i)]++; 
            char ch[] = new char[str.length()]; 
            for (int i = 0; i < len; i++) 
            { 
                ch[i] = str.charAt(i); 
                int find = 0; 
                for (int j = 0; j <= i; j++) 
                {
                    if (str.charAt(i) == ch[j])  
                    find++;                 
                } 
  
                if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + count[str.charAt(i)]);             
        }
       }
    }