public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java Calculator <add|sub> <num1> <num2>");
            return;
        }

        Calculator calc = new Calculator();
        String operation = args[0];
        
        try {
            int num1 = Integer.parseInt(args[1]);
            int num2 = Integer.parseInt(args[2]);

            if ("add".equalsIgnoreCase(operation)) {
                System.out.println(calc.add(num1, num2));
            } else if ("sub".equalsIgnoreCase(operation)) {
                System.out.println(calc.subtract(num1, num2));
            } else {
                System.out.println("Invalid operation. Use 'add' or 'sub'.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integers.");
        }
    }
}
