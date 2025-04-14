import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum;

        while (true) {
            System.out.print("Saisir un numero: ");
            int input = Integer.valueOf(reader.nextLine());
        
            if (input == -1) {
                break;
            }
           
        }

        System.out.println("Au revoir");
        // System.out.println("Sum: " + input);

        reader.close();
    }
}
