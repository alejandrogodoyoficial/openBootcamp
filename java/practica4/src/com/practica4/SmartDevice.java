package practica4.src.com.practica4;

public class SmartDevice {
    int id;
    String name;
    String model;
    String cpu;
    double memory;
    double ram;
    double sizeScreen;
    double price;

    public SmartDevice() {
    };

    public SmartDevice(int id, String name, String model, String cpu, double memory, double ram, double sizeScreen,
            double price) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.cpu = cpu;
        this.memory = memory;
        this.ram = ram;
        this.sizeScreen = sizeScreen;
        this.price = price;
    }

}