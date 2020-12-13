package lab10;

public class Ex01 {
    public static String rec(int n) {
        int sum = 0;
        int j = 0;
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            System.out.print(rec(--n) + " " + j);
        }
        return "";
    }
    public static void main(String[] args) {
        rec(7);
    }
}
