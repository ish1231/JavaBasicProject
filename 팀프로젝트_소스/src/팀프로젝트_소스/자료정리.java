package 팀프로젝트_소스;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.*;
import java.util.ArrayList;
public class 자료정리 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Document doc = Jsoup.connect("https://www.klook.com/ko/city/2-hong-kong/?city_id=2&limit=15&template_ids=&tag_ids=&instant=0&sort=&page=1").get();
		Document doc2 = Jsoup.connect("https://www.klook.com/ko/activity/71-airport-express-hong-kong/?krt=r22&krid=23227d08-ea9c-4d1d-45c4-f7672fb70999").get();
	//	Element img = doc.selectFirst("img.lazy");
		Element res = doc2.selectFirst("div.icon-div");
		Element ticket = doc2.select("div.icon-div").get(1);
		Element how = doc2.select("div.icon-div").get(2);
		Element date = doc2.select("div.icon-div").get(3);
		Element how2 = doc2.selectFirst("h4 ul li");
	//	Elements res1 = doc.select("b span g_right j_card_date notice");
	//	System.out.println("이미지: " + img.text());
		System.out.println("예약: " + res.text());
		System.out.println("티켓: " + ticket.text());
		System.out.println("방법: " + how.text());
		System.out.println("사용방법: " + how2.text());
		System.out.println("이용가능날짜: " + date.text());
		
	//	System.out.println("예약가능날짜: " + res1.text());
	
		
	
	}

}
