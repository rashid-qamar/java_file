public class AccidentNumber {

    static boolean isPerfectSquare(int n) {
        if (n < 0) return false;

        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        for (int num = 1000; num <= 9999; num++) {

            int first2 = num / 100;   // first 2 digits
            int last2  = num % 100;   // last 2 digits

            if (isPerfectSquare(first2) && isPerfectSquare(last2) && isPerfectSquare(num)) {
                System.out.println("Vehicle Number = " + num);
            }
        }
    }
}
