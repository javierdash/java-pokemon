
package Logica;


public class Pikachu extends Pokemon implements IElectrico {

    //atributos propios??
    
    //constructores
    public Pikachu() {
    }

    public Pikachu(int num_pokedex, String nombre_pokemon, double pesoPokemon, String sexo, int temporada, int tipo) {
        super(num_pokedex, nombre_pokemon, pesoPokemon, sexo, temporada, tipo);
    }

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public String getNombre_pokemon() {
        return nombre_pokemon;
    }

    public void setNombre_pokemon(String nombre_pokemon) {
        this.nombre_pokemon = nombre_pokemon;
    }

    public double getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public String isSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("////estoy atacando con placaje////");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("////estoy atacando con arañazo////");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("////estoy atacando con mordisco////");
    }
    
    
    @Override
    public void atacarImpactrueno() {
        System.out.println("**estoy atacando con Impactrueno**");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("**estoy atacando con PunioTrueno**");
    }

    @Override
    public void atacarRayo() {
        System.out.println("estoy atacando con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("estoy atacando con RayoCarga");
    }
    
    
    
}
