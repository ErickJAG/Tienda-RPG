import java.util.ArrayList;
import java.util.List;

public class Character {

    //atributos del personaje
    private int Dinero;
    private int Vida;
    private int Ataque;
    private int Magia;
    private int Defensa;
    private int Velocidad;

    public static void main(String[] args) {
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
