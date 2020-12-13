package lab10;
import java.util.Scanner;

public class Ex16 {
    public static void rec(int max, int c) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                rec(n, 1);
            } 
            else if (n == max) {
                rec(max, ++c);
            } 
            else {
                rec(max, c);
            }
        } else {
            System.out.println(c);
        }
    }
    public static void main(String []args){
        rec(0,0);
    }
}
