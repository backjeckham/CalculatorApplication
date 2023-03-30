import java.text.NumberFormat;
import java.util.Scanner;

/**
 * The ConfirmDouble class creates a method to check if a double value has been entered.
 */
public class ConfirmDouble {

    /**
     * Method confirmDouble converts a string to a double to verify it is a double variable
     * entered. It will throw an exception if not a double and set the variable to null.
     * @param inputString String variable entered by user for the first and second number.
     * @return String variable that was initially entered after parsing it to a double.
     */
    public static String confirmDouble(String inputString) {
        String doubleToStringReturnValue = "";
        try {
            double parseDoubleResult = Double.parseDouble(inputString);
            doubleToStringReturnValue = Double.toString(parseDoubleResult);
        } catch (NullPointerException e) {
            doubleToStringReturnValue = null;
        } catch (NumberFormatException e) {
            doubleToStringReturnValue = null;
        } catch (Exception e) {
            doubleToStringReturnValue = null;
        }
        return doubleToStringReturnValue;
    }

}
