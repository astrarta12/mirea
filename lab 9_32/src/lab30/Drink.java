package lab30;

public final class Drink extends lab30.MenuItem implements lab30.Alcoholable {

    private double alcoholVol;
    private lab30.DrinkTypeEnum type;

    public Drink(int cost, String name, String description, double alcoholVol, lab30.DrinkTypeEnum type) {
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

    public lab30.DrinkTypeEnum getType() {
        return type;
    }
}
