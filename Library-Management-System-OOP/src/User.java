package librarymanagementsystemoop;

public class User {
    private String username;
    private String name;
    
    public User(String username, String name){
        this.name = name;
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getName(){
        return name;
    }
}


