package intro.video_code;

public class switchCond {
    public static void main(String[] args) {
        String estacion = "rano";

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
