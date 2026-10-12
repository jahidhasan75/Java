interface Printable {
    void print();
}
class Report implements Printable {
    public void print() { System.out.println("Printing report..."); }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Printable item = new Report();
        item.print();
    }
}
