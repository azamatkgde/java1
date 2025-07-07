
package api.zhamal;

import java.util.Scanner;

public class BookExample {
    public static void main(String[] args) {

        BookService service = new BookService();

        Book[] books = service.getBooks();

        System.out.println("Кыргызча китептер:");

        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " / " + book.getAuthor());
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nБир китепти тандаңыз (1-3): ");

        int choice = scanner.nextInt();
        if (choice >= 1 && choice <= books.length) {

            Book selectedBook = books[choice - 1];

            System.out.println("\nСиз тандаган китеп:");
            System.out.println("- " + selectedBook.getTitle() + " / " + selectedBook.getAuthor());
        }
        else {
            System.out.println("Ката: туура эмес сан киргизилди!");
        }

        scanner.close();            }
}


