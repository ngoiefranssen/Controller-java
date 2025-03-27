import java.util.Scanner;

public class App {
    /**
     * The main method serves as the entry point for the application.
     */
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Input a number ");
            int number = Integer.valueOf(reader.nextLine());
        
            if (number < 0) {
                System.out.println("Unfit number");
                continue;
            }
        
            if (number == 0) {
                break;
            }
        
            System.out.println(number * number);
        }

        reader.close();
    }
}
