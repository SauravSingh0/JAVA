/* Default Constructor 
 *If no constructor is defined in the class, then the compiler automatically provides a default constructor.
  The default constructor is a no-argument constructor that initializes the instance variables to their default values.
Here we will see the default constructor in action. In the Student class, we have not defined any constructor, 
so the compiler will provide a default constructor that initializes the id to 0 and name to null. 
When we create objects s1 and s2 of the Student class and call the display method, it will print the default values of id and name.
 */

class Student{
int id;
String name;
void display(){
    System.out.println(id+" "+name);
}}
public class TypeConstructor1 {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2 = new Student();
        s1.display();
        s2.display();
    }
    
}
