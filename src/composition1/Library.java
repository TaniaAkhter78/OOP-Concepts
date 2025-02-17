package composition1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        if(books.isEmpty()) {
            System.out.println("Sorry, no books available!");
        }
        else {
            for(Book book : books) {
                book.getBookInfo();
            }
        }
    }

    public void destroyLibrary() {
        books.clear();
        System.out.println("Library is destroyed and all books are removed");
    }

}
