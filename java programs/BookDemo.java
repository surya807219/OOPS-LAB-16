class Book {
    String title;
    String author;
    int pages;

    Book() {
        title = "The Alchemist";
        author = "Paulo Coelho";
        pages = 200;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.displayInfo();
    }
}