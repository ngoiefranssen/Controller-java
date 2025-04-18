import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        flessmallest();
    }

    public static void flessmallest() {
        Scanner reader = new Scanner(System.in);
        int values = 0;
        int sum = 0;

        while (true) {
            System.out.println("Provide a value, a negative value ends the program");
            int value = Integer.valueOf(reader.nextLine());
            if (value < 0) {
                break;
            }

            values = values + 1;
            sum = sum + value;
        }

        if (sum == 0) {
            System.out.println("The average of the values could not be calculated.");
        } else {
            System.out.println("Average of values: " + (1.0 * sum / values));
        }

        reader.close();
    }
}
