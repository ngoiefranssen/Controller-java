import java.util.Scanner;

public class App {
    /**
     * The main method serves as the entry point for the application.
     */
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        int number = 0;

        while (true) {
            System.out.println("Saisir un nombre 0 pour arreter:");

            if (!reader.hasNextLine()) {
                continue;
            }

            String input = reader.nextLine();
            
            if (Integer.parseInt(input) < number) {
                System.out.println("Numéro impropre: " + Integer.parseInt(input));
                System.out.println("Saisir a nouveau le numéro: ");
                continue;
            }else if (Integer.parseInt(input) == number) {
                break;
            }else if(Integer.parseInt(input) > number){
                int parsedInput = Integer.parseInt(input);
                int result = parsedInput * parsedInput;
                System.out.println("Resul " + result);
                break;
            }
        }

        System.out.println("Out");

        reader.close();
    }
}
