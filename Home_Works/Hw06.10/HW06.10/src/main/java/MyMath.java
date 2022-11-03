public class MyMath {
    public static void main(String[] args) {

        int a = 20;
        int b = 3;
        Add(a,b);
        Sub(a,b);
        Mult(a,b);
        Div(a,b);
    }
    private static void Div(int a, int b) {
        System.out.println(a/b);
    }
    private static void Mult(int a, int b) {
        System.out.println(a*b);
    }
    private static void Sub(int a, int b) {
        System.out.println(a-b);
    }
    private static void Add(int a, int b) {
        System.out.println(a+b);
    }
}
