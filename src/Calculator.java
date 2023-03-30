import java.util.Scanner;

/**
 * Class Calculator creates a Calculator object that allows users to input numbers
 * to perform arithmetic operations.
 */
public class Calculator {

    // instance variables to store the user's input.
    String number1 = "";
    String operator = "";
    String number2 = "";
    // instance variables to confirm whether the user's input can be parsed as a double or not.
    String confirmDoubleResult1 = "";
    String confirmDoubleResult2 = "";
    Computable computable = null;

    /**
     * Object constructor to create Calculator object that will take user input for two numbers and an operator
     * and perform basic arithmetic.
     */
    public Calculator () {
        Scanner calculatorScanner = new Scanner(System.in);
        String calculatorChoice = "y";

        while (calculatorChoice.equalsIgnoreCase("y")) {
            // prompt the user to enter the first number.
            do {
                System.out.println("Please enter your first number : ");
                setNumber1(calculatorScanner.nextLine());
                // if the user enters "pi" or "e", use the corresponding value from the Math class instead.
                if (getNumber1().equalsIgnoreCase("pi")) {
                    setNumber1(Double.toString(Math.PI));
                } else if (getNumber1().equalsIgnoreCase("e")) {
                    setNumber1(Double.toString(Math.E));
                }
                // confirm whether the user's input can be parsed as a double or not.
                else {
                    confirmDoubleResult1 = ConfirmDouble.confirmDouble(getNumber1());
                    if (confirmDoubleResult1 == null) {
                        System.out.println("You have entered an invalid entry, please try again.");
                    }
                }
            } while (confirmDoubleResult1 == null);

            // prompt the user to enter the operator.
            System.out.println("Please enter your operator : ");
            setOperator(calculatorScanner.nextLine());

            // prompt the user to enter the second number.
            do {
                System.out.println("Please enter your second number : ");
                setNumber2(calculatorScanner.nextLine());
                // // if the user enters "pi" or "e", use the corresponding value from the Math class instead.
                if (getNumber2().equalsIgnoreCase("pi")) {
                    setNumber2(Double.toString(Math.PI));
                } else if (getNumber2().equalsIgnoreCase("e")) {
                    setNumber2(Double.toString(Math.E));
                }
                // confirm whether the user's input can be parsed as a double or not.
                else {
                    confirmDoubleResult2 = ConfirmDouble.confirmDouble(getNumber2());
                    if (confirmDoubleResult2 == null) {
                        System.out.println("You have entered an invalid entry, please try again.");
                    }
                }
            } while (confirmDoubleResult2 == null);

            // If else statement to perform the operation based on operator entered by user.
            if (getOperator().equalsIgnoreCase("+")) {
                computable = new Addition();
            } else if (getOperator().equalsIgnoreCase("-")) {
                computable = new Subtraction();
            } else if (getOperator().equalsIgnoreCase("*")) {
                computable = new Multiplication();
            } else if (getOperator().equalsIgnoreCase("/")) {
                computable = new Division();
            } else if (getOperator().equalsIgnoreCase("%")) {
                computable = new ModulusDivision();
            } else if (getOperator().equalsIgnoreCase("^")) {
                computable = new Power();
            } else if (getOperator().equalsIgnoreCase("~")) {
                computable = new Root();
            } else {
                System.out.println("You have entered an invalid operator.");
            }
            double result = computable.calculate(getNumber1(), getNumber2());
            System.out.println(getNumber1() + " " + getOperator() + " " + getNumber2() + " " + "= " + result);

            // Get input from user to see if they would like to do another calculation or end the program.
            System.out.println("Would you like to perform another calculation? : (y/n)");
            calculatorChoice = calculatorScanner.nextLine();
        }
        // Closing the scanner
        calculatorScanner.close();
    }

    /**
     * Sets the first number entered by the user.
     * @param number1 String variable the user enters for the first number.
     */
    public void setNumber1 (String number1) {
        this.number1 = number1;
    }


    /**
     * Returns the first number entered by the user.
     * @return String variable representing the first number entered by user.
     */
   public String getNumber1() {
        return number1;
    }

    /**
     * Sets the second number entered by the user.
     * @param number2 String variable the user enters for the second number.
     */
    public void setNumber2 (String number2) {
        this.number2 = number2;
    }

    /**
     * Returns the second number entered by the user.
     * @return String variable representing the second number entered by user.
     */
    public String getNumber2() {
        return number2;
    }

    /**
     * Sets the operator entered by the user.
     * @param operator String variable the user enters for the operator.
     */
    public void setOperator (String operator) {
        this.operator = operator;
    }

    /**
     * Returns the operator entered by the user.
     * @return String variable representing the operator entered by user.
     */
    public String getOperator() {
        return operator;
    }
}
