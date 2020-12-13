package lab10;

public class Ex06 {
    public static boolean rec(int n, int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return rec(n, i + 1);
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        if (rec(139, 2) == false) System.out.println("NO");
        else System.out.println("YES");
    }
}
