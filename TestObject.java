/*OBJECT CREATIONN IN JAVA:
To create an object in java, we need to follow these steps:
1. Define a class: A class is a blueprint for creating objects.
   It defines the properties and behaviors of the objects that will be created from it.
2. Create an object: To create an object, we use the new keyword followed by the class name and parentheses.
   This will call the constructor of the class, which initializes the object.
3. Access the object: Once the object is created, we can access its properties and behaviors using the dot operator. 
   We can also call methods on the object to perform actions or retrieve information.
 */
public class TestObject {

    String name = "Test Object";
    public static void main(String[] args) {
        TestObject obj = new TestObject();
        System.out.println(obj.name);
    }
}

/*In above example, we have created an object of the TestObject class and accessed its name property. */