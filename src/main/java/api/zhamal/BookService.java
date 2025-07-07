package api.zhamal;

public class BookService {


    Book[] getBooks() {
        Book[] books = new Book[3];

        books[0] = new Book("Жамиля", "Чыңгыз Айтматов");
        books[1] = new Book("Маркумдар үнү", "Асан Жакып");
        books[2] = new Book("Кыргыз макал-лакаптар", "Эл чыгармачылыгы");

        return books;
    }
}


