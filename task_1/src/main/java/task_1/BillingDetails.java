package task_1;

public class BillingDetails {

    public String ownername;
    //private User user;
    
    public BillingDetails (String o){
        this.ownername = o;
    }
    
    public void setName(String newName){
        ownername = newName;
    }
    public String getName(){
        return ownername;
    }
    
}
