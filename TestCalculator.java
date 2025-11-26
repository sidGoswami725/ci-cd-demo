public class TestCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        boolean passed = true;

        // Test Addition
        if (calc.add(2, 3) != 5) {
            System.err.println("Test Failed: 2 + 3 should be 5");
            passed = false;
        }

        // Test Subtraction
        if (calc.subtract(5, 3) != 2) {
            System.err.println("Test Failed: 5 - 3 should be 2");
            passed = false;
        }

        if (passed) {
            System.out.println("All Tests Passed Successfully.");
            System.exit(0); // Success exit code
        } else {
            System.exit(1); // Failure exit code (Stops Jenkins)
        }
    }
}
