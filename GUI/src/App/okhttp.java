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
	
	private static void getAmazon() {
		
		OkHttpClient client = new OkHttpClient();
	
		Request request = new Request.Builder()
			.url("https://amazon-product-reviews-keywords.p.rapidapi.com/product/search?category=aps&country=US&keyword=Knife")
			.get()
			.addHeader("x-rapidapi-host", "amazon-product-reviews-keywords.p.rapidapi.com")
			.addHeader("x-rapidapi-key", "e9d4d4b63dmshb4c2fbc87c231bdp1bb1ccjsn6f4a92c45443")
			.build();
	
		try (Response response = client.newCall(request).execute()){
			String responseBody = response.body().string();
			System.out.println(responseBody);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	public static void main(String[]args) {
		getAmazon();
	}
	
}
