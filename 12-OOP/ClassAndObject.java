class Student {
    String name;
    int id;

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Jahid";
        student.id = 101;
        student.display();
    }
}
