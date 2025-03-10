import java.util.Scanner;

public class App {
    /**
     * The main method serves as the entry point for the application.
        System.out.println("Enter a string: ");
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Donnez une corde: ");
            String text = scanner.nextLine();
            System.out.println("Vous avez saisi: " + text);
            
            System.out.println("Enter an integer: ");
            int length = Integer.parseInt(scanner.nextLine());
            System.out.println("Vous avez saisi: " + length);

            System.out.println("Enter a double: ");
            double value = Double.parseDouble(scanner.nextLine());
            System.out.println("Vous avez saisi: " + value);

            System.out.println("Donnez un booléen: ");
            boolean bool = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Vous avez saisi: " + bool);
        } finally {
            scanner.close();
        }
    }
}