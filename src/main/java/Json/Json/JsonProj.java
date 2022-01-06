package Json.Json;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
public class JsonProj {
	public String par()throws Exception {
		String url = "https://en.wikipedia.org/w/api.php?format=json&action=query&titles=SMALL&prop=revisions&rvprop=content";
         URL obj = new URL(url);
         HttpURLConnection con = (HttpURLConnection) obj.openConnection();
         // optional default is GET
         con.setRequestMethod("GET");
         //add request header
         BufferedReader in = new BufferedReader(
                 new InputStreamReader(con.getInputStream()));
         String inputLine;
         StringBuffer response = new StringBuffer();
         while ((inputLine = in.readLine()) != null) {
             response.append(inputLine);
         }
         in.close();
         
         //print in String
         //System.out.println(response.toString());
         return response.toString();
	}
}
