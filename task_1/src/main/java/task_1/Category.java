package task_1;

import java.util.HashSet;
import java.util.Set;

//2 встречные N-арные ассоциации Category и Item

public class Category{

    public String name;
    private Set<Item> itemType = new HashSet<Item>();
    
    //private Set itemCategories = new HashSet();
    public Category(String n) {
        this.name = n;
    }

    public Set<Item> getItemType() {
        return itemType;
    }

    public void setItemType(Set<Item> itemType) {
        this.itemType = itemType;
    } 
    public void deleteItemType(Item i){
        itemType.remove(i);
    }
    
}
