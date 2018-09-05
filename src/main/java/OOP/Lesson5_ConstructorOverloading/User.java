package OOP.Lesson5_ConstructorOverloading;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //Constructor
    public User(){
        this("username", "password");
    }

    //Method getter, returns String
    public String getUsername() {
        return username;
    }

    //method getter, returns String
    public String getPassword() {
        return password;
    }

    //method setter
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return "Normal";
    }
}
