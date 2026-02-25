import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        int [][] a = new int[10][10];
        int n, d=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Matrix(mxn): ");
        n = sc.nextInt();

        System.out.println("Enter Matrix Element: ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix elements are: ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of Minor Diagonal: ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if (i+j == n-1) {
                    d += a[i][j];
                }
            }
        }
        System.out.println(d);

    }
}
