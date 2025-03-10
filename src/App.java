import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int value = Integer.valueOf(scanner.nextInt());
        System.out.println("Vous avez saisi: " + value);

        Scanner scanner2  = new Scanner(System.in);
        System.out.println("Enter the second number: ");
        int value2 = Integer.valueOf(scanner2.nextInt());

        System.out.println("Vous avez saisi: " + value2);
        int sum = value + value2;
        System.out.println("The sum of the two numbers is: " + sum);
        scanner.close();
}

}