import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        arrayList();
    }

    public static String arrayList() {
        Scanner reader = new Scanner(System.in);

        String[] months = new String[12];
        double[] approximations = new double[100];

        months[0] = "January";
        approximations[0] = 3.14;
        System.out.println("Enter the name of the month:" + months[0] + " and the approximation of pi:" + approximations[0]);

        return "answer";
    }
}
