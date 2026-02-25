import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        // float f = sc.nextFloat();
        // double d = sc.nextDouble();
        // String s = sc.next();
        // char c = sc.next().sc.charAt(0);

        int fact=1;
        int i=1;
        while(i <= num) {
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }

}
