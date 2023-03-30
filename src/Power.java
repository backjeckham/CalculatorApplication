/**
 * The Power class implements the Computable interface and provides a method for
 * calculating the power of a number.
 */
public class Power implements Computable {

    /**
     * Takes string input from the user and parses the Strings to double variables. Returns
     * the result raising a number to a power as a double.
     * @param number1 String number entered first by the user.
     * @param number2 String number entered second by the user representing the exponent.
     * @return The result of number1 raised to the power of number2 as a double.
     */
    public double calculate (String number1, String number2) {

        double powerResult = 0;
        double number1ToDouble = Double.parseDouble(number1);
        double number2ToDouble = Double.parseDouble(number2);
        powerResult = Math.pow (number1ToDouble, number2ToDouble);
        return powerResult;
    }
}
