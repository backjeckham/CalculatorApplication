/**
 * The HelpMenu class provides a help menu object that explains how to use the calculator application
 * and a method to display the message to the user.
 */
public class HelpMenu {

    // Create String to store the help menu text.
    String helpMenuString = "";

    /**
     * Constructs a new HelpMenu object and creates the help menu message.
     */
    public HelpMenu () {

        // Create a StringBuilder object to build the help menu text.
        StringBuilder helpMenuStringBuilder = new StringBuilder();

        // Adds the help menu information to the StringBuilder.
        helpMenuStringBuilder.append("[HELP MENU]\n");
        helpMenuStringBuilder.append("In this calculator application, when prompted, you can enter a first number ");
        helpMenuStringBuilder.append("and a second number which can be a decimal, whole, or can be ");
        helpMenuStringBuilder.append("typed out as pi or e.\nWhen prompted for an operator ");
        helpMenuStringBuilder.append("you will type an operator from the list below.\n");
        helpMenuStringBuilder.append("[+ Add] [- Subtract] [* Multiply] [/ Divide] ");
        helpMenuStringBuilder.append("[% Modulus Division] [^ Power] [~ Root] \n");

        // Convert the StringBuilder to a String and store it in the helpMenuString instance variable.
        helpMenuString = helpMenuStringBuilder.toString();
    }

    /**
     * Constructs method displayHelpMenu to print the helpMenuString created in the
     * HelpMenu object to the user.
     */
    public void displayHelpMenu () {
        System.out.println(helpMenuString);
    }
}
