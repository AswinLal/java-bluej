import java.io.*;

public class SpecialWord

    {

    public static void main()throws IOException

        {

            BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

            System.out.print("Enter any sentence: ");

            String s=br.readLine();

            s = s+" ";

            int l=s.length();

            int pos=0;

            char ch1, ch2;

            String w;

            for(int i=0; i<l; i++)

            {

                ch1 = s.charAt(i);

                if(ch1 == ' ')

                {

                    w = s.substring(pos,i); 

                    ch2 = w.charAt(0);
                    int lenw=w.length();
                    char ch3;
                    ch3 =w.charAt(lenw-1); 
                    if(ch2==ch3)
                    {

                        System.out.println(w);

                    }

                    pos = i+1;

                }

            }

        }

    }

