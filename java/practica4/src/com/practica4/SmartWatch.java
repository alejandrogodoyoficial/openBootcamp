package practica4.src.com.practica4;

public class SmartWatch extends SmartDevice {
    String watchbandColor;
    String watchbandType;

    public SmartWatch() {
    };

    public SmartWatch(int id, String name, String model, String cpu, Double memory, double ram, double sizeScreen,
            double price, String watchbandColor, String watchbandType) {
        super(id, name, model, cpu, memory, ram, sizeScreen, price);
        this.watchbandColor = watchbandColor;
        this.watchbandType = watchbandType;
    };

    public String toString() {
        return "I'm a SmartWatch";
    }

}