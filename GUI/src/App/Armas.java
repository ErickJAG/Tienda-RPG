package App;

import java.util.Random;

import org.json.JSONObject;

public class Armas {

    //atributos
    public int PrecioC;
    public int PrecioV;
    public int Ataque;
    public int Magia;
    public int Velocidad;

    //Metodo para definir los atributos de las armas con base a la info del API
    public static int DefinirAtributoArma (String Opcion, String API) {
    	JSONObject InfoAPI = new JSONObject(API);
    	int valor=0;
    	int result=0;
    	for(int i=0;i<50;i=i+1) {
    		valor=InfoAPI.getJSONArray("products").getJSONObject(i).getJSONObject("price").getInt("current_price");
    		if (Opcion.equals("1") & result==0) {
    			if (valor<10 & valor>4) {
    				result = valor;
    			}
    		}else if (Opcion.equals("2") & result==0) {
    			if (valor<30 & valor>10) {
    				result = valor;
    			}
    		}else if (Opcion.equals("3") & result==0) {
    			if (valor<50 & valor>30) {
    				result = valor;
    			}
    		}else if (Opcion.equals("4") & result==0) {
    			if (valor<80 & valor>50) {
    				result = valor;
    			}
    		}else if (Opcion.equals("5") & result==0) {
    			if (valor>80) {
    				result = valor;
    			}
    		}
    	}
    	if (result==0) {
    		Random NR = new Random();
    		int NumR = NR.nextInt(50);
			result = InfoAPI.getJSONArray("products").getJSONObject(NumR).getJSONObject("price").getInt("current_price");
    	}
    	return result;
    	
    }
}
    