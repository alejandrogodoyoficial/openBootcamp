package practica5.src.com.practica5;

public class Coche {

    String color;

    Coche(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Soy un carro color " + color;
    }
}