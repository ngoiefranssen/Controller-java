import java.util.Scanner;

public class App {
    /**
     * The main method serves as the entry point for the application.
     */
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("Entrez la première chaîne :");
        String chA = reader.nextLine();
        System.out.println("Entrez la deuxième chaîne :");
        String chB = reader.nextLine();

        if (chA.equals(chB) && chB.equals(chA)) {
            System.out.println("Mêmes");
        } else {
            System.out.println("Différents");
            
        }

        reader.close();

        // try {

        //     System.out.println("Donner des points : ");
        //     String input = scanner.nextLine();

        //     String[] points = input.split(" ");

        //     for (String point : points) {
        //         switch (point) {
        //             case "[0]":
        //                 System.out.printf("Donner des points: %s\nGrade : Impossible\n", point);
        //                 break;
        //             case "[0-49]":
        //                 System.out.printf("Donner des points: %s\nGrade : échec\n", point);
        //                 break;
        //             case "[50-59]":
        //                 System.out.printf("Donner des points: %s\nGrade : 1\n", point);
        //                 break;
        //             case "[60-69]":
        //                 System.out.printf("Donner des points: %s\nGrade : 2\n", point);
        //                 break;
        //             case "[70-79]":
        //                 System.out.printf("Donner des points: %s\nGrade : 3\n", point);
        //                 break;
        //             case "[80-89]":
        //                 System.out.printf("Donner des points: %s\nGrade : 4\n", point);
        //                 break;
        //             case "[90-100]":
        //                 System.out.printf("Donner des points: %s\nGrade : 5\n", point);
        //                 break;
        //             case "[100]":
        //                 System.out.printf("Donner des points: %s\nGrade : C'est incroyable\n", point);
        //                 break;
        //             default:
        //                 System.out.printf("Donner des points: %s\nGrade : Invalide\n", point);
        //                 break;
        //         }
        //     }
        // } finally {
        //     scanner.close();
        // }
    }
}
