package intro.oop;

public class interfaces {
    public static void main(String[] args) {

    }
}

interface VehiculoInterface {
    int velocidadActual = 0;
    void Acelerar(int velocidad);
    void Frenar(int velocidad);
}

class Coche implements VehiculoInterface {
    int velocidadActual;
    public void Acelerar(int velocidad) {
        velocidadActual = velocidadActual + velocidad;
    }

    public void Frenar(int velocidad) {
        velocidadActual = velocidadActual - velocidad;
    }
}
