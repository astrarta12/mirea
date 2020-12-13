package lab10;
import java.util.Scanner;

public class Ex13 {
    public static void rec() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) rec();
        }
    }
    public static void main(String []args){
        rec();
    }
}
