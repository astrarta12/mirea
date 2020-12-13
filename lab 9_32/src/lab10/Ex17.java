package lab10;
import java.util.Scanner;

public class Ex17 {
    public static void main(String []args){
        System.out.println(rec());
    }
    public static int rec() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        } 
        else {
            return Math.max(n, rec());
        }
    }
}
