// import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        arrayList();
    }

    public static String arrayList() {
        String[] arr = {"Apple.", "Banana.", "Cherry.", "Date.", "Elderberry."};        
        int[] arr2 = {1, 2, 3, 4, 7};

        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + arr2[i]);
        }

        return "done";
    }
}
