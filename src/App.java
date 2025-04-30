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

        list.removeAll(list);
        list.add("New Element");

       System.out.println("List after removing all elements and adding a new one: " + list);

        return list.toString();
    }
}
