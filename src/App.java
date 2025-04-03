import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int result = 0;

        int i = 0;
        while (true) {
            result += 3; // shorthand for result = result + 3
            i++;  // shorthand for i = i + 1
        
            if (i == 4) {
                break;
            }
        }
        
        System.out.println(result);

        scanner.close();
    }
}
