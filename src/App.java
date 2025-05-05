import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        arrayList();
    }

    public static String arrayList() {
        Scanner reader = new Scanner(System.in);

        int[] numbers = new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;

        System.out.println("Which index should we access? ");
        int index = Integer.valueOf(reader.nextLine());

        String result = "The value at index " + index + " is " + numbers[index];
        System.out.println(result);
        return result;
    }
}
