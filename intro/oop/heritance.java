package intro.oop;

public class heritance {
    public static void main(String[] args) {

    }
}

abstract class VehiculoHeri {
    int velocidadMaxima;
    String matricula;
    String sonido;

    abstract public String getSonido();

    abstract public void setSonido(String sonido);

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

class Motor {
    private String tipoMotor;

    public Motor() {

    }

}
