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
    }
}
