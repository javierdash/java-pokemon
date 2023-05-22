
package Logica;

//clase abstracta porque todos los pokemones van a utilizarla..
public abstract class Pokemon {
    
    //atributos
    protected int num_pokedex;
    protected String nombre_pokemon;
    protected double pesoPokemon;
    protected String sexo;
    protected int temporada;
    protected int tipo;
    
    protected abstract void atacarPlacaje();
        
    protected abstract void atacarAraniazo();
    
    protected abstract void atacarMordisco();
    
    
    //constructor sin y con métodos
    protected Pokemon() {
    }

    protected Pokemon(int num_pokedex, String nombre_pokemon, double pesoPokemon, String sexo, int temporada, int tipo) {
        this.num_pokedex = num_pokedex;
        this.nombre_pokemon = nombre_pokemon;
        this.pesoPokemon = pesoPokemon;
        this.sexo = sexo;
        this.temporada = temporada;
        this.tipo = tipo;
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

    public String getSexo() {
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
    public String toString() {
        return "Pokemones{" + "num_pokedex=" + num_pokedex + ", nombre_pokemon=" + nombre_pokemon + ", pesoPokemon=" + pesoPokemon + ", sexo=" + sexo + ", temporada=" + temporada + ", tipo=" + tipo + '}';
    }
    
    
    
    
}
