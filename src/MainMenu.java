import java.util.Scanner;
/**
 * The MainMenu class provides a welcome message for the calculator application and a method
 * to display the message to the user.
 */
public class MainMenu {

    // Create string to hold the main menu text.
    String mainMenuString = "";

    /**
     * Constructs a new MainMenu object and creates the welcome message using a StringBuilder variable
     * called mainMenuSB.
     */
    public MainMenu () {

        // Create a StringBuilder object to build the main menu text.
        StringBuilder mainMenuSB = new StringBuilder();

        // Add the welcome message and main menu text to the StringBuilder.
        mainMenuSB.append("\nWelcome to the Calculator Application. You can use this calculator ");
        mainMenuSB.append("to add, subtract, multiply, divide, modulus division, raise to the ");
        mainMenuSB.append("nth power, and get the nth root of numbers.\nPlease enter ON to start ");
        mainMenuSB.append("the calculator or OFF to close program, you can also type HELP for more information.\n");

        // Convert the StringBuilder to a String and store it in the mainMenuSB instance variable.
        mainMenuString = mainMenuSB.toString();
    }

    /**
     * Constructs method displayMainMenu to print the mainMenuString, created in the
     * MainMenu object, to the user.
     */
    public void displayMainMenu () {
        System.out.println(mainMenuString);
    }

}
