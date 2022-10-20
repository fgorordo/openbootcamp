package intro.oop.encapsulation_exercise;

public class encap_exercise {
    public static void main(String[] args) {
        Persona user1 = new Persona();

        user1.setEdad(26);
        user1.setNombre("Fernando");
        user1.setTelefono("+54 9 11 2233-4455");

        System.out.println("Hola mi nombre es " + user1.getNombre() + " tengo " + user1.getEdad() + " años. Y mi número de telefono es " + user1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
