package task_1;

public class BankAccount extends BillingDetails {
    private String number;
    private String bankname;
    private String swift;
    
    public BankAccount (String o, String number, String bankname, String swift){
        super(o);
        this.setNumber(number);
        this.setBankname(bankname);
        this.setSwift(swift);
    }
    
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getBankname() {
        return bankname;
    }
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
    
    public String getSwift() {
        return swift;
    }
    public void setSwift(String swift) {
        this.swift = swift;
    }
    
    
}
