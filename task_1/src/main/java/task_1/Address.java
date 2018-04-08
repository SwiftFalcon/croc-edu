package task_1;

//Композиция с классом User: если User удален, 
// то и соответствующий ему Address тоже удален

public class Address {
    public String street;
    public String zipcode;
    public String city; 
    private User home;
    private User billing;
    private User shipping;
    
    public Address(String street, String zipcode, String city) {
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
    }

    public User getHome() {
        return home;
    }

    public void setHome(User home) {
        this.home = home;
    }

    public User getBilling() {
        return billing;
    }

    public void setBilling(User billing) {
        this.billing = billing;
    }

    public User getShipping() {
        return shipping;
    }

    public void setShipping(User shipping) {
        this.shipping = shipping;
    }
    
    
}
