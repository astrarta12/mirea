package lab10;

public class Ex08 {
    public static boolean pal(String s){
        int n = s.length();
        for (int i = 0; i < n / 2; i++){
            if(s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        String s = "deified";
        if(pal(s)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
