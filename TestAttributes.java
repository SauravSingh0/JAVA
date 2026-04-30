/*Attributes in Java, also known as fields or variables, are used to store data or state of an object. 
They are defined within a class and can have different access modifiers (public, private, protected) to control their visibility and accessibility.
In Java, attributes can be of various types, including primitive data types (int, double, boolean, etc.) and reference data types (objects, arrays, etc.).
They can also have default values if not explicitly initialized.
In the context of a class, attributes represent the characteristics or properties of the objects created from that class.
For example, if we have a class called "Car", it might have attributes like "color", "make", "model", and "year" to represent the properties of a car object.
*/
 class attributes {
    
    int x = 5; // This is an attribute (field) of the class
    String name = "John"; // Another attribute of the class
}


/*Accessing Attributes:
    Attributes can be accessed by creating an object of the class and by using the dot operator.
In the example above, we have created a class called "attributes" with two attributes: "x" and "name".
In the main method, we create an object of the "attributes" class called "myObj". 
We then access the attributes "x" and "name" using the dot operator and print their values to the console.   
*/
public class TestAttributes {
  public static void main(String[] args) {
    attributes myObj = new attributes();
    System.out.println(myObj.x);
    System.out.println(myObj.name);
  }
}