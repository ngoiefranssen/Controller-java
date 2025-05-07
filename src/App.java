import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        arrayList();
    }

    public static String arrayList() {
        Scanner reader = new Scanner(System.in);

        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 97;
        numbers[2] = 71;
        numbers[3] = 4;
        numbers[4] = 17;

        System.out.println("The array has " + numbers.length + " elements.");

        int index = 0;
        
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index = index + 1;
        }

        return "ArrayList";
    }
}
