import java.util.*;

public class camel {

    static int lcm(int a, int b) {
        return (a * b) / gcd(a,b);
    }

    static int gcd(int a, int b) {
        if(b == 0) 
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of camel: ");
        int camel = sc.nextInt();

        System.out.print("Enter number of sons: ");
        int son = sc.nextInt();

        int sons[] = new int[son];

        for(int i=0; i<son; i++) {
            System.out.print("Enter denominator of son " + (i+1) + ": ");
            sons[i] = sc.nextInt();
        }

        int lcm = sons[0];
        for(int i=1; i<son; i++) {
            lcm = lcm(lcm, sons[i]);
        }

        int borrow = 0;
        while((camel + borrow) % lcm != 0) { 
            borrow++;
        }

        int total = camel + borrow;
        System.out.println("Total camel after borrowing: " + total);

        int distributed = 0;
        for (int i = 0; i < son; i++) {
            int share = total / sons[i];
            System.out.println("Son " + (i + 1) + " gets: " + share);
            distributed += share;
        }

        System.out.println("Total camel distributed: " + distributed);
        System.out.println("Camel returned: " + (total - distributed));
    }
}
