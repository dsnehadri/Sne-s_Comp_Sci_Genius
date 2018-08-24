//This program will count the amount of digits in a given number as inputed
import java.util.Scanner;
public class DigitCounter
{
    public static void main(String args [])
    {
        System.out.println("Digit Counter 1.0 \n");
        System.out.print("Please input an integer. ");
        Scanner input = new Scanner (System.in);
        int number = input.nextInt();
        int digitCount = 1;
            while (number >= 10 || number <= -10 )
            {
            number = number/10 ;
            ++digitCount;}
       System.out.println("There are " + digitCount + " digits in your integer.");
        }
        
    }
  