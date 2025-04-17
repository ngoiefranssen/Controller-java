import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter the third number: ");
        int third = Integer.valueOf(scanner.nextLine());

        double averageResult = division(first, second, third);

        System.out.print("The average of the numbers: " + averageResult);
        
        scanner.close();
    }

    public static double division(int numerator, int denominator, int other) {
        return (numerator + denominator + other) / 3.0;
    }
}
