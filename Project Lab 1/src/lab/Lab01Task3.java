package lab;

public class Lab01Task3 {
    private double value = 1;
    private String result = "";
    public void harmonicSeriesOut(){
        System.out.println("Гармонический ряд: ");
        for (int i = 0; i < 10; i++){
            System.out.println((float)(Math.round(1.0 / (i+1) * 100.0))/100);
        }
    }
}