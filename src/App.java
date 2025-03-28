import java.util.Scanner;

public class App {
    /**
     * The main method serves as the entry point for the application.
     */
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        int one = 0;

        while (true) {
            System.out.println("Input a number one: ");
            int number = Integer.valueOf(reader.nextLine());
        
            if (number == 0) {
                break;
            }
        
            if (number == 1) {
                one = one + 1;
            }

        }
        System.out.println("One: " + one);

        reader.close();
    }
}
