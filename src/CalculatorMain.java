import java.util.Scanner;
/**
 * @author Jack Beckham
 * The CalculatorMain class is the main class that runs the calculator application. It displays the main menu and
 * handles user input. It also creates instances of the Calculator, HelpMenu, and MainMenu classes.
 */
public class CalculatorMain {

    /**
     * Method main is the main method for this application. It creates and displays
     * the Calculator, MainMenu, and HelpMenu objects.
     * @param args -- String array of parameters separated by a space, entered on the
     *             command line.
     */
    public static void main (String [] args) {
        // String variable to hold the users input for starting the application.
        String mainChoice = "";

        // Creating new scanner called mainScanner.
        Scanner mainScanner = new Scanner(System.in);
        // Creating new HelpMenu and MainMenu objects.
        HelpMenu helpMenu = new HelpMenu();
        MainMenu mainMenu = new MainMenu();

        // While loop to prompt if user wants help or to start/stop the calculator.
        while (!mainChoice.equalsIgnoreCase("off")) {
            mainMenu.displayMainMenu();
            mainChoice = mainScanner.nextLine();
            // If user enters on, create new Calculator object.
            if (mainChoice.equalsIgnoreCase("on")) {
                Calculator calculator = new Calculator();
                mainChoice = "off";
            }
            // Display the help menu if user enters help.
            else if (mainChoice.equalsIgnoreCase("help")) {
                helpMenu.displayHelpMenu();
            }
            // Ends loop if user enters off.
            else if (mainChoice.equalsIgnoreCase("off")) {
            }
            // Prints invalid input if user does not enter correct keyword.
            else {
                System.out.println("Invalid input entered, please enter ON, OFF, or HELP.");
            }
        }
        // Print out closing message.
        System.out.println("Closing program");
        mainScanner.close();
    }
}
