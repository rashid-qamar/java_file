import java.util.*;

public class case1 {

    static int total=100;       //Total seats 
    static int rows=10;            //rows
    static int column=10;          //column

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(choice != 3) {
            System.out.println("\nOptions -");
            System.out.println("------------------");
            System.out.println("1. Book seat");
            System.out.println("2. Arrange seats");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    booking();
                    break;

                case 2:
                    arrangement();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    static void arrangement() {
        Scanner sc = new Scanner(System.in);
        total=0;
        rows=0;
        column=0;

        System.out.print("Enter total no. of seat: ");
        total = sc.nextInt();
        System.out.print("Enter no. of rows: ");
        rows = sc.nextInt();
        System.out.print("Enter no. of column: "); 
        column = sc.nextInt();   

        System.out.println();
        System.out.println("Arrangement for " + total + " (" + rows + "x" + column + ") " + "seats: ");

        int count=1;
        for(int i=1; i<=column; i++) {
            for(int j=1; j<=rows; j++) {
                System.out.print("S" + count + "\t");
                    count++;
            }
            System.out.println(); 
        }
    }

    static void booking() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nAvailable seats: " + total);
        System.out.print("Enter no. of seats you wanna book: ");
        int no_of_seats = sc.nextInt();
        int total1 = total;
        total -= no_of_seats;
        System.out.print("Enter no. of male(s): ");
        int male = sc.nextInt();
        System.out.print("Enter no. of female(s): ");
        int female = sc.nextInt();
        int count = no_of_seats+1;
        while(total1 != 0) {
            for(int i=1; i<=column; i++) {
                for(int j=1; j<=rows; j++) {
                    if(no_of_seats != 0) {
                        if(male != 0) {
                            System.out.print("M" + "\t");
                            male--;
                        }
                        else {
                            System.out.print("F" + "\t");
                            female--;
                        }
                        no_of_seats--;
                    }
                    else {
                        System.out.print("S" + count + "\t");
                        count++;
                    }
                    total1--;
                }
                System.out.println();
            }
        }
    }
}