import java.util.Scanner;

public class MenuDrivenProgram
{

    public static void displayMenu()
    {
        System.out.println("Menu: ");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    public static void greetUser()
    {
        System.out.println("Hello! Welcome!");
    }

    public static void checkEvenOrOdd()
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = userInputScanner.nextInt();

        if(number % 2 == 0)
        {
            System.out.println(number + " is an Even number.");
        }
        else
        {
            System.out.println(number + " is an Odd number.");
        }
    }

    public static boolean handelMenuChoice(int choice)
    {
        switch (choice) 
        {
            case 1:
                greetUser();
                return true;
            case 2:
                checkEvenOrOdd();
                return true;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                return false;
            default:
                System.out.println("Invalid input, input must be 1 to 3.");
                return true;
        }
    }

    public static void main(String[] args) 
    {   
        Scanner input = new Scanner(System.in);
        int choice;
        boolean continueLoop = true;

        do
        {
            displayMenu();
            choice = input.nextInt();
            continueLoop = handelMenuChoice(choice);
        }while(continueLoop);

        input.close();
    }    
}
