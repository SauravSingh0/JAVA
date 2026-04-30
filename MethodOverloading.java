/* Method Overloading in Java :
Method overloading is a feature in Java that allows a class to have more than one method with the same name, as long as their parameter lists are different.
 This is also known as compile-time polymorphism or static polymorphism. The main advantage of method overloading is that it allows you to create multiple methods with the same name.
    This can make your code more readable and easier to maintain, as you can use the same method name for similar operations that differ in the type or number of parameters.   
Example of Method Overloading:
 */

public class MethodOverloading {
    
    // Overloaded method with int parameters
    public int myMethod(int a, int b) {
        return a + b;
    }

    // Overloaded method with double parameters
    public double myMethod(double a, double b) {
        return a + b;
    }

    // Overloaded method with String parameters
    public String myMethod(String a, String b) {
        return a + b;
    }

    // Main method to test overloading
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        
        System.out.println(obj.myMethod(5, 10));              // Output: 15
        System.out.println(obj.myMethod(5.5, 10.5));          // Output: 16.0
        System.out.println(obj.myMethod("Hello, ", "World!")); // Output: Hello, World!
    }
}
