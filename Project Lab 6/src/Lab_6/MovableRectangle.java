package Lab_6;

public class MovableRectangle implements Movable{
    private MovablePoint p_right, p_left;

    public MovableRectangle(int x_right, int y_right, int xSpeed_right, int ySpeed_right,
                            int x_left, int y_left, int xSpeed_left, int ySpeed_left) {
        this.p_right = new MovablePoint(x_right,y_right,xSpeed_right, ySpeed_right);
        this.p_left = new MovablePoint(x_left,y_left,xSpeed_left, ySpeed_left);
    }

    public boolean checkSpeed(int xSpeed_right, int ySpeed_right, int xSpeed_left, int ySpeed_left){
        if ((xSpeed_left == xSpeed_right) & (ySpeed_left==ySpeed_right)){
            return true;
        }
        else return false;
    }


    @Override
    public void moveUp() {
        if (checkSpeed(p_right.xSpeed,p_right.ySpeed,p_left.xSpeed,p_left.ySpeed)){
            p_right.moveUp();
            p_left.moveUp();
        }
        else System.out.println("Error");
    }

    @Override
    public void moveDown() {
        if (checkSpeed(p_right.xSpeed,p_right.ySpeed,p_left.xSpeed,p_left.ySpeed)){
            p_right.moveDown();
            p_left.moveDown();
        }
        else System.out.println("Error");
    }

    @Override
    public void moveRight() {
        if (checkSpeed(p_right.xSpeed,p_right.ySpeed,p_left.xSpeed,p_left.ySpeed)){
            p_right.moveRight();
            p_left.moveRight();
        }
        else System.out.println("Error");
    }

    @Override
    public void moveLeft() {
        if (checkSpeed(p_right.xSpeed,p_right.ySpeed,p_left.xSpeed,p_left.ySpeed)){
            p_right.moveLeft();
            p_left.moveLeft();
        }
        else System.out.println("Error");
    }

    public String toString() {
        return String.format("Movable Rectangle {Width: %.2f, Length: %.2f}");
    }
}
