class Book {
    String title;
    Book(String title) {
        this.title = title;
    }
    void show() {
        System.out.println("Book: " + title);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Book book = new Book("Learning Java");
        book.show();
    }
}
