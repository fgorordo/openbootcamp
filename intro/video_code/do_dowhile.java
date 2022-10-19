package intro.video_code;

/* 
 While

 Se ejecutara hasta que se cumpla la condición especificada
 int contador = 10;

 MIENTRAS(contador mayor a cero)
    Resta uno al contador
 Continuo ejecución

 */

public class do_dowhile {
    public static void main(String[] args) {
        System.out.println("While Start");
        whileCicle();
        System.out.println("While End");
        System.out.println("DoWhile Start");
        doWhile();
        System.out.println("DoWhile End");
    }

    public static void whileCicle() {
        int contador = 10;
        while (contador > 0) {
            System.out.println(contador);
            contador--;
        }

        // Cuando se rompe el ciclo continua el código
    }

    public static void doWhile() {
        /*
         * Igual que el while pero ejecuta al menos una vez
         */
        int contador = 10;
        do {
            System.out.println(contador);
            contador --;
        } while (contador > 0);
    }
}
