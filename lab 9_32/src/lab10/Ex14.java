package lab10;

public class Ex14 {
    public static String rec(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return rec(n / 10) + " " + n % 10;
        }
    }
    public static void main(String []args){
        System.out.println(rec(253));
    }
}
