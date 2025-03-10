import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez une corde: ");
        String text = String.valueOf(scanner.nextLine());
        System.out.println("Vous avez saisi: " + text);
        
        System.out.println("Donnez un entier: ");
        int length = Integer.valueOf(scanner.nextLine());
        System.out.println("Vous avez saisi: " + length);

        System.out.println("Donnez un double: ");
        double value = Double.valueOf(scanner.nextLine());
        System.out.println("Vous avez saisi: " + value);

        System.out.println("Donnez un booléen: ");
        boolean bool = Boolean.valueOf(scanner.nextLine());
        System.out.println("Vous avez saisi: " + bool);
    }

}