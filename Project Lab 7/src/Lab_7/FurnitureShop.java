package Lab_7;

public class FurnitureShop {
    private Chair chair = new Chair();
    private Table table = new Table();

    public void welcome(){
        System.out.println("Welcome to the furniture shop!\n How can I help you?");
    }

    public void customerChairChoice(){
        System.out.println("Choose chair");
        chair.setColor();
        chair.setMaterial();
        System.out.println(chair.toString());
    }

    public void customerTableChoice(){
        System.out.println("Choose table");
        table.setColor();
        table.setMaterial();
        System.out.println(table.toString());
    }
}
