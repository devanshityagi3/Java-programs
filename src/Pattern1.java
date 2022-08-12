public class Pattern1 {

    public static void main(String[] args) {

    }

    static void pattern1(int n){
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.println("* ");
            }
            //when one row is printed, we need to add a newline
            System.out.println("\n");
        }
    }
}
