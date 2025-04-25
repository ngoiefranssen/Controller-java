import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        arrayList();
    }

    public static void arrayList() {
        
        ArrayList<Double> doubl = new ArrayList<>();

        Double d = 2.3;
        Double d_ = 7.7;

        Double sum = d + d_;
        doubl.add(sum);

        System.out.println(doubl);
    }
}
