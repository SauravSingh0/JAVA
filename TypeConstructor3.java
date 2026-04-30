/*Copy Constructor
 *A copy constructor is a constructor that creates a new object as a copy of an existing object.
  It takes an object of the same class as a parameter and initializes the new object with the values of the existing object.
  The copy constructor is used to create a new object that is a copy of an existing object, which can be useful in situations
   where you want to create a new object with the same state as an existing object without modifying the original object.

 */

class Student{
    int id;
    String name;
    Student(int i,String n){
        id =i;
        name =n;
    }
    Student(Student s){
        id = s.id;
        name =s.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
public class TypeConstructor3 {
    public static void main(String[] args) {
        Student s1=new Student(1,"Ram");
        Student s2 = new Student(s1);      
      
        s1.display();
        s2.display();
    }
    
}