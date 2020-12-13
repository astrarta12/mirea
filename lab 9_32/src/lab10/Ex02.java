package lab10;

public class Ex02 {
    public static void rec(int n) {
        if (n == 1) System.out.println(1);
        if (n > 1) {
            rec(n - 1);
            System.out.println(n);
        }
    }
        public static void main(String[] args) {
            rec(20);
        }
}

