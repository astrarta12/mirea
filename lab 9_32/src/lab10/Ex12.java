package lab10;
import java.util.Scanner;

public class Ex12 {
    public static void rec() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                rec();
            }
            else rec();
        }
    }
    public static void main(String []args){
        rec();
    }
}
