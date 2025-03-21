import java.util.Scanner;

public class App {
    /**
     * The main method serves as the entry point for the application.
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Donnez le premier numéro : ");
            int number1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Donnez le deuxième numéro : ");
            int number2 = Integer.parseInt(scanner.nextLine());

            if (number1 > number2) {
                System.out.println("Le nombre plus élevé est le suivant: " + number1);
            } else if (number1 < number2) {
                System.out.println("Le nombre plus élevé est le suivant: " + number2);
            } else {
                System.out.println("Les deux numéros sont égaux");
            }
        } finally {
            scanner.close();
        }
    }
}
