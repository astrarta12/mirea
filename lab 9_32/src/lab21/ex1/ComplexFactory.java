package lab21.ex1;

public class ComplexFactory implements ComplexAbstractFactory {
    @Override
    public lab21.ex1.Complex create(double real, double img) {
        return new lab21.ex1.Complex(real, img);
    }
}
