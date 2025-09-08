// Encapsulation ka matlab hai: Data (fields/variables) + Methods (behaviors) ko ek hi unit/class ke andar bind karna.

// Aur sabse important:
// Object ki internal state ko bahar se directly access karne se roka jata hai (data hiding).

// Bahar ke users ko sirf controlled access milta hai (getters & setters ke through).

class Student{
    private String name;

    // getter- to read the value
    public String getName(){
        return name;
    }

    //setter - to set/update
    public void SetName(String newName){
        name = newName;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SetName("Apoorva");
        System.out.println("The name is: " + s1.getName());
    }
    
}

// agar isme hm setName vla method ni likhege to name null return hoga