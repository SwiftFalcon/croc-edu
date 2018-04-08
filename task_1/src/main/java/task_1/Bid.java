package task_1;

import java.math.BigDecimal;
import java.util.Date;


//Бинарная ассоциация с User и Item + композиция с Item

public class Bid {
    private BigDecimal amount;
    private Date created;
    private User bidUser;
    
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
        
    }
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    
    public User getBidUser() {
        return bidUser;
    }
    public void setBidUser(User bidUser) {
        this.bidUser = bidUser;
    }
    
    
}
