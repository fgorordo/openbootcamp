package intro.video_code;

public class forCicle {
    public static void main(String[] args) {
     basicFor();
     arrayCicling();
     javaFor();
    }

    public static void basicFor() {
        for (int contador = 0; contador <= 100; contador++){
                System.out.println(contador);
        }
    }
    
    public static void arrayCicling() {
        int valores[] = {10, 20, 30, 40, 50};
        for (int i = 0; i < valores.length; i++) {
            System.out.println(i);
            System.out.println(valores[i]);
        }
    }

    public static void javaFor() {
        int valores[] = {10, 20, 30, 40, 50};
        for(int items : valores ) {
            System.out.println(items);
        }
    }
}
