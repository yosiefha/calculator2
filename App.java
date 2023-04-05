import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        while (true) {
            String operation = menu();import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        while (true) {
            String operation = menu();
            if (operation.equals("exit")) {
                return;
            }

            System.out.println();

            double result = 0;
            double num1 = getDouble("Enter the first number: ");
            double num2 = getDouble("Enter the second number: ");

            switch (operation) {
                case "add":
                    result = calculator.add(num1, num2);
                    break;
                case "subtract":
                    result = calculator.subtract(num1, num2);
                    break;
                case "multiply":
                    result = calculator.multiply(num1, num2);
                    break;
                case "divide":
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    throw new UnsupportedOperationException("Invalid mathematical operation");
            }
            System.out.println(String.format("Result: %f", result));
        }
    }

    private static String menu() {
        List<String> options = List.of("add", "subtract", "multiply", "divide", "exit");

        String selection = "";
        while (!options.contains(selection)) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("  add");
            System.out.println("  subtract");
            System.out.println("  multiply");
            System.out.println("  divide");
            System.out.println("  exit");
            selection = getString(null).toLowerCase();
        }
        return selection;
    }

    private static String getString(String prompt) {
        showPrompt(prompt);
        return inputScanner.nextLine();
    }

    private static double getDouble(String prompt) {
        showPrompt(prompt);
        double input = inputScanner.nextDouble();
        inputScanner.nextLine();
        return input;
    }

    private static void showPrompt(String prompt) {
        if (prompt == null || prompt.trim().length() == 0) {
            prompt = "> ";
        }
        System.out.print(prompt);
    }
}
            if (operation.equals("exit")) {
                return;
            }

            System.out.println();

            double result = 0;
            double num1 = getDouble("Enter the first number: ");
            double num2 = getDouble("Enter the second number: ");

            switch (operation) {
                case "add":
                    result = calculator.add(num1, num2);
                    break;
                case "subtract":
                    result = calculator.subtract(num1, num2);
                    break;
                case "multiply":
                    result = calculator.multiply(num1, num2);
                    break;
                case "divide":
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    throw new UnsupportedOperationException("Invalid mathematical operation");
            }
            System.out.println(String.format("Result: %f", result));
        }
    }

    private static String menu() {
        List<String> options = List.of("add", "subtract", "multiply", "divide", "exit");

        String selection = "";
        while (!options.contains(selection)) {
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("  add");
            System.out.println("  subtract");
            System.out.println("  multiply");
            System.out.println("  divide");
            System.out.println("  exit");
            selection = getString(null).toLowerCase();
        }
        return selection;
    }

    private static String getString(String prompt) {
        showPrompt(prompt);
        return inputScanner.nextLine();
    }

    private static double getDouble(String prompt) {
        showPrompt(prompt);
        double input = inputScanner.nextDouble();
        inputScanner.nextLine();
        return input;
    }

    private static void showPrompt(String prompt) {
        if (prompt == null || prompt.trim().length() == 0) {
            prompt = "> ";
        }
        System.out.print(prompt);
    }
}