import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.*;



/*
 * 예외처리
 * =====
 * 자바는 모든 클래스 예외처리를 해야한다
 * = 컴파일 --> 반드시 예외처리
 * = 인터프리터 --> 생략
 */
/*
 * 	<td class="title">
						<div class="tit5">
							<a href="/movie/bi/mi/basic.nhn?code=144318" title="언더독">언더독</a> // 클릭해서 넘어갔을때 가져올 수 있는 로우데이터 주소 찾기
						</div>
					</td>
 */
public class 클룩 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Thread.sleep(1000); 예외처리 필수 메소드
		int k=1;
		for(int i=1;i<=21;i++) // 전체 페이지 수 1~40페이지
		{
			Document doc=Jsoup.connect("https://www.klook.com/ko/city/2-hong-kong/?city_id=2&limit=15&template_ids=&tag_ids=&instant=0&sort=&page="+i).get();
			Elements title=doc.select("div.m_justify_list a"); 
			// 한번에 가지고 와야 하는 element수가 50개 이기 떄문에 elements로 덩어리를 묶어서 가지고옴. 페이지주소
			
		for(int j=0;j<15;j++) // 1페이지 당 항목 수 50개 0~50개
		{
			try
			{
			String link=title.get(j).attr("href"); // 링크를 가지고 와서 페이지 이동=> 상세보기 접속(href 속성값)
			// System.out.println((k)+":"+title.get(j).attr("href")); // k값은 이중for문으로 전체 숫자 보여줌
			Document doc2=Jsoup.connect("https://www.klook.com"+link).get();
			Element name=doc2.selectFirst("div.table_cell h1.t32"); // 태그 하나만 가지고 올 때는 selectFirst사용
			Element price=doc2.selectFirst("div p.price span");
			Element star=doc2.selectFirst("li span.t14");			
			Element sumup=doc2.selectFirst("div.reason div.markdown-content");
			Element story=doc2.selectFirst("div.markdown-content p");
			Element pic1=doc2.select("div.img img").get(0);

			/*
			 * <a href="aa">aaa</a>
			 * aaa를 가지고 올 때는 text() // 태그 외
			 * "aa"를 가지고 올 때는 attr() // 태그 내
			 *
			 * 
			 */
			
			// 페이지에 들러 하나씩 페이지에서 영화 제목을 검색해서 가지고옴
			System.out.println("액티비티명:"+name.text());
			System.out.println("가격:"+price.text());
			// price.get().text().replaceAll("[^0-9]","")
			System.out.println("별점:" + star.text());
			System.out.println("액티비티설명:"+sumup.text());
			System.out.println("여행스토리:"+story.text());
			System.out.println("투어이미지:"+pic1.attr("src"));
			System.out.println("==========================");
					
			FileWriter fw=new
			FileWriter("c:\\javaDev\\klook.txt",true); String
			s=k+"|"+name.text()+"|" +price.text()+"|"
			+star.text()+"|" +sumup.text()+"|" +story.text()+"|"
			+pic1.attr("src")+"\r\n";
			fw.write(s); 
			fw.close();
					 
			k++;
			}catch(Exception e) {} // 페이지에서 비정상 종료를 방지 => 에러를 유발하는 페이지를 제외하고 데이터를 가지고 옴
			// join == 2차for문
		}
		}
		
	}

}
