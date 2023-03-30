/**
 * The ModulusDivision class implements the Computable interface and provides
 * a method for getting the remainder from dividing two numbers.
 */
public class ModulusDivision implements Computable {

    /**
     * Takes string input from the user and parses the Strings to double variables. Returns
     * the remainder after dividing number1 by number2 as a double.
     * @param number1 String number entered first by the user.
     * @param number2 String number entered second by the user.
     * @return The remainder from dividing number1 by number2 as a double.
     */
    public double calculate (String number1, String number2) {

        double moduleResult = 0;
        double number1ToDouble = Double.parseDouble(number1);
        double number2ToDouble = Double.parseDouble(number2);
        moduleResult = number1ToDouble % number2ToDouble;
        return moduleResult;
    }
}
