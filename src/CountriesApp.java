import java.util.Scanner;

/**
 * Created by Megan on 4/24/2017.
 */
public class CountriesApp {

    public static int selectMenuOption() {
        Scanner scan = new Scanner(System.in);
        int userInput;
        do {
            System.out.println("Please select one of the following options: ");
            System.out.println("1 - Display a list of countries");
            System.out.println("2 - Add a country");
            System.out.println("3 - Exit");
            userInput = scan.nextInt();

            if (userInput == 1){
                CountriesTextFile.readFromFile();
            } else if (userInput == 2){
                CountriesTextFile.writeToFile();
                System.out.println("This country has been saved!");
            } else if (userInput == 3) {
                System.out.println("Goodbye!");
            } else System.out.println("That is not a valid option. Please select option 1, 2, or 3");
        } while (userInput != 3);
        return userInput;
    }

    public static boolean continueProgram (){
        int menuOption = selectMenuOption();
        if (menuOption == 1 || menuOption == 2){
            return true;
        }
        return false;
    }
}
