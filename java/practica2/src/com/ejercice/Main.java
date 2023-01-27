package practica2.src.com.ejercice;

public class Main {
    public static void main(String[] args) {
        System.out.println(masIva(34));
        System.out.println(masIva(89));
        System.out.println(masIva(296 + 45));
    }

    public static double masIva(double num) {
        double iva = (num * 21) / 100;
        return num + (num + iva);
    }
}