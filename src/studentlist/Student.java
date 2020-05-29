package studentlist;

/**
 * This class represents students in our application
 *
 * @author Paul Bonenfant
 */
public class Student {
    
    private String name;
    
    private String id;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}

