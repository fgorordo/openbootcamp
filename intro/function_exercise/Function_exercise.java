package intro.function_exercise;

public class Function_exercise {
    public static void main(String[] args) {
        int resultadoDeSuma  = sumarConsecutivos(10,20,30);
        System.out.println("************************************************************************************************");
        System.out.println("Primera parte, sumar consecutivos (10 + 20 + 30)");
        System.out.println(resultadoDeSuma);
        System.out.println("************************************************************************************************");
        
        Auto miAuto = new Auto();
        System.out.println("************************************************************************************************");
        System.out.println("Segunda parte, agregar puertas al auto");
        System.out.println("Mi auto tiene actualmente tiene " + miAuto.puertas + " puertas.");
        miAuto.incrementarPuertas();
        miAuto.incrementarPuertas();
        System.out.println("Hemos incrementado el número de puertas desde un método, actualmente el auto tiene " + miAuto.puertas + " puertas.");
        System.out.println("************************************************************************************************");

    }

    public static int sumarConsecutivos(int a, int b, int c) {
        return a + b + c;
    }
}

class Auto {
    public int puertas = 2;
    public void incrementarPuertas(){
        this.puertas ++;
    }
}
