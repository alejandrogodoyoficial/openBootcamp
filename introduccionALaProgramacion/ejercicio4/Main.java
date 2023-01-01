// En este ejercicio practicarás las estructuras de control, para ello deberás crear:

//1) Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
// Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

// 2) Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:

// Incrementar el valor de la variable en uno cada vez que se ejecute.

// Mostrarlo por pantalla cada vez que se ejecute.

// 3) Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

// 4) Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

// 5) Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.


class Main{
    public static void main(String[] args) {
        //(1)
        System.out.println("Ejercicio 1");

        int numeroIf = 0;
        if(numeroIf == 0){
            System.out.println("El numero es 0");
        }else if(numeroIf > 0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("el numero es negativo");
        }

        //(2)
        System.out.println("Ejercicio 2");
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //(3)
        System.out.println("Ejercicio 3");
        do{
            System.out.println(numeroWhile);  
        }while(numeroWhile < 3);

        //(4)
        System.out.println("Ejercicio 4");
        for(int umeroFor = 0; umeroFor <= 3; umeroFor++){
            System.out.println(umeroFor);
        }

        //(5)
        String estacion = "primavera";

        switch(estacion){
            case "verano":
            System.out.println("Estamos en verano");
            break;
            case "invierno":
            System.out.println("Estamos en invierno");
            break;
            case "otoño":
            System.out.println("Estamos en otoño");
            break;
            case "primavera":
            System.out.println("Estamos en primavera");
            break;
            default:
            System.out.println("Error, no es una estacion del año");
            break;
        }
    }
    
}