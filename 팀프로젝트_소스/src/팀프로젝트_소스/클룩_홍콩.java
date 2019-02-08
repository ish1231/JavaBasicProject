package 팀프로젝트_소스;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.*;

public class 클룩_홍콩 {

	public static void main(String[] args) throws Exception {
		
	    int k = 1;
		for(int p = 1; p <= 21; p++) {
		Document doc = Jsoup.connect("https://www.klook.com/ko/city/2-hong-kong/?city_id=2&limit=15&template_ids=&tag_ids=&instant=0&sort=&page=" + p).get();
		Elements title = doc.select("div.m_justify_list a");// Elements => tag를 여러 번 읽을 때
		for(int i = 0; i < 15; i++) {
			
			try {
			String link = title.get(i).attr("href");
	    // <a gref = "aa">aaa</a>
		//  attr("href")
		//  text("href")	
	
	//	System.out.println((k) + ": " + title.get(i).attr("href"));	
		Document doc2 = Jsoup.connect("https://www.klook.com" + link).get();
		Element name = doc2.selectFirst("h1.t32");
		Element price=doc2.selectFirst("div p.price span");
		Element star=doc2.selectFirst("li span.t14");		
		Element sumup=doc2.selectFirst("div.reason div.markdown-content");
		Element story=doc2.selectFirst("div.markdown-content p");
		Element pic1=doc2.select("div.img img").get(0);
		Element res = doc2.selectFirst("div.icon-div");
		Element ticket = doc2.select("div.icon-div").get(1);
	
	    System.out.println("액티비티: " + name.text());
	    System.out.println("가격: "+price.text() + "원");
	    System.out.println("별점: " + star.text());
		System.out.println("예약:  " + res.text());
		System.out.println("티켓: " + ticket.text());
		System.out.println("액티비티설명: "+sumup.text());
		System.out.println("여행스토리: "+story.text());
		System.out.println("투어이미지: "+pic1.attr("src"));
		System.out.println("===============================");
		FileWriter fw = new FileWriter("g:\\javaDev\\tour.txt", true);
		String s = k + "|" + name.text() + "|" + price.text() +"|" + star.text()+ "|" + res.text() + "|" + ticket.text() + "|" 
		+ sumup.text() + "|" + story.text()+ "|"+ pic1.attr("src") + "\r\n"; 
    	fw.write(s);
		fw.close();
	        k++;
			}catch(Exception e) {}
			}
			
		}
		

	}//main() end

}//class end

