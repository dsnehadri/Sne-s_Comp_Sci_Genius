// This is a program to calculate how many batches 
// of lemonade you can create using a given amount of
// lemons and the total cost to you.

import java.util.Scanner;

public class Lemons
{
    public static void main(String args[])
    {
        System.out.println();
        System.out.println("Lemonade Calculator 1.0");
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many lemons are you buying? ");
        double number = input.nextDouble();
        System.out.print("\nWhat is the price per pound? ($/lb) ");
        double price = input.nextDouble();
        double beforecups = Math.round((number/4.5)*100);
        double cups = beforecups/100;
        double lbs = number/4;
        double beforecost = Math.round(100*(lbs*price));
        double cost = beforecost/100;
        double servings = Math.floor(cups*6);
        System.out.println("You will recieve " + cups + " cups of lemons juice.");
        System.out.println("This will serve " + servings + " people.");
        System.out.println("The total cost will be $" + cost + ".");
    }
}
        