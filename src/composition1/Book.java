package composition1;

public class Book {

//    5. Composition Assignment (Library Management System)
//    Scenario:
//    A Library has Books. If a Library is removed, all books should also be removed.
//    Task:
//    Create a Book class with title and author.
//    Create a Library class containing multiple books (List<Book>).
//    If the library is destroyed, all books should be destroyed too.

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void getBookInfo() {
        System.out.println("Book Title : " + title + "\nAuthor : " + author);
    }
}
