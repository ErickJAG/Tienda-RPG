package App;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Character {

    //atributos del personaje
    public int Dinero;
    public int Vida;
    public int Ataque;
    public int Mana;
    public int Defensa;
    public int Velocidad;
    List<Integer> inventarioDArmaduras = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
    static List<Integer> inventarioArmas = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
    List<Integer> inventarioConsumibles = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));

    // metodo de compra
    public static void comprar(String opcion) {
        if (opcion.equals("Bate de Metal")) {
            GUI.cambiaText(opcion, "1");
            inventarioArmas.set(0, inventarioArmas.get(0) + 1);
            if (!inventarioArmas.get(0).equals(0) ){
                GUI.cambiaText(String.valueOf(inventarioArmas.get(0)),"16");
            }
        }else if(opcion.equals("Daga Siniestra")){
            GUI.cambiaText(opcion,"2");
        }else if(opcion.equals("Guante Magico")){
            GUI.cambiaText(opcion,"3");
        }else if(opcion.equals("Lanza Oscura")){
            GUI.cambiaText(opcion,"4");
        }else if(opcion.equals("Zweihander")){
            GUI.cambiaText(opcion,"5");
        }else if (opcion.equals("Cadenas")){
            GUI.cambiaText(opcion,"6");
        }else if(opcion.equals("Chaqueta Pesada")){
            GUI.cambiaText(opcion,"7");
        }else if(opcion.equals("Bata Oscura")){
            GUI.cambiaText(opcion,"8");
        }else if(opcion.equals("Capa Angelical")){
            GUI.cambiaText(opcion,"9");
        }else if(opcion.equals("Placa Paladin")){
            GUI.cambiaText(opcion,"10");
        }else if (opcion.equals("Medicina")){
            GUI.cambiaText(opcion,"11");
        }else if(opcion.equals("Pocion de Mana")){
            GUI.cambiaText(opcion,"12");
        }else if(opcion.equals("Gema Reflectora")){
            GUI.cambiaText(opcion,"13");
        }else if(opcion.equals("1-UP")){
            GUI.cambiaText(opcion,"14");
        }else if(opcion.equals("Restaurador")){
            GUI.cambiaText(opcion,"15");
        }
    }
    //Metodo para definir los atributos de los objetos
    public static void main(final String[] args) {
        //Objeto
        Character personaje = new Character();
        //Definicions de atributos
        
    }
    

}