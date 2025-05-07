import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        arrayList();
    }

    public static String arrayList() {
        String[] arr = {"apple.", "banana.", "cherry.", "date.", "elderberry."};
        int[] arr2 = {1, 2, 3, 4, 5};

        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i] + " " + arr2[i]);
            i++;
        }

        return "done";
    }
}
