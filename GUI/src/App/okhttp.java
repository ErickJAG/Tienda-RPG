package App;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 
import org.json.JSONObject;

public class okhttp {
	
	public static String getArmas() {
		
		OkHttpClient client = new OkHttpClient();
	
		Request request = new Request.Builder()
			.url("https://amazon-product-reviews-keywords.p.rapidapi.com/product/search?category=aps&country=US&keyword=Knife")
			.get()
			.addHeader("x-rapidapi-host", "amazon-product-reviews-keywords.p.rapidapi.com")
			.addHeader("x-rapidapi-key", "17f0207310mshefefa0ebd2fd786p14728djsn9ab7f2e156db")
			.build();
	
		try (Response response = client.newCall(request).execute()){
			String responseBody = response.body().string();
			return (responseBody);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
		
	}
	
	public static String getArmaduras() {
		
		OkHttpClient client = new OkHttpClient();
	
		Request request = new Request.Builder()
			.url("https://amazon-product-reviews-keywords.p.rapidapi.com/product/search?category=aps&country=US&keyword=Bulleltproof%20vest")
			.get()
			.addHeader("x-rapidapi-host", "amazon-product-reviews-keywords.p.rapidapi.com")
			.addHeader("x-rapidapi-key", "17f0207310mshefefa0ebd2fd786p14728djsn9ab7f2e156db")
			.build();
	
		try (Response response = client.newCall(request).execute()){
			String responseBody = response.body().string();
			return (responseBody);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
		
	}

	public static String getConsumibles() {
		
		OkHttpClient client = new OkHttpClient();
	
		Request request = new Request.Builder()
			.url("https://amazon-product-reviews-keywords.p.rapidapi.com/product/search?category=aps&country=US&keyword=Snacks")
			.get()
			.addHeader("x-rapidapi-host", "amazon-product-reviews-keywords.p.rapidapi.com")
			.addHeader("x-rapidapi-key", "17f0207310mshefefa0ebd2fd786p14728djsn9ab7f2e156db")
			.build();
	
		try (Response response = client.newCall(request).execute()){
			String responseBody = response.body().string();
			return (responseBody);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
		
	}
	
}
