package lab10;

public class Ex10 {
    public static int ret(int n, int i){
        if (n == 0){
            return i;
        }
        else{
            return ret(n / 10,i * 10 + n % 10);
        }
    }
    public static void main(String []args){
        System.out.println(ret(158,0));
    }
}
