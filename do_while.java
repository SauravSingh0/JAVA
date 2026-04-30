//This is a simple Java program that uses a do-while loop to print the first 10 even numbers. The loop starts with the variable `i` initialized to 0, and in each iteration, it prints the current value of `i` and then increments `i` by 2. The loop continues until `i` exceeds 10, ensuring that only the first 10 even numbers (0, 2, 4, 6, 8, and 10) are printed.

public class do_while {
    public static void main(String[] args) {
        int i =0;
        do{
            System.out.println("First 10 even no are :"+i);
            i=i+2;
        }while(i<=10);
    }
}
