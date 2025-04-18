import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        flessmallest();
    }

    public static void flessmallest() {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Start number: ");
            int start = Integer.valueOf(reader.nextLine());

            System.out.println("End number: ");
            int end = Integer.valueOf(reader.nextLine());

            if(start >= end){
                System.out.println("start " + start );
                break;
            }
            start = start - 1;
            System.out.println(start);
        }

        reader.close();
    }
}
