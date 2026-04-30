/* Parameterized Constructor : a constructor having specific number of parameter ,
which is used to initialize an object with specific values at the time of object creation. 

*Here we will see the parameterized constructor in action. In the Student class, 
we have defined a parameterized constructor that takes two parameters, id and name, to initialize the instance variables. 
When we create objects s1 and s2 of the Student class and call the display method, 
it will print the values of id and name that we passed while creating the objects.   

*/

class Student{
    int id;
    String name;
    Student(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
}}
public class TypeConstructor2 {
    public static void main(String[] args) {
        Student s1=new Student(1,"Ram");
        Student s2 = new Student(2,"Shyam");
        s1.display();
        s2.display();
    }
}
