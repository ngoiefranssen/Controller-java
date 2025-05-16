package students;

public class Students {
    private String name;
    private int age;

    public Students(String name) {
        name = this.name;
        age = 0;
    }

    public void printStudent() {
    }

    public static void main(String[] args) {
        Students student = new Students("John");
        System.out.println("Name: " + student.name + ", Age: " + student.age);
    }
}
