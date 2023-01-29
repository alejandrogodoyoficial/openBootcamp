package practica6.src.com.practica5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Reverse.reverse("Hola mundo");
        String[] colors = { "red", "blue", "green", "pink", "yellow" };

        Reverse.oneDimention(colors);

        int[][] ArrayTwoDimention = { { 33, 432, 6 }, { 345, 665, 34 }, { 234, 43 } };

        Reverse.twoDimention(ArrayTwoDimention);

        Vector<String> myVector = new Vector<>();

        for (String i : colors) {
            myVector.add(i);
        }
        System.out.println(myVector);
        myVector.remove(1);
        myVector.remove(2);
        System.out.println(myVector);

        /*
         * P: Indica cuál es el problema de utilizar un Vector con la capacidad por
         * defecto
         * si tuviésemos 1000 elementos para ser añadidos al mismo.
         * 
         * R: Si ultilizamos la capacidad por defecto de los vectores cada vez que la
         * cantidad de elementos supere la capacidad del vecto, esta hara una copia del
         * vector
         * en uno nuevo cambiando la capacidad, pero este proceso puede consumir muchos
         * recusos si el vector en muy grande.
         */

        ArrayList<String> moreColors = new ArrayList<>();

        LinkedList<String> moreColorsCopy = new LinkedList<>();

        for (String i : colors) {
            moreColors.add(i);
            System.out.println("Elemento del ArrayList " + i);
            moreColorsCopy.add(i);
            System.out.println("Elemento del KinkedList " + i);
            if (i == "pink") {
                break;
            }
        }

        ArrayList pairNumbers = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                pairNumbers.add(i);
                System.out.println(i);
            }
        }

        try {
            Reverse.DividePorCero(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        Reverse.copyFile("myFile.txt", "copy.txt");

    }

}