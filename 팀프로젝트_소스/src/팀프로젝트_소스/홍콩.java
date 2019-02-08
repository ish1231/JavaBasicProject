package ÆÀÇÁ·ÎÁ§Æ®_¼Ò½º;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.*;
import java.util.ArrayList;

public class È«Äá {

	public static void main(String[] args) throws Exception {
		

		/*
		Document doc2 = Jsoup.connect("https://www.klook.com/ko/activity/39-hong-kong-disneyland-resort-hong-kong/?krt=r22&krid=1d80f3a3-4f66-431f-5a34-1a5be5c17953").get();
		Element res = doc2.selectFirst("div.icon-div");
		System.out.println(res.text());
		*/
		for(int p = 1; p <= 21; p++) {
		Document doc = Jsoup.connect("https://www.klook.com/ko/city/2-hong-kong/?city_id=2&limit=15&template_ids=&tag_ids=&instant=0&sort=&page="+p).get();
		Elements title = doc.select("h3.title");
	//	System.out.println(title.text());
	     	for(int i = 0; i < 15; i++) {
	     		try {
	    			String link = title.get(i).attr("href");
	    			System.out.println(link);
	    			Document doc2 = Jsoup.connect("https://www.klook.com" + link).get();
	    			Element cancel = doc2.selectFirst("div.icon-div");
	    			System.out.println("Ãë¼Ò: " + cancel.text());
	    			
	     		}catch(Exception e) {}
	     	}
		}//for end
		
		
	}

}
