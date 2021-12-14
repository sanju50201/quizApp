package quizpackage;

import java.util.Scanner;

public class quiz2
{
    public static void main(String[] args)
    {
        int n;
        while ( true )
        {
            System.out.println("Who is the CEO of Micrsoft?");
            System.out.println("1.Nadela\n2.Sundar Pichai\n3.Jeff Bezoz\n4.Elon Musk\n5.Exit the quiz");
            Scanner obj = new Scanner(System.in);
            System.out.println("Please provide the answer below(1,2,3,4,5)");
            n = obj.nextInt();
            if(n == 1 )
            {
                System.out.println("Congrats, the answer is correct");
                break;
            }
            else if( n == 5)
            {
                break;
            }
            else
            {
                System.out.println("You didn't answer that correctly, Better luck on the next one");
            }
        }
    }
}
