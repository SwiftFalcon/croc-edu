package task_1;

public class CreditCard extends BillingDetails{
    
    //public CreditCardType type;
    private String number;
    private String expMonth;
    private String expYear;
    
    public CreditCard (String o, String number, String expMonth, String expYear){
        super(o);
        this.setNumber(number);
        this.setExpMonth(expMonth);
        this.setExpYear(expYear);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    public String getExpYear() {
        return expYear;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }
}
