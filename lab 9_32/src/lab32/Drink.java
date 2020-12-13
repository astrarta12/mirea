package lab32;

public final class Drink extends MenuItem implements Alcoholable {

    private double alcoholVol;
    private lab32.DrinkTypeEnum type;

    public Drink(int cost, String name, String description, double alcoholVol, lab32.DrinkTypeEnum type) {
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return alcoholVol > 0;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }

    public lab32.DrinkTypeEnum getType() {
        return type;
    }
}
