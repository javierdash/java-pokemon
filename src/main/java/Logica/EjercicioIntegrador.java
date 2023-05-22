
package Logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        
        //instancio a Pikachu?? para eso deberia haber + de 1...??
        Pikachu pika1 = new Pikachu(1, "pika1PAPA", 80.00, "M", 1, 1);
        
        
        
        System.out.println("Soy" + pika1.getNombre_pokemon());
        pika1.atacarImpactrueno();
        pika1.atacarMordisco();
        
    }
}
