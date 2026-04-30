/*Methods in Java are blocks of code that perform a specific task.
They are used to break down a program into smaller, more manageable pieces. 
Methods can be called from other parts of the program to execute the code within them.
Here's an example of a simple method in Java:
where we create a method named welcomeMessage that prints a welcome message to the console. 
 We then call this method from the main method to execute it.*/

public class methods_java {
  // Create a method named welcomeMessage
  static void welcomeMessage() {
    System.out.println("Welcome to Java!");
  }

  public static void main(String[] args) {
    // Call the welcome method here
    welcomeMessage();
  }
}
