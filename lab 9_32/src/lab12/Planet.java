package lab12;

import static java.lang.StrictMath.pow;

public enum Planet{
    MERCURY(3.3,2440),
    VENUSIAN(48.7,6052),
    EARTH(59.7,6357),
    MARS(6.42,6786),
    JOVIAN(19000,71398),
    SATURN(5690,60300),
    URANIUM(869,23800),
    NEPTUNE(1040,22200);
    private int radius;
    private double mass;
    Planet(double mass, int radius){
        this.radius=radius;
        this.mass=mass;
    };

    public void setRadius(int radius) {
        this.radius = radius;
    };
    public int getRadius() {
        return radius;
    };
    public double getForce(){
        return 6.67*(mass*(pow(10,6)))/(pow(radius,2));
    }
}
