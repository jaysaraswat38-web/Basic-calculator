import java.util.Scanner;

public class basiccalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<-- BASIC CALCULATOR -->");

        while (true) {
            System.out.println("\nEnter first number (or Q to quit):");
            String input1 = sc.next();

            if (input1.equalsIgnoreCase("Q")) {
                System.out.println("Calculator exiting. Goodbye!");
                break;
            }

            double num1;
            try {
                num1 = Double.parseDouble(input1);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
                continue;
            }

            System.out.println("Enter operator (*, /, +, -, %, **):");
            String op = sc.next();

            System.out.println("Enter second number:");
            String input2 = sc.next();
            double num2;
            try {
                num2 = Double.parseDouble(input2);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
                continue;
            }

            double ans;
            switch (op) {
                case "*":
                    ans = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero.");
                        continue;
                    }
                    ans = num1 / num2;
                    break;
                case "+":
                    ans = num1 + num2;
                    break;
                case "-":
                    ans = num1 - num2;
                    break;
                case "%":
                    ans = num1 % num2;
                    break;
                case "":
                    ans = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }

            System.out.println("Answer: " + ans);
        }

        sc.close();
    }
}
