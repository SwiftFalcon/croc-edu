package task_1;

import java.util.Date;

//Бинарная ассоциация

public class Shipment {
    public int inspectionPeriodDays;
    public Date created;
    //public ShipmentState state;
    private Item item;
    private User buyer;
    private User seller;
    private Address delivery;
    
    public Shipment(int inspectionPeriodDays, Date created) {
        super();
        this.inspectionPeriodDays = inspectionPeriodDays;
        this.created = created;
        //this.state = state;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Address getDelivery() {
        return delivery;
    }

    public void setDelivery(Address delivery) {
        this.delivery = delivery;
    }
    
    
    
}
