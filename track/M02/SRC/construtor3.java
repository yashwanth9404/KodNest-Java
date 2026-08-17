import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        // Store the title and author
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class construtor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the book title and author
        String title = scanner.nextLine();
        String author = scanner.nextLine();

        // Create one Book object and call display
        Book book = new Book(title, author);
        book.display();

        scanner.close();
    }
}