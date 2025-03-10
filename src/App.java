import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int value = Integer.valueOf(scanner.nextInt());
        System.out.println("Vous avez saisi: " + value);

    }
}

