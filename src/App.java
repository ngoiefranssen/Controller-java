import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Entrez un nombre (doit être > 0): ");
            number = Integer.valueOf(scanner.nextLine());
        } while (number <= 0);

        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
