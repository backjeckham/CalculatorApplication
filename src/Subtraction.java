/**
 * The Subtraction class implements the Computable interface and provides a method for
 * subtracting two numbers.
 */
public class Subtraction implements Computable {

    /**
     * Takes string input from the user and parses the Strings to double variables. Returns
     * the result of the difference of input as a double.
     * @param number1 String number entered first by the user.
     * @param number2 String number entered second by the user.
     * @return The difference of number1 and number2 as a double.
     */
    public double calculate (String number1, String number2) {

        double subtractResult = 0;
        double number1ToDouble = Double.parseDouble(number1);
        double number2ToDouble = Double.parseDouble(number2);
        subtractResult = number1ToDouble - number2ToDouble;
        return subtractResult;
    }
}
