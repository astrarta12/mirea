package lab4;

public class Square extends Rectangle {
    

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        setSide(side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return String.format("Square {Side: %.2f, Width: %.2f, Length: %.2f, Color: %s, Filled: %s}",
                this.getSide(),
                this.getWidth(),
                this.getLength(),
                this.getColor(),
                this.isFilled());
    }
}
