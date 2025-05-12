import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        arrayList();
    }

    public static String arrayList() {

        Scanner reader = new Scanner(System.in);

        String lastResponse = "";

        while (true) {
            System.out.println("Enter description and age ( description or press Enter to finish):");
            String input = reader.nextLine();

            if (input.equals(""))
                break;

            String[] parts = input.split(" ");
            lastResponse = parts[parts.length - 1];
            System.out.println("response: " + lastResponse);
        }

        System.out.println("Last response: " + lastResponse);

        reader.close();
        return "End of input";
    }
}
