public class fib {
    public static void main(String[] args) {
        System.out.print(0 + " " + 1);
        fib(0, 1);

    }

    static void fib(int a, int b) {
        if(b==34)
            return;
        System.out.print(" " + (a+b));
        fib(b, (a+b));
    }
}
