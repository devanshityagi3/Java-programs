public class Shadowing {
    static int x=8;
    public static void main(String[] args) {
        int x = 9;
        System.out.println(x);
        
        {
            x=7;
        }
        System.out.println(x);
        f1();
    }
    static void f1(){
        System.out.println(x);
    }
}
