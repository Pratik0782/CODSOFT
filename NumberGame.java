import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
    public static void main(String args[])
    {
        Random rno=new Random();
        Scanner sc=new Scanner(System.in);
        
        int no=rno.nextInt(100)+1;

        int guess=0;
        int attempt=0;

        System.out.println("Guess number between 1 to 100");
        while(guess!=no)
        {
            guess=sc.nextInt();
            attempt++;
            
            if(guess>no)
            {
                System.out.println("Too high");
            }
            else if(guess<no)
            {
                System.out.println("Too low");
            }
            else
            {
              System.out.println("Correct! You guess in "+attempt+"attemps");
            }
        }

    }
    
}