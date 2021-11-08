package users;

public class Receiver extends User{
    private String status;
    public void update(String status){
        System.out.println(status);
    }
}
