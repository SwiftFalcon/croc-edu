package task_1;

import java.util.HashSet;
import java.util.Set;

public class User{
    public String firstname;
    public String lastname;
    public String username;
    public String password;
    public String email;
    public int ranking;
    public boolean admin;
    
    public Address address;
    public Set<BillingDetails> billing = new HashSet<BillingDetails>();

    public User(String firstname, String lastname, String username, String password, String email, int ranking,
            boolean admin, Address address) {
        super();
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.ranking = ranking;
        this.admin = admin;
        this.address = address;
        //BillingDetails = billingDetails;
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
}
