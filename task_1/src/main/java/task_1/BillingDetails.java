package task_1;

//N-арная ассоциация с классом User
public class BillingDetails {

    private String ownername;
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
