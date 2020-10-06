package App;

import org.json.JSONObject;

public class Armas {

    //atributos
    public int PrecioC;
    public int PrecioV;
    public int Ataque;
    public int Magia;
    public int Velocidad;

    
    public static int DefinirAtributoArma (String Opcion, String API) {
    	JSONObject InfoAPI = new JSONObject(API);
    	int valor=0;
    	int result=0;
    	for(int i=0;i<250;i=i+1) {
    		valor=InfoAPI.getJSONArray("products").getJSONObject(i).getJSONObject("reviews").getInt("rating");
    		if (Opcion.equals("1") & result==0) {
    			if (valor<10 & valor>4) {
    				result = valor;
    			}
    		}else if (Opcion.equals("2") & result==0) {
    			if (valor<30 & valor>10) {
    				result = valor;
    			}
    		}if (Opcion.equals("3") & result==0) {
    			if (valor<50 & valor>30) {
    				result = valor;
    			}
    		}if (Opcion.equals("4") & result==0) {
    			if (valor<80 & valor>50) {
    				result = valor;
    			}
    		}if (Opcion.equals("5") & result==0) {
    			if (valor<101 & valor>80) {
    				result = valor;
    			}
    		}
    	}
    	return result;
    	
    }
}
    