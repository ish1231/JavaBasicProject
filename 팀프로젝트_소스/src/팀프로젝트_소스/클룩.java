package ÆÀÇÁ·ÎÁ§Æ®_¼Ò½º;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Å¬·è {

	public static void main(String[] args) throws Exception {
		
		// È«Äá
		
		
		 for(int k =1; k <= 4; k++) {
        Document doc = Jsoup.connect("https://www.klook.com/ko/city/2-hong-kong/?city_id=2&limit=15&template_ids=&tag_ids=&instant=0&sort=&page=" + k).get();
    
	
		 Elements title = doc.select("h3.title");
		 Elements choice = doc.select("span.u_t_gray_9"); 
	//	 Elements star = doc.select("i"); 
		 Elements price = doc.select("li p span.latest_price b"); 
		
		
			 for(int i = 0; i < 24; i++ ) {
			 
			System.out.println(title.get(i).text());
			System.out.println(choice.get(i).text());
	//		System.out.println(star.get(i).text());
		    System.out.println(price.get(i).text().replaceAll("[^0-9]", "") + "¿ø");
		    System.out.println("=====================================");
		    
			 }//for end
			 
		 }//for end
		 
		 
	}

}
