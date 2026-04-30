/*Constructor is a special method in Java that is used to initialize objects. It is called when an instance of a class is created. 
  The constructor has the same name as the class and does not have a return type, not even void.
    
 *To create a Constructor in Java, you can follow these steps:
1. Define a class with the same name as the constructor.
2. Declare the constructor method with the same name as the class and no return type.
3. Inside the constructor, you can initialize the instance variables or perform any setup tasks needed for the object.
Example of a Constructor in Java:
 
  */
public class TestConstructor {
    int id;
    String name;

    // Constructor to initialize the instance variables
    public TestConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display the values of instance variables
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // Main method to test the constructor
    public static void main(String[] args) {
        TestConstructor obj = new TestConstructor(01, "Saurav singh");
        obj.display();
    }    

}