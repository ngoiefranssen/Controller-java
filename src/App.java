import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        flessmallest();
    }

    public static void flessmallest() {
        ArrayList<String> fullname = new ArrayList<>();

        fullname.add("Ngoie Franssen"); // index 0
        fullname.add("Kabamba Franssen"); // index 1

        System.out.println(fullname.get(1));
    }
}
