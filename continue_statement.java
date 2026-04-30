//THE CONTINUE STATEMENT IN JAVA IS USED TO SKIP THE CURRENT ITERATION OF A LOOP AND MOVE TO THE NEXT ITERATION. WHEN THE CONTINUE STATEMENT IS ENCOUNTERED, THE CONTROL IMMEDIATELY JUMPS TO THE NEXT ITERATION OF THE LOOP.
public class continue_statement {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }
    }
}
