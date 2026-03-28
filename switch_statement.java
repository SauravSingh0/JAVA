public class switch_statement {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 0:
                System.out.println("Number is Zero.");
                break;
            case 1:
                System.out.println("Number is ONE.");
                break;
            case 2:
                System.out.println("Number is TWO.");
                break;
            default:
                System.out.println("The Number is :" + num);
        }
    }

}