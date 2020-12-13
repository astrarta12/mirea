package lab24.ex2;

public class Main {

    public static void main(String[] args) {
        System.out.println(
                lab24.ex2.Address.parseWithSplit("England, London, BakerStreet, 221b",",")
        );
        System.out.println(
                lab24.ex2.Address.parseWithStringTokenizer("England, London, BakerStreet, 221b",",")
        );
    }

}
