import java.util.Scanner;


class IdliVada{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num%3 == 0 && num%5 == 0)
                System.out.println("Idli & Vada");
        else if(num%3 == 0 )
                System.out.println("Idli");
        else if(num%5 == 0 )
                System.out.println("Vada");
        else
                System.out.println("Nothing..");
    }
}