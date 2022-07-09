public class Main {
    public static void main(String[] args){
    Cliente pedro = new Cliente();
    pedro.credito = 100;
    pedro.edad = 25;
    pedro.nombre = "pedro";
    pedro.telefono = "999-555-6666";

        System.out.println(pedro.credito + " " + pedro.edad + " " + pedro.telefono + " " + pedro.nombre);
    }

}

class Persona {
    int edad = 45;
    String nombre = "leo";
    String telefono = "909-999-9999";
}

class Cliente extends Persona {
    int credito = 0;
}

class Trabajador extends Persona {
    int salario = 1800;
}