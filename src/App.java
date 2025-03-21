import java.util.Scanner;

public class App {
    /**
     * The main method serves as the entry point for the application.
        System.out.println("Enter a string: ");
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Donnez une an: ");
            String number = scanner.nextLine();
            System.out.println("Vous avez saisi: " + number);

            int year = Integer.parseInt(number);
            if(year > 0){
                System.out.println("Le numero saisi est positif");
            } else if(year < 0) {
                System.out.println("Le numero saisi est négatif");
            } else {
                System.out.println("Le numero saisi est zéro");
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