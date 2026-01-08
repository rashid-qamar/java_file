import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Roll no : ");
        int roll = sc.nextInt();
        System.out.println("Your roll number is: 24BTCS0" + roll + "HY");
        sc.nextLine();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, Mr. " + name);

        System.out.print("Enter your percentage: ");
        int marks = sc.nextInt();
        System.out.println("Congratulations! You're Qualified");
    }
}
