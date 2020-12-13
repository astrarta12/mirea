package lab8.ex1;

import java.awt.*;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, double x, double y) {
        super.generatePosition((int)x, (int)y);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void draw(Graphics2D g) {
        g.drawRect(x, y, (int)width, (int)length);
    }
}
