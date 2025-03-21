import java.util.Scanner;

public class App {
    /**
     * The main method serves as the entry point for the application.
        System.out.println("Enter a string: ");
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Quel âge as-tu ? ");
            String number = scanner.nextLine();
            System.out.println("Vous avez saisi: " + number);

            int year = Integer.parseInt(number);

            switch (year) {
                case 12:
                    System.out.println("Vous n'êtes pas un adulte");
                    break;
                case 18:
                    System.out.println("Vous êtes un adulte");
                    break;
                case 32:
                    System.out.println("Vous êtes un adulte");
                    break;
                default:
                    break;
            }

        //     System.out.println("Enter an integer: ");
        //     int length = Integer.parseInt(scanner.nextLine());
        //     System.out.println("Vous avez saisi: " + length);

        //     System.out.println("Enter a double: ");
        //     double value = Double.parseDouble(scanner.nextLine());
        //     System.out.println("Vous avez saisi: " + value);

        //     System.out.println("Donnez un booléen: ");
        //     boolean bool = Boolean.parseBoolean(scanner.nextLine());
        //     System.out.println("Vous avez saisi: " + bool);
        } finally {
            scanner.close();
        }

      
    }
}