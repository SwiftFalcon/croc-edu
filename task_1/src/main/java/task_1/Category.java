package task_1;

import java.io.Serializable;

public class Category implements Serializable{
    private String name;
    
    private Category parentCategory;
    private Set childCategories = new HashSet();
    public Category() {} 
}
