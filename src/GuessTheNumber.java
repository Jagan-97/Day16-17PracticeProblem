import java.io.*;

import java.lang.*;

public class GuessTheNumber
{
    static public int ReadInteger()
    {
        try
        {
            String inpString = "";
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(input);
            String s = reader.readLine();
            return Integer.parseInt(s);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int x = (int)(Math.random() * 100);
        System.out.println("Welcome to Guess a Word Program (0-100) with in 5 attempts.\n");
        boolean bGuessedCorrectly = false;
        for (int i = 1; i <= 5; i++)
        {
            System.out.print("ATTEMPT " + i + ": Enter the your number: ");
            int n = ReadInteger();
            if (n == x)
            {
                System.out.println("Congrats! You have guessed the number correctly");
                bGuessedCorrectly = true;
                break;
            }
            int diff = (int)(Math.abs(x - n));
            boolean bMoveHigher = false;
            if(x > n)
                bMoveHigher = true;
            if(diff >= 50)
            {
                if (bMoveHigher == false)
                    System.out.println("Your guess is VERY HIGH");
                else
                    System.out.println("Your guess is VERY LOW");
            }
            else if (diff >= 30)
            {
                if (bMoveHigher == false)
                    System.out.println("Your guess is HIGH");
                else
                    System.out.println("Your guess is LOW");
            }
            else if (diff >= 15)
            {
                if (bMoveHigher == false)
                    System.out.println("Your guess is MODERATELY HIGH");
                else
                    System.out.println("Your guess is MODERATELY LOW");
            }
            else
            {
                if (bMoveHigher == false)
                    System.out.println("Your guess is SOMEWHAT HIGH");
                else
                    System.out.println("Your guess is SOMEWHAT LOW");
            }
        }
        if (bGuessedCorrectly == false)
        {
            System.out.println("Unfortunately you did not guess it correctly. The correct number is: " + x);
        }
    }
}