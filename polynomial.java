import java.util.*;

public class polynomial {

    static int[] a = new int[10];
    static int[] b = new int[10];
    static int[] c = new int[10];
    static int a_size;
    static int b_size;

    static void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nOptions ---");
        System.out.println("var - 0");
        System.out.println("x   - 1");
        System.out.println("x^2 - 2");
        System.out.println("x^3 - 3");
        System.out.println("x^4 - 4");
        System.out.println("x^5 - 5");
        System.out.println("x^6 - 6");
        System.out.println();
        System.out.println("Use this number at as a last digit while entering input");

        System.out.print("Enter size of A: ");
        a_size = sc.nextInt();

        System.out.println("Enter A elements: ");
        for(int i=0; i<a_size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("\nEnter size of B: ");
        b_size = sc.nextInt();

        System.out.println("Enter B elements: ");
        for(int i=0; i<b_size; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();
    }

    static void add() {
        // Traverse A
        for(int i = 0; i < a_size; i++) {
            int pa = a[i] % 10;      // power
            int ca = a[i] / 10;      // coefficient
            c[pa] += ca;
        }

        // Traverse B
        for(int i = 0; i < b_size; i++) {
            int pb = b[i] % 10;
            int cb = b[i] / 10;
            c[pb] += cb;
        }

        System.out.println("Result Polynomial:");
        for(int i = c.length - 1; i >= 0; i--) {
            if(c[i] != 0) {
                System.out.print(c[i] + "x^" + i + "  ");
            }
        }
    }

    public static void main(String[] args) {
        input();
        add();
    }
}
