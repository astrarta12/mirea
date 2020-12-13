package lab21.ex2;



public class MagicChairFactory implements lab21.ex2.AbstractChairFactory {

    @Override
    public lab21.ex2.Chair create() {
        return new MagicChair();
    }

}