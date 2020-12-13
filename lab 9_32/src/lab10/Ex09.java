package lab10;

public class Ex09 {
    public static int seq(int a,int b){
        if (a > b + 1){
            return 0;
        }
        if (a == 0 || b == 0){
            return 1;
        }
        return seq(a, b - 1) + seq(a - 1, b - 1);
    }
    public static void main(String []args) {
        int a = 5,b = 5;
        System.out.println(seq(a,b));
    }
}
