package composition1;

public class LibraryRunner {

    public static void main(String[] args) {
        Library l1 = new Library();

        Book book1 = new Book("Ramadan", "Kazi Harun");
        Book book2 = new Book("League", "Author 2");
        Book book3 = new Book("Story", "Author 3");

        l1.addBook(book1);
        l1.addBook(book2);
        l1.addBook(book3);

        l1.displayBooks();
        l1.destroyLibrary();
        l1.displayBooks();

    }

}
