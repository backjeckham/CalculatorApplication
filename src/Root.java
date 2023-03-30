/**
 * The Root class implements the Computable interface and provides a method for
 * calculating the nth root of a number.
 */
public class Root implements Computable {

    /**
     * Takes string input from the user and parses the Strings to double variables. Returns
     * the result of the number1 root of number2.
     * @param number1 String number entered first by the user representing the exponent.
     * @param number2 String number entered second by the user representing the number to take the root of.
     * @return The result of taking the nth root of number2 as a double.
     */
    public double calculate (String number1, String number2) {

        double rootResult = 0;
        double number1ToDouble = Double.parseDouble(number1);
        double number2ToDouble = Double.parseDouble(number2);
        rootResult = Math.pow (number2ToDouble, 1 / number1ToDouble);
        return rootResult;
    }
}
