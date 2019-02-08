import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.*;



/*
 * ����ó��
 * =====
 * �ڹٴ� ��� Ŭ���� ����ó���� �ؾ��Ѵ�
 * = ������ --> �ݵ�� ����ó��
 * = ���������� --> ����
 */
/*
 * 	<td class="title">
						<div class="tit5">
							<a href="/movie/bi/mi/basic.nhn?code=144318" title="�����">�����</a> // Ŭ���ؼ� �Ѿ���� ������ �� �ִ� �ο쵥���� �ּ� ã��
						</div>
					</td>
 */
public class Ŭ�� {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Thread.sleep(1000); ����ó�� �ʼ� �޼ҵ�
		int k=1;
		for(int i=1;i<=21;i++) // ��ü ������ �� 1~40������
		{
			Document doc=Jsoup.connect("https://www.klook.com/ko/city/2-hong-kong/?city_id=2&limit=15&template_ids=&tag_ids=&instant=0&sort=&page="+i).get();
			Elements title=doc.select("div.m_justify_list a"); 
			// �ѹ��� ������ �;� �ϴ� element���� 50�� �̱� ������ elements�� ����� ��� �������. �������ּ�
			
		for(int j=0;j<15;j++) // 1������ �� �׸� �� 50�� 0~50��
		{
			try
			{
			String link=title.get(j).attr("href"); // ��ũ�� ������ �ͼ� ������ �̵�=> �󼼺��� ����(href �Ӽ���)
			// System.out.println((k)+":"+title.get(j).attr("href")); // k���� ����for������ ��ü ���� ������
			Document doc2=Jsoup.connect("https://www.klook.com"+link).get();
			Element name=doc2.selectFirst("div.table_cell h1.t32"); // �±� �ϳ��� ������ �� ���� selectFirst���
			Element price=doc2.selectFirst("div p.price span");
			Element star=doc2.selectFirst("li span.t14");			
			Element sumup=doc2.selectFirst("div.reason div.markdown-content");
			Element story=doc2.selectFirst("div.markdown-content p");
			Element pic1=doc2.select("div.img img").get(0);

			/*
			 * <a href="aa">aaa</a>
			 * aaa�� ������ �� ���� text() // �±� ��
			 * "aa"�� ������ �� ���� attr() // �±� ��
			 *
			 * 
			 */
			
			// �������� �鷯 �ϳ��� ���������� ��ȭ ������ �˻��ؼ� �������
			System.out.println("��Ƽ��Ƽ��:"+name.text());
			System.out.println("����:"+price.text());
			// price.get().text().replaceAll("[^0-9]","")
			System.out.println("����:" + star.text());
			System.out.println("��Ƽ��Ƽ����:"+sumup.text());
			System.out.println("���ེ�丮:"+story.text());
			System.out.println("�����̹���:"+pic1.attr("src"));
			System.out.println("==========================");
					
			FileWriter fw=new
			FileWriter("c:\\javaDev\\klook.txt",true); String
			s=k+"|"+name.text()+"|" +price.text()+"|"
			+star.text()+"|" +sumup.text()+"|" +story.text()+"|"
			+pic1.attr("src")+"\r\n";
			fw.write(s); 
			fw.close();
					 
			k++;
			}catch(Exception e) {} // ���������� ������ ���Ḧ ���� => ������ �����ϴ� �������� �����ϰ� �����͸� ������ ��
			// join == 2��for��
		}
		}
		
	}

}
