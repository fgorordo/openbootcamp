package intro.flow_control_exercise;

public class Flow_control_exercise {
    /*
     * If, crear una condición que compare si al variable <numeroIf> es positivo, negativo o 0;
     * 
     * While, <numeroWhile> inferior a 3 y el bucle debera incrementar el valor de la variable en uno cada vez que se ejecute
     * y mostrarlo por pantalla cada vez que se ejecute;
     * 
     * Do While, misma estructura que el while pero que solo se ejecute una vez;
     * 
     * For, crea una variable <numeroFor>, esta variable tendra como valor 0 y su condición será que la variable sea igual
     * o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse en pantalla.
     * 
     * Switch, deberás crear la variable <estacion> y distintos case para las cuatro estaciones del año.
     * Evaluar todos los criterios e imprimir por consola la información de que estación nos encontramos.
     * en caso default devolver un mensaje para confirmar dato incorrecto
     */

    public static void main(String[] args) {
        useIf();
        useWhile();
        useDoWhile();
        useFor();
        useSwitch();
    }

    public static void useIf() {
        int numeroIf = 3;

        if(numeroIf > 0) {
            System.out.println("El número es positivo" + "("+ numeroIf +")");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo" + "("+ numeroIf +")");
        } else {
            System.out.println("El número es cero" + "("+ numeroIf +")");
        }
    }

    public static void useWhile() {
        int numeroWhile = 0;

        while(numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("Este print se ejecuta para cofirmar que salimos del bucle while");
    }

    public static void useDoWhile() {
        int numeroWhile = 0;

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while(numeroWhile <= 0);

        System.out.println("Estamos por fuera del do while");
    }

    public static void useFor() {
        for(int numeroFor = 0;numeroFor <= 3;numeroFor++) {
            System.out.println("numeroFor= " + numeroFor);
        }
    }

    public static void useSwitch() {
        String estacion = "Verano";

        switch(estacion.toLowerCase()) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("Ingresa una estación del año válida");
        }
    }
}
