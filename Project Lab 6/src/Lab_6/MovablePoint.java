package Lab_6;


public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        System.out.println("Movable point created");
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
        System.out.println("Y-coordinate was changed(down):" + y);
    }

    @Override
    public void moveUp() {
        y += ySpeed;
        System.out.println("Y-coordinate was changed(up):" + y);
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
        System.out.println("X-coordinate was changed(left):" + x);
    }

    @Override
    public void moveRight() {
        x += xSpeed;
        System.out.println("X-coordinate was changed(right):" + x);
    }

    @Override
    public String toString() {
        return String.format("Movable point {x: %d, y: %d, x-Speed: %d, y-Speed: %d}", x, y, xSpeed, ySpeed);
    }
}

