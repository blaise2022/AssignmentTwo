import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //add more variables, at least 2 of each type:
        //double, float, short, String

        //Doubles:
         System.out.print("How many miles away is it? ");
         double distance = keyboard.nextDouble();

        keyboard.nextLine();

        System.out.print("How many kilometers away is it? ");
         double kilos = keyboard.nextDouble();

        keyboard.nextLine();

        //Strings:
        System.out.print("What is your favorite color? ");
        String draw = keyboard.nextLine();

        System.out.print("What is your favorite city? ");
        String city = keyboard.nextLine();

        //Integers:
        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        keyboard.nextLine();

        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        keyboard.nextLine();

        //Shorts
        System.out.print("How many feet is the plane in the air (the max is 29999) ");
        short plane = keyboard.nextShort();

        keyboard.nextLine();

        System.out.print("How many miles away is Post Texas? (the max is 29999) ");
        short houston = keyboard.nextShort();

        keyboard.nextLine();

        //Floats
        System.out.print("How many degrees is it Lubbock? ");
        float lubbock = keyboard.nextFloat();

        keyboard.nextLine();

        System.out.print("How many degrees is it Dallas? ");
        float dallas = keyboard.nextFloat();








        //add in input for all variables

        System.out.println();
        System.out.println("It is " + distance + " miles away.");
        System.out.println("It is " + kilos + " kilometers away.");
        System.out.println("Your favorite color is " + draw +".");
        System.out.println("Your favorite city is " + city +".");
        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo);
        System.out.println("The plane is " + plane +" feet in the air.");
        System.out.println("Houston is " + houston +" miles away.");
        System.out.println("It is " + lubbock + " degrees in Lubbock.");
        System.out.println("It is " + dallas + " degrees in Dallas.");







    }
}

        //add output for all variables

