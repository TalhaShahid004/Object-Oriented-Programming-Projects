package librarymanagementsystemoop;

import java.util.List;

public class LibraryManagementSystemOOP {
    public static void main(String[] args) {
         // Create library
        Library library = new Library();

        // Add books
        Book book1 = new Book("Book1", "Author1", "Subject1", "Location1");
        Book book2 = new Book("Book2", "Author2", "Subject2", "Location2");
        library.addBook(book1);
        library.addBook(book2);

        // Add users
        User user1 = new User("user1", "John Doe");
        User user2 = new User("user2", "Jane Smith");
        library.addUser(user1);
        library.addUser(user2);

        // Search for a book by title
        Book foundBook = library.searchBook("Book1");
        if (foundBook != null) {
            System.out.println("Book Found: " + foundBook.getTitle());
        } else {
            System.out.println("Book Not Found");
        }

        // Search for books by author
        List<Book> booksByAuthor = library.searchBooksByAuthor("Author2");
        System.out.println("Books by Author2:");
        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle());
        }

        // Search for books by subject
        List<Book> booksBySubject = library.searchBooksBySubject("Subject1");
        System.out.println("Books by Subject1:");
        for (Book book : booksBySubject) {
            System.out.println(book.getTitle());
        }
    }    
}
