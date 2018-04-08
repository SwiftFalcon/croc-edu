package task_1;

import java.util.HashSet;
import java.util.Set;

public class User{
    public String firstname;
    public String lastname;
    private String username;
    private String password;
    private String email;
    public int ranking;
    private boolean admin;
   
    public Address address;
    private Set<BillingDetails> billing = new HashSet<BillingDetails>();
    private Set<Item> bought = new HashSet<Item>();
    
    public User(String firstname, String lastname, String username, String password, String email, int ranking,
            boolean admin, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.setUsername(username);
        this.setPassword(password);
        this.setEmail(email);
        this.ranking = ranking;
        this.setAdmin(admin);
        this.address = address;
    }
    
    public void setBilling(BillingDetails newOwnerName){
        billing.add(newOwnerName);
    }
    public Set<BillingDetails> getRoom(){
        return billing;
    }
    public void deleteRoom(BillingDetails b){
        billing.remove(b);
    }

    public Set<Item> getBought() {
        return bought;
    }
    public void setBought(Item newBought) {
        bought.add(newBought);
    }
    public void deleteBought(Item i){
        bought.remove(i);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
