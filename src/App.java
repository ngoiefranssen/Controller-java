import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        printApp();
    }

    public static void printApp() {

        Scanner render = new Scanner(System.in);
        System.out.println("Entrez un name du programme : ");
        String show = String.valueOf(render.nextLine());

        if(show.equals(show)) {
            System.out.println("Le name du programme est la suivante : " + show);
        }

        System.out.println("Fin du programme. " + show);
        render.close();
    }
}
