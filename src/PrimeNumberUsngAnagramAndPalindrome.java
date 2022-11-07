import java.util.Scanner;

public class PrimeNumberUsngAnagramAndPalindrome {
    public static void main(String args[])
    {
        int s1, s2, s3, flag = 0, i, j;
        Scanner s = new Scanner(System.in);
        System.out.println ("Enter the lower limit :");
        s1 = s.nextInt();
        System.out.println ("Enter the upper limit :");
        s2 = s.nextInt();
        System.out.println ("The prime numbers in between the entered limits are :");
        for(i = s1; i <= s2; i++)
        {
            for( j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                System.out.println(i);
            }
        }
        //to find if its Anagram
        {
            System.out.println("To find if Entered Number is Anagram");
            System.out.println("Enter any Prime Number: ");
            int a = s.nextInt();
            System.out.println("Enter any Prime Number:");
            int b = s.nextInt();
            if (areAnagrams(a, b))
                System.out.println("It is Anagram");
            else
                System.out.println("It's not Anagram");
        }
        //to find if its Palindrome
        palindrome();
    }
    static final int TEN = 10;

    // Function to update the frequency array
    // such that freq[i] stores the
    // frequency of digit i in n
    static void updateFreq(int n, int [] freq)
    {

        // While there are digits
        // left to process
        while (n > 0)
        {
            int digit = n % TEN;

            // Update the frequency of
            // the current digit
            freq[digit]++;

            // Remove the last digit
            n /= TEN;
        }
    }

    // Function that returns true if a and b
    // are anagarams of each other
    static boolean areAnagrams(int a, int b)
    {

        // To store the frequencies of
        // the digits in a and b
        int [] freqA = new int[TEN];
        int [] freqB = new int[TEN];

        // Update the frequency of
        // the digits in a
        updateFreq(a, freqA);

        // Update the frequency of
        // the digits in b
        updateFreq(b, freqB);

        // Match the frequencies of
        // the common digits
        for (int i = 0; i < TEN; i++)
        {

            // If frequency differs for any digit
            // then the numbers are not
            // anagrams of each other
            if (freqA[i] != freqB[i])
                return false;
        }
        return true;
    }
    public static void palindrome() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("To find if Entered Number is Palindrome");
        System.out.println("Enter any Prime Number: ");
        int num = s1.nextInt();
        int reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = num;

        // get the reverse of originalNum
        // store it in variable
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}