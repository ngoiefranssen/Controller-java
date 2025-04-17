import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        smallest(7, 3,7);
        scanner.close();
    }

    public static int smallest(int number1, int number2, int number3) {
        if (number1 < number2 && number1 < number3) {
            System.out.println("Number One is smaller: " + number1);
            return number1;
        } else if (number2 < number1 && number2 < number3) {
            System.out.println("Number two is smaller: " + number2);
            return number2;
        } else if (number3 < number1 && number3 < number2) {
            System.out.println("Number three is smaller: " + number3);
            return number3;
        } else {
            System.out.println("All numbers are equal: " + number1 + ", " + number2 + ", and " + number3);
        }

        return 0; // Default return value if both numbers are equal
    }
}
