package practica4.src.com.practica4;

public class SmartPhone extends SmartDevice {
    double pxCamera;

    public SmartPhone() {
    };

    public SmartPhone(int id, String name, String model, String cpu, Double memory, double ram, double sizeScreen,
            double price, Double pxCamera) {
        super(id, name, model, cpu, memory, ram, sizeScreen, price);
        this.pxCamera = pxCamera;
    }

    public String toString() {
        return "I'm a SmartPhone";
    }

}