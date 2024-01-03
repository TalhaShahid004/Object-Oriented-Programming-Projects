package librarymanagementsystemoop;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<User> users;
    
    public Library(){
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        
    }
    
    public void addBook(Book book){
        books.add(book);
    }
    
    public void removeBook(Book book){
        books.remove(book);
    }
    
    public Book searchBook(String title){
        for(Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    
    public List<Book> searchBooksByAuthor(String author){
        List<Book> result = new ArrayList<>();
        for(Book book : books){
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
    
    public List<Book> searchBooksBySubject(String subject){
        List<Book> result = new ArrayList<>();
        for(Book book : books){
            if (book.getAuthor().equalsIgnoreCase(subject)) {
                result.add(book);
            }
        }
        return result;
    }
    
    public void addUser(User user){
        users.add(user);
    }
    
    
    public void removeUser(User user){
        users.remove(user);
    }
    
    public User searchUser(String username){
        for(User user : users){
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        return null;
    }
    
}
