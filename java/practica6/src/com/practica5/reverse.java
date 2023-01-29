package practica6.src.com.practica5;

import java.io.FileInputStream;

import java.io.InputStream;
import java.io.PrintStream;

class Reverse {

    static void reverse(String texto) {

        System.out.println("You're using the reverse function");

        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println("\n");
    }

    static void oneDimention(String[] myList) {

        System.out.println("You're using the interesting function on one dimention");
        for (String i : myList) {
            System.out.println(i);
        }
        System.out.println("");
    }

    static void twoDimention(int[][] myList) {

        for (int i = 0; i < myList.length; i++) {

            for (int j = 0; j < myList[i].length; j++) {
                System.out.println("El elemento en la posicion " + i +
                        " y en la sub posicion " + j + "es " + myList[i][j]);
            }
        }
    }

    static double DividePorCero(double a, double b) throws ArithmeticException {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
    }

    static void copyFile(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] data = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(data);
            out.close();
        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }
    }
}