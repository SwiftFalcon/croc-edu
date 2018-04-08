package task_1;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

//Бинарная ассоциация и композиция с Bid + ассоциация с Shipment

public class Item {
    private String name;
    private String description;
    private BigDecimal initialPrice;
    private BigDecimal reversePrice;
    private Date startDate;
    private Date endDate;
    //private ItemState state;
    public Date approvalDateTime;
    private Bid successful;
    private Set<Bid> itemBid = new HashSet<Bid>();
    
    public void setItemBid(Bid b){
        itemBid.add(b);
    }
    public Set<Bid> getItemBid(){
        return itemBid;
    }
    public void deleteItemBid(Bid b){
        itemBid.remove(b);
    }
   
    public Bid getSuccessful() {
        return successful;
    }
    public void setSuccessful(Bid successful) {
        this.successful = successful;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getInitialPrice() {
        return initialPrice;
    }
    public void setInitialPrice(BigDecimal initialPrice) {
        this.initialPrice = initialPrice;
    }
    public BigDecimal getReversePrice() {
        return reversePrice;
    }
    public void setReversePrice(BigDecimal reversePrice) {
        this.reversePrice = reversePrice;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
}
