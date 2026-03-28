public class nested_if {
    public static void main(String[] args) {
        int a = 10;
        if (a > 40) {
            System.out.println("A is greater than 40.");
            if (a > 50) {
                System.out.println("A is greater than 50.");
            }
            }
             else if (a < 40 && a>=0) {
                System.out.println("A is smaller than 40.");
            } 
            else {
                System.out.println("A is invalid number.");
            }
    }

}
