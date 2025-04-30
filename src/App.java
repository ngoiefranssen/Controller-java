import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        arrayList();
    }

    public static String arrayList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");

        for (String str : list) {
            System.out.println(str);
        }

        return "ArrayList example completed.";
    }
}
