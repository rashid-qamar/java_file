import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();

        if(n == 1)
            System.out.println("Hello Rashid !");
        else
            System.out.println("N not equal to 1");
    }
}