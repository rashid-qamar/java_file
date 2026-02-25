import java.util.Scanner;

public class CoPrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, hcf = 1;

        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        if (hcf == 1)
            System.out.println("Co-prime numbers");
        else
            System.out.println("Not co-prime numbers");

        sc.close();
    }
}
