package intro.oop.heritance_exercise;

public class heritance_exercise {
    public static void main(String[] args) {
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setCredito(1000);
        nuevoCliente.setEdad(25);
        nuevoCliente.setNombre("Carlos");
        nuevoCliente.setTelefono("+54 9 11 2233-4455");

        Trabajador nuevoTrabajador = new Trabajador();
        nuevoTrabajador.setSueldo(1500);
        nuevoTrabajador.setEdad(30);
        nuevoTrabajador.setNombre("Pedro");
        nuevoTrabajador.setTelefono("+54 9 11 6677-8899");

        System.out.println("Clase Cliente");
        System.out.println("Nombre: " + nuevoCliente.getNombre());
        System.out.println("Edad: " + nuevoCliente.getEdad());
        System.out.println("Telefono: " + nuevoCliente.getTelefono());
        System.out.println("Credito: " + nuevoCliente.getCredito() + "\n");

        System.out.println("Clase Trabajador");
        System.out.println("Nombre: " + nuevoTrabajador.getNombre());
        System.out.println("Edad: " + nuevoTrabajador.getEdad());
        System.out.println("Telefono: " + nuevoTrabajador.getTelefono());
        System.out.println("Sueldo: " + nuevoTrabajador.getSueldo());
    }
}

class Persona {
    String nombre;
    int edad;
    String telefono;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

class Cliente extends Persona {
    double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    double sueldo;

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
