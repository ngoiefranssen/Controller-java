import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = onChangeNumber(7, 7, 7, 7);
        System.out.println("Sum: " + sum);
        scanner.close();
    }

    public static int onChangeNumber(int number, int operation, int operand, int operand2) {
        return number + operand + operand2 + operation;
    }
}
