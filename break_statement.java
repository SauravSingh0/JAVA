//THE BREAK STATEMENT IN JAVA IS USED TO EXIT A LOOP OR SWITCH STATEMENT BEFORE IT COMPLETES. WHEN THE BREAK STATEMENT IS ENCOUNTERED, THE CONTROL IMMEDIATELY EXITS THE CURRENT LOOP OR SWITCH AND CONTINUES WITH THE NEXT STATEMENT AFTER THE LOOP OR SWITCH.
public class break_statement {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 6) {
                break;
            }
        }
    }
}
