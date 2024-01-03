package librarymanagementsystemoop;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String title;
    private String author;
    private String subject;
    private String location;
    private boolean availability;
    private List<String> checkoutHistory;

    public Book(String title, String author, String subject, String location) {
        this.author = author;
        this.title = title;
        this.subject = subject;
        this.availability = true;
        this.location = location;
        this.checkoutHistory = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }

    public boolean getAvailability() {
        return availability;
    }

    public String getLocation() {
        return location;
    }

    public List<String> getCheckoutHistory() {
        return checkoutHistory;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void addCheckoutRecord(String username) {
        checkoutHistory.add(username);
    }
    
}
