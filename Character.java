import java.util.ArrayList;
import java.util.List;

public class Character {

    //atributos del personaje
    public int Dinero;
    public int Vida;
    public int Ataque;
    public int Magia;
    public int Defensa;
    public int Velocidad;
    
    public static void main(final String[] args) {
        Character personaje = new Character();
        personaje.Ataque= 5;
        personaje.Vida= 5;
        personaje.Dinero= 5000;
        personaje.Magia= 5;
        personaje.Defensa= 5;
        personaje.Velocidad= 5;
    }
    List<Armadura> inventarioDArmaduras = new ArrayList<>();
    List<Armas> inventarioArmas = new ArrayList<>();
    List<Consumibles> inventarioConsumibles = new ArrayList<>();

}
