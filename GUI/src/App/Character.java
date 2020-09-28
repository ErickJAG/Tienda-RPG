package App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Character {

    //atributos del personaje
    public int Dinero;
    public int Vida;
    public int Ataque;
    public int Magia;
    public int Defensa;
    public int Velocidad;
    List<Integer> inventarioDArmaduras = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
    List<Integer> inventarioArmas = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
    List<Integer> inventarioConsumibles = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
    //metodo de compra
    public static void comprar(String opcion) {
    	System.out.println(opcion);
    }
    //Metodo para definir los atributos de los objetos
    public static void main(final String[] args) {
        //Objeto
        Character personaje = new Character();
        //Definicions de atributos
        personaje.Ataque= 5;
        personaje.Vida= 5;
        personaje.Dinero= 5000;
        personaje.Magia= 5;
        personaje.Defensa= 5;
        personaje.Velocidad= 5;
    }
    

}