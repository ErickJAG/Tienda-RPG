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
    public int Peso;
    
    static List<Integer> inventarioDArmaduras = new ArrayList<Integer>(Arrays.asList(0,0,0,0,0));
    static List<Integer> inventarioArmas = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));
    static List<Integer> inventarioConsumibles = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0));

    //Metodo que envia cual item se va a comprar
    public static void comprar(String opcion,Integer Money) {
        if (opcion.equals("Bate de Metal")) {
            inventarioArmas.set(0, inventarioArmas.get(0) + 1);
            GUI.cambiaText(opcion+" x"+inventarioArmas.get(0), "1","1",Money);
        }else if(opcion.equals("Daga Siniestra")){
        	inventarioArmas.set(1, inventarioArmas.get(1) + 1);
            GUI.cambiaText(opcion+" x"+inventarioArmas.get(1),"2","1",Money);
        }else if(opcion.equals("Guante Magico")){
        	inventarioArmas.set(2, inventarioArmas.get(2) + 1);
            GUI.cambiaText(opcion+" x"+inventarioArmas.get(2),"3","1",Money);
        }else if(opcion.equals("Lanza Oscura")){
        	inventarioArmas.set(3, inventarioArmas.get(3) + 1);
            GUI.cambiaText(opcion+" x"+inventarioArmas.get(3),"4","1",Money);
        }else if(opcion.equals("Zweihander")){
        	inventarioArmas.set(4, inventarioArmas.get(4) + 1);
            GUI.cambiaText(opcion+" x"+inventarioArmas.get(4),"5","1",Money);
        }else if (opcion.equals("Cota de Malla")){
        	inventarioDArmaduras.set(0, inventarioDArmaduras.get(0) + 1);
            GUI.cambiaText(opcion+" x"+inventarioDArmaduras.get(0),"6","1",Money);
        }else if(opcion.equals("Chaqueta Pesada")){
        	inventarioDArmaduras.set(1, inventarioDArmaduras.get(1) + 1);
            GUI.cambiaText(opcion+" x"+inventarioDArmaduras.get(1),"7","1",Money);
        }else if(opcion.equals("Bata Oscura")){
        	inventarioDArmaduras.set(2, inventarioDArmaduras.get(2) + 1);
            GUI.cambiaText(opcion+" x"+inventarioDArmaduras.get(2),"8","1",Money);
        }else if(opcion.equals("Capa Angelical")){
        	inventarioDArmaduras.set(3, inventarioDArmaduras.get(3) + 1);
            GUI.cambiaText(opcion+" x"+inventarioDArmaduras.get(3),"9","1",Money);
        }else if(opcion.equals("Placa Paladin")){
        	inventarioDArmaduras.set(4, inventarioDArmaduras.get(4) + 1);
            GUI.cambiaText(opcion+" x"+inventarioDArmaduras.get(4),"10","1",Money);
        }else if (opcion.equals("Medicina")){
        	inventarioConsumibles.set(0, inventarioConsumibles.get(0) + 1);
            GUI.cambiaText(opcion+" x"+inventarioConsumibles.get(0),"11","1",Money);
        }else if(opcion.equals("Pocion de Mana")){
        	inventarioConsumibles.set(1, inventarioConsumibles.get(1) + 1);
            GUI.cambiaText(opcion+" x"+inventarioConsumibles.get(1),"12","1",Money);
        }else if(opcion.equals("Gema Reflectora")){
        	inventarioConsumibles.set(2, inventarioConsumibles.get(2) + 1);
            GUI.cambiaText(opcion+" x"+inventarioConsumibles.get(2),"13","1",Money);
        }else if(opcion.equals("1-UP")){
        	inventarioConsumibles.set(3, inventarioConsumibles.get(3) + 1);
            GUI.cambiaText(opcion+" x"+inventarioConsumibles.get(3),"14","1",Money);
        }else if(opcion.equals("Restaurador")){
        	inventarioConsumibles.set(4, inventarioConsumibles.get(4) + 1);
            GUI.cambiaText(opcion+" x"+inventarioConsumibles.get(4),"15","1",Money);
        }
    }
    //Metodo que envia cual arma se va a vender
    public static void vender(String opcion,Integer Money) {
        if (opcion.equals("IArma1")) {
        	if (!inventarioArmas.get(0).equals(0)) {
        		inventarioArmas.set(0, inventarioArmas.get(0) - 1);
        		if (inventarioArmas.get(0).equals(0)) {
        			GUI.cambiaText("", "1","2",Money);
        		}
        		else {
        			GUI.cambiaText("Bate de Metal"+" x"+inventarioArmas.get(0), "1","2",Money);
        		}
        	}
        }else if(opcion.equals("IArma2")){
        	if (!inventarioArmas.get(1).equals(0)) {
        		inventarioArmas.set(1, inventarioArmas.get(1) - 1);
        		if (inventarioArmas.get(1).equals(0)) {
        			GUI.cambiaText("", "2","2",Money);
        		}
        		else {
        			GUI.cambiaText("Daga Siniestra"+" x"+inventarioArmas.get(1), "2","2",Money);
        		}
        	}
        }else if(opcion.equals("IArma3")){
        	if (!inventarioArmas.get(2).equals(0)) {
        		inventarioArmas.set(2, inventarioArmas.get(2) - 1);
        		if (inventarioArmas.get(2).equals(0)) {
        			GUI.cambiaText("", "3","2",Money);
        		}
        		else {
        			GUI.cambiaText("Guante Magico"+" x"+inventarioArmas.get(2), "3","2",Money);
        		}
        	}
        }else if(opcion.equals("IArma4")){
        	if (!inventarioArmas.get(3).equals(0)) {
        		inventarioArmas.set(3, inventarioArmas.get(3) - 1);
        		if (inventarioArmas.get(3).equals(0)) {
        			GUI.cambiaText("", "4","2",Money);
        		}
        		else {
        			GUI.cambiaText("Lanza Oscura"+" x"+inventarioArmas.get(3), "4","2",Money);
        		}
        	}
        }else if(opcion.equals("IArma5")){
        	if (!inventarioArmas.get(4).equals(0)) {
        		inventarioArmas.set(4, inventarioArmas.get(4) - 1);
        		if (inventarioArmas.get(4).equals(0)) {
        			GUI.cambiaText("", "5","2",Money);
        		}
        		else {
        			GUI.cambiaText("Zweihander"+" x"+inventarioArmas.get(4), "5","2",Money);
        		}
        	}
        }else if(opcion.equals("IArmadura1")){
        	if (!inventarioDArmaduras.get(0).equals(0)) {
        		inventarioDArmaduras.set(0, inventarioDArmaduras.get(0) - 1);
        		if (inventarioDArmaduras.get(0).equals(0)) {
        			GUI.cambiaText("", "6","2",Money);
        		}
        		else {
        			GUI.cambiaText("Cota de Malla"+" x"+inventarioDArmaduras.get(0), "6","2",Money);
        		}
        	}
        }else if(opcion.equals("IArmadura2")){
        	if (!inventarioDArmaduras.get(1).equals(0)) {
        		inventarioDArmaduras.set(1, inventarioDArmaduras.get(1) - 1);
        		if (inventarioDArmaduras.get(1).equals(0)) {
        			GUI.cambiaText("", "7","2",Money);
        		}
        		else {
        			GUI.cambiaText("Chaqueta Pesada"+" x"+inventarioDArmaduras.get(1), "7","2",Money);
        		}
        	}
        }else if(opcion.equals("IArmadura3")){
        	if (!inventarioDArmaduras.get(2).equals(0)) {
        		inventarioDArmaduras.set(2, inventarioDArmaduras.get(2) - 1);
        		if (inventarioDArmaduras.get(2).equals(0)) {
        			GUI.cambiaText("", "8","2",Money);
        		}
        		else {
        			GUI.cambiaText("Bata Oscura"+" x"+inventarioDArmaduras.get(2), "8","2",Money);
        		}
        	}
        }else if(opcion.equals("IArmadura4")){
        	if (!inventarioDArmaduras.get(3).equals(0)) {
        		inventarioDArmaduras.set(3, inventarioDArmaduras.get(3) - 1);
        		if (inventarioDArmaduras.get(3).equals(0)) {
        			GUI.cambiaText("", "9","2",Money);
        		}
        		else {
        			GUI.cambiaText("Capa Angelical"+" x"+inventarioDArmaduras.get(3), "9","2",Money);
        		}
        	}
        }else if(opcion.equals("IArmadura5")){
        	if (!inventarioDArmaduras.get(4).equals(0)) {
        		inventarioDArmaduras.set(4, inventarioDArmaduras.get(4) - 1);
        		if (inventarioDArmaduras.get(4).equals(0)) {
        			GUI.cambiaText("", "10","2",Money);
        		}
        		else {
        			GUI.cambiaText("Placa Paladin"+" x"+inventarioDArmaduras.get(4), "10","2",Money);
        		}
        	}
        }else if(opcion.equals("IConsumible1")){
        	if (!inventarioConsumibles.get(0).equals(0)) {
        		inventarioConsumibles.set(0, inventarioConsumibles.get(0) - 1);
        		if (inventarioConsumibles.get(0).equals(0)) {
        			GUI.cambiaText("", "11","2",Money);
        		}
        		else {
        			GUI.cambiaText("Medicina"+" x"+inventarioConsumibles.get(0), "11","2",Money);
        		}
        	}
        }else if(opcion.equals("IConsumible2")){
        	if (!inventarioConsumibles.get(1).equals(0)) {
        		inventarioConsumibles.set(1, inventarioConsumibles.get(1) - 1);
        		if (inventarioConsumibles.get(1).equals(0)) {
        			GUI.cambiaText("", "12","2",Money);
        		}
        		else {
        			GUI.cambiaText("Pocion de Mana"+" x"+inventarioConsumibles.get(1), "12","2",Money);
        		}
        	}
        }else if(opcion.equals("IConsumible3")){
        	if (!inventarioConsumibles.get(2).equals(0)) {
        		inventarioConsumibles.set(2, inventarioConsumibles.get(2) - 1);
        		if (inventarioConsumibles.get(2).equals(0)) {
        			GUI.cambiaText("", "13","2",Money);
        		}
        		else {
        			GUI.cambiaText("Gema Reflectora"+" x"+inventarioConsumibles.get(2), "13","2",Money);
        		}
        	}
        }else if(opcion.equals("IConsumible4")){
        	if (!inventarioConsumibles.get(3).equals(0)) {
        		inventarioConsumibles.set(3, inventarioConsumibles.get(3) - 1);
        		if (inventarioConsumibles.get(3).equals(0)) {
        			GUI.cambiaText("", "14","2",Money);
        		}
        		else {
        			GUI.cambiaText("1-UP"+" x"+inventarioConsumibles.get(3), "14","2",Money);
        		}
        	}
        }else if(opcion.equals("IConsumible5")){
        	if (!inventarioConsumibles.get(4).equals(0)) {
        		inventarioConsumibles.set(4, inventarioConsumibles.get(4) - 1);
        		if (inventarioConsumibles.get(4).equals(0)) {
        			GUI.cambiaText("", "15","2",Money);
        		}
        		else {
        			GUI.cambiaText("Restaurador"+" x"+inventarioConsumibles.get(4), "15","2",Money);
        		}
        	}
        }
    }
    //Metodo que envia el item que se esta equipando
    public static void Equipar(String opcion,Integer Stat1,Integer Stat2,Integer Stat3) {
    	if (opcion.equals("IArma1")) {
    		GUI.cambiaEquip("Bate de Metal",1,Stat1,Stat2,Stat3);
    	}
    	else if (opcion.equals("IArma2")) {
    		GUI.cambiaEquip("Daga Siniestra",1,Stat1,Stat2,Stat3);
    	}
    	else if (opcion.equals("IArma3")) {
    		GUI.cambiaEquip("Guante Magico",1,Stat1,Stat2,Stat3);
    	}
    	else if (opcion.equals("IArma4")) {
    		GUI.cambiaEquip("Lanza Oscura",1,Stat1,Stat2,Stat3);
    	}
    	else if (opcion.equals("IArma5")) {
    		GUI.cambiaEquip("Zweihander",1,Stat1,Stat2,Stat3);
    	}
    	else if (opcion.equals("IArmadura1")) {
    		GUI.cambiaEquip("Cota de Malla",2,Stat1,Stat2,Stat3);
    	}
    	else if (opcion.equals("IArmadura2")) {
    		GUI.cambiaEquip("Chaqueta Pesada",2,Stat1,Stat2,Stat3);
    	}
    	else if (opcion.equals("IArmadura3")) {
    		GUI.cambiaEquip("Bata Oscura",2,Stat1,Stat2,Stat3);
    	}
    	else if (opcion.equals("IArmadura4")) {
    		GUI.cambiaEquip("Capa Angelical",2,Stat1,Stat2,Stat3);
    	}
    	else if (opcion.equals("IArmadura5")) {
    		GUI.cambiaEquip("Placa Paladin",2,Stat1,Stat2,Stat3);
    	}
    }
    
        
    }
 