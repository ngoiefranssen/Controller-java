import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (// System.out.println("Hello, World !");
                // sysout, sout, .....
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Saisir le message : ");

            String message = scanner.nextLine();

            System.out.println(message);
        }
    }
}

