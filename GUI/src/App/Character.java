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
    static List<Integer> inventarioDArmaduras = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
    static List<Integer> inventarioArmas = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
    static List<Integer> inventarioConsumibles = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));

    // metodo de compra
    public static void comprar(String opcion) {
        if (opcion.equals("Bate de Metal")) {
            inventarioArmas.set(0, inventarioArmas.get(0) + 1);
            GUI.cambiaText(opcion+" x"+inventarioArmas.get(0), "1");
        }else if(opcion.equals("Daga Siniestra")){
        	inventarioArmas.set(1, inventarioArmas.get(1) + 1);
            GUI.cambiaText(opcion+" x"+inventarioArmas.get(1),"2");
        }else if(opcion.equals("Guante Magico")){
        	inventarioArmas.set(2, inventarioArmas.get(2) + 1);
            GUI.cambiaText(opcion+" x"+inventarioArmas.get(2),"3");
        }else if(opcion.equals("Lanza Oscura")){
        	inventarioArmas.set(3, inventarioArmas.get(3) + 1);
            GUI.cambiaText(opcion+" x"+inventarioArmas.get(3),"4");
        }else if(opcion.equals("Zweihander")){
        	inventarioArmas.set(4, inventarioArmas.get(4) + 1);
            GUI.cambiaText(opcion+" x"+inventarioArmas.get(4),"5");
        }else if (opcion.equals("Cadenas")){
        	inventarioDArmaduras.set(0, inventarioDArmaduras.get(0) + 1);
            GUI.cambiaText(opcion+" x"+inventarioDArmaduras.get(0),"6");
        }else if(opcion.equals("Chaqueta Pesada")){
        	inventarioDArmaduras.set(1, inventarioDArmaduras.get(1) + 1);
            GUI.cambiaText(opcion+" x"+inventarioDArmaduras.get(1),"7");
        }else if(opcion.equals("Bata Oscura")){
        	inventarioDArmaduras.set(2, inventarioDArmaduras.get(2) + 1);
            GUI.cambiaText(opcion+" x"+inventarioDArmaduras.get(2),"8");
        }else if(opcion.equals("Capa Angelical")){
        	inventarioDArmaduras.set(3, inventarioDArmaduras.get(3) + 1);
            GUI.cambiaText(opcion+" x"+inventarioDArmaduras.get(3),"9");
        }else if(opcion.equals("Placa Paladin")){
        	inventarioDArmaduras.set(4, inventarioDArmaduras.get(4) + 1);
            GUI.cambiaText(opcion+" x"+inventarioDArmaduras.get(4),"10");
        }else if (opcion.equals("Medicina")){
        	inventarioConsumibles.set(0, inventarioConsumibles.get(0) + 1);
            GUI.cambiaText(opcion+" x"+inventarioConsumibles.get(0),"11");
        }else if(opcion.equals("Pocion de Mana")){
        	inventarioConsumibles.set(1, inventarioConsumibles.get(1) + 1);
            GUI.cambiaText(opcion+" x"+inventarioConsumibles.get(1),"12");
        }else if(opcion.equals("Gema Reflectora")){
        	inventarioConsumibles.set(2, inventarioConsumibles.get(2) + 1);
            GUI.cambiaText(opcion+" x"+inventarioConsumibles.get(2),"13");
        }else if(opcion.equals("1-UP")){
        	inventarioConsumibles.set(3, inventarioConsumibles.get(3) + 1);
            GUI.cambiaText(opcion+" x"+inventarioConsumibles.get(3),"14");
        }else if(opcion.equals("Restaurador")){
        	inventarioConsumibles.set(4, inventarioConsumibles.get(4) + 1);
            GUI.cambiaText(opcion+" x"+inventarioConsumibles.get(4),"15");
        }
    }
    public static void vender(String opcion) {
        if (opcion.equals("IArma1")) {
        	if (!inventarioArmas.get(0).equals(0)) {
        		inventarioArmas.set(0, inventarioArmas.get(0) - 1);
        		if (inventarioArmas.get(0).equals(0)) {
        			GUI.cambiaText("", "1");
        		}
        		else {
        			GUI.cambiaText("Bate de Metal"+" x"+inventarioArmas.get(0), "1");
        		}
        	}
        }else if(opcion.equals("IArma2")){
        	if (!inventarioArmas.get(1).equals(0)) {
        		inventarioArmas.set(1, inventarioArmas.get(1) - 1);
        		if (inventarioArmas.get(1).equals(0)) {
        			GUI.cambiaText("", "2");
        		}
        		else {
        			GUI.cambiaText("Daga Siniestra"+" x"+inventarioArmas.get(1), "2");
        		}
        	}
        }else if(opcion.equals("IArma3")){
        	if (!inventarioArmas.get(2).equals(0)) {
        		inventarioArmas.set(2, inventarioArmas.get(2) - 1);
        		if (inventarioArmas.get(2).equals(0)) {
        			GUI.cambiaText("", "3");
        		}
        		else {
        			GUI.cambiaText("Guante Magico"+" x"+inventarioArmas.get(2), "3");
        		}
        	}
        }else if(opcion.equals("IArma4")){
        	if (!inventarioArmas.get(3).equals(0)) {
        		inventarioArmas.set(3, inventarioArmas.get(3) - 1);
        		if (inventarioArmas.get(3).equals(0)) {
        			GUI.cambiaText("", "4");
        		}
        		else {
        			GUI.cambiaText("Lanza Oscura"+" x"+inventarioArmas.get(3), "4");
        		}
        	}
        }else if(opcion.equals("IArma5")){
        	if (!inventarioArmas.get(4).equals(0)) {
        		inventarioArmas.set(4, inventarioArmas.get(4) - 1);
        		if (inventarioArmas.get(4).equals(0)) {
        			GUI.cambiaText("", "5");
        		}
        		else {
        			GUI.cambiaText("Zweihander"+" x"+inventarioArmas.get(4), "5");
        		}
        	}
        }else if(opcion.equals("IArmadura1")){
        	if (!inventarioDArmaduras.get(0).equals(0)) {
        		inventarioDArmaduras.set(0, inventarioDArmaduras.get(0) - 1);
        		if (inventarioDArmaduras.get(0).equals(0)) {
        			GUI.cambiaText("", "6");
        		}
        		else {
        			GUI.cambiaText("Cadenas"+" x"+inventarioArmas.get(0), "6");
        		}
        	}
        }else if(opcion.equals("IArmadura2")){
        	if (!inventarioDArmaduras.get(1).equals(0)) {
        		inventarioDArmaduras.set(1, inventarioDArmaduras.get(1) - 1);
        		if (inventarioDArmaduras.get(1).equals(0)) {
        			GUI.cambiaText("", "7");
        		}
        		else {
        			GUI.cambiaText("Chaqueta Pesada"+" x"+inventarioArmas.get(1), "7");
        		}
        	}
        }else if(opcion.equals("IArmadura3")){
        	if (!inventarioDArmaduras.get(2).equals(0)) {
        		inventarioDArmaduras.set(2, inventarioDArmaduras.get(2) - 1);
        		if (inventarioDArmaduras.get(2).equals(0)) {
        			GUI.cambiaText("", "8");
        		}
        		else {
        			GUI.cambiaText("Bata Oscura"+" x"+inventarioArmas.get(2), "8");
        		}
        	}
        }else if(opcion.equals("IArmadura4")){
        	if (!inventarioDArmaduras.get(3).equals(0)) {
        		inventarioDArmaduras.set(3, inventarioDArmaduras.get(3) - 1);
        		if (inventarioDArmaduras.get(3).equals(0)) {
        			GUI.cambiaText("", "9");
        		}
        		else {
        			GUI.cambiaText("Capa Angelical"+" x"+inventarioArmas.get(3), "9");
        		}
        	}
        }else if(opcion.equals("IArmadura5")){
        	if (!inventarioDArmaduras.get(4).equals(0)) {
        		inventarioDArmaduras.set(4, inventarioDArmaduras.get(4) - 1);
        		if (inventarioDArmaduras.get(4).equals(0)) {
        			GUI.cambiaText("", "10");
        		}
        		else {
        			GUI.cambiaText("Placa Paladin"+" x"+inventarioArmas.get(4), "10");
        		}
        	}
        }else if(opcion.equals("IConsumible1")){
        	if (!inventarioConsumibles.get(0).equals(0)) {
        		inventarioConsumibles.set(0, inventarioConsumibles.get(0) - 1);
        		if (inventarioConsumibles.get(0).equals(0)) {
        			GUI.cambiaText("", "11");
        		}
        		else {
        			GUI.cambiaText("Medicina"+" x"+inventarioConsumibles.get(0), "11");
        		}
        	}
        }else if(opcion.equals("IConsumible2")){
        	if (!inventarioConsumibles.get(1).equals(0)) {
        		inventarioConsumibles.set(1, inventarioConsumibles.get(1) - 1);
        		if (inventarioConsumibles.get(1).equals(0)) {
        			GUI.cambiaText("", "12");
        		}
        		else {
        			GUI.cambiaText("Pocion de Mana"+" x"+inventarioConsumibles.get(1), "12");
        		}
        	}
        }else if(opcion.equals("IConsumible3")){
        	if (!inventarioConsumibles.get(2).equals(0)) {
        		inventarioConsumibles.set(2, inventarioConsumibles.get(2) - 1);
        		if (inventarioConsumibles.get(2).equals(0)) {
        			GUI.cambiaText("", "13");
        		}
        		else {
        			GUI.cambiaText("Gema Reflectora"+" x"+inventarioConsumibles.get(2), "13");
        		}
        	}
        }else if(opcion.equals("IConsumible4")){
        	if (!inventarioConsumibles.get(3).equals(0)) {
        		inventarioConsumibles.set(3, inventarioConsumibles.get(3) - 1);
        		if (inventarioConsumibles.get(3).equals(0)) {
        			GUI.cambiaText("", "14");
        		}
        		else {
        			GUI.cambiaText("1-UP"+" x"+inventarioConsumibles.get(3), "14");
        		}
        	}
        }else if(opcion.equals("IConsumible5")){
        	if (!inventarioConsumibles.get(4).equals(0)) {
        		inventarioConsumibles.set(4, inventarioConsumibles.get(4) - 1);
        		if (inventarioConsumibles.get(4).equals(0)) {
        			GUI.cambiaText("", "15");
        		}
        		else {
        			GUI.cambiaText("Restaurador"+" x"+inventarioConsumibles.get(4), "15");
        		}
        	}
        }
    }
    //Metodo para definir los atributos de los objetos
    public static void main(final String[] args) {
        //Objeto
        Character personaje = new Character();
        //Definicions de atributos
        
    }
    

}