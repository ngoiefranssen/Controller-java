import java.util.Scanner;

public class App {
    /**
     * The main method serves as the entry point for the application.
     */
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Quel est votre age ? ");
        Integer input = Integer.parseInt(reader.nextLine());

        if(input < 0 && !(input > 125)) {
            System.out.println("OK: ");
        } else {
            System.out.println("indesirable : ");
        }

        reader.close();
    }
}
