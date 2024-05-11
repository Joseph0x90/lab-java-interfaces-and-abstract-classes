import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    // Method to round a BigDecimal to the nearest hundredth
    public static double roundToNearestHundredth(BigDecimal number) {
        // Use setScale to specify the number of digits after the decimal point
        // Use RoundingMode.HALF_UP to round to the nearest hundredth
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        // Convert the rounded BigDecimal to double
        return rounded.doubleValue();
    }

    // Method to reverse sign, round to the nearest tenth, and return result
    public static double reverseSignAndRound(BigDecimal number) {
        // Reverse sign by multiplying with -1
        BigDecimal reversed = number.multiply(BigDecimal.valueOf(-1));
        // Use setScale to specify the number of digits after the decimal point
        // Use RoundingMode.HALF_UP to round to the nearest tenth
        BigDecimal rounded = reversed.setScale(1, RoundingMode.HALF_UP);
        // Convert the rounded BigDecimal to double
        return rounded.doubleValue();
    }

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("4.2545");
        BigDecimal num2 = new BigDecimal("-45.67");

        // Test roundToNearestHundredth method
        double result1 = roundToNearestHundredth(num1);
        double result2 = roundToNearestHundredth(num2);
        System.out.println("Rounded to nearest hundredth:");
        System.out.println("Result 1: " + result1); // Output: 4.25
        System.out.println("Result 2: " + result2); // Output: -45.67

        // Test reverseSignAndRound method
        double result3 = reverseSignAndRound(num1);
        double result4 = reverseSignAndRound(num2);
        System.out.println("\nReversed sign and rounded to nearest tenth:");
        System.out.println("Result 3: " + result3); // Output: -4.3
        System.out.println("Result 4: " + result4); // Output: 45.7
    }
}
