import java.util.*;

public class matrix {
    
    static int n;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered elements are: ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.println(a[i][j]);
            }
            System.out.println();
        }

        int major = Major(a);
        int minor = Minor(a);

        if(major == minor) {
            System.out.println("Both diagonal are Equal !!");
        }
        else {
            System.out.println("Both diagonal are NOT Equal !!");
        }
    }

    //For Minor Diagonal
    static int Minor(int a[][]) {
        int minor_d = 0;
        for(int i=0; i<=n; i++) {
            for(int j=0; j<n; j++) {
                if((i+j) == (n-1)) {
                    minor_d += a[i][j];
                }
            }
        }
        return minor_d;
    }

    //For Major Diagonal
    static int Major(int a[][]) {
        int major_d = 0;
        for(int i=0; i<=n; i++) {
            for(int j=0; j<n; j++) {
                if(i == j) {
                    major_d += a[i][j];
                }
            }
        }
        return major_d;
    }
}
