package intro.oop;

public class oop_private_abstraction_encap {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        
        vehiculo.setType("Deportivo");
        System.out.println(vehiculo.getType());
    }

}

class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getType() {
        return this.tipo;
    }

    public void setType(String tipo) {
        this.tipo = tipo;
    }
}

abstract class VehiculoAbs {
    private String tipo;
    private int velocidadMaxima;

    abstract public String getSonido();
    abstract public void setSonido(String sonido);

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
