package intro.oop;

public class oopIntro {
    public static void main(String[] args){
        Usuario usuario1 = new Usuario("Johana","Doe", "jhoanadoe@gmail.com","11/11/1991");

        Usuario usuario2 = new Usuario("Jhon", "Doe", "jhondoe@gmail.com", "11/11/1990");
        
        usuario1.saludar();
        usuario2.saludar();
    }

    static class Usuario {
        String nombre;
        String apellido;
        String email;
        String fechaDeNacimiento;

        public Usuario(String nombre, String apellido, String email, String fechaDeNacimiento) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.fechaDeNacimiento = fechaDeNacimiento;
        }

        public void saludar() {
            System.out.println("Hola mi nombre es: " + this.nombre + " " + this.apellido);
        }
    }
}
