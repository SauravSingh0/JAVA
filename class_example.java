//IN THIS EXAMPLE, WE HAVE CREATED A CLASS NAMED "class_example" WITH THREE VARIABLES: "id", "name", AND "x". IN THE MAIN METHOD, WE CREATE AN OBJECT OF THE CLASS AND PRINT THE VALUES OF THESE VARIABLES TO THE CONSOLE.
public class class_example {

    int id = 001 ;
    String name = "Saurav kumar singh";
    int x = 10;

    public static void main(String[] args) {
        class_example s1 = new class_example();
        System.out.println(s1.id);
        System.out.println(s1.name);
        
        class_example myobj = new class_example();
        System.out.println(myobj.x);
    }
}