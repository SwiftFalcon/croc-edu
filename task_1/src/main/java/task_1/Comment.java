package task_1;

import java.util.Date;

public class Comment {
    //public Rating rating;
    public String text;
    public Date created;
    private Item about;
    private User from;
    
    public Item getAbout() {
        return about;
    }
    public void setAbout(Item about) {
        this.about = about;
    }
    
    public User getFrom() {
        return from;
    }
    public void setFrom(User from) {
        this.from = from;
    }
    
}
