/*
    <div class="trav-sch">
        <a target="_blank" href="/plan/7d43057ada7a788a" class="plan_link" data-id="7d43057ada7a788a" >
            <div class="cover-img">
                <img src="https://thumb-wishbeen.akamaized.net/8-ecrddWjWFb4qnRHvWfu5bsEu8=/448x170/smart/filters:no_upscale()/img-wishbeen.akamaized.net/plan/1482124278566_IMG_0824.JPG" />
                <div class="bg"></div>
            </div>
            <div class="list-author-info">
                <div class="user-img"><img src="https://thumb-wishbeen.akamaized.net/9qdBn67bvxOeo9OkdYPMdtjnN68=/22x22/smart/filters:no_upscale()/img-wishbeen.akamaized.net/profile/1461814413559_KakaoTalk_20160428_123306609.jpg" alt="" /></div>
                <div class="user-name">SSEgoon(�ر�)</div>
                <div class="user-label">Author</div>
                
                <div class="user-type">����ī �����н� �ҼȰ� ��</div>
                
            </div><!-- list-author-info -->

            <div class="plan-tit">
                <h3>�ų��� ���ƴ��� ����ī-���俩�� (���� 30% + ���� 30% + �Թ� 40%)</h3>
                <div class="countries-day-term">
                    <span class="state">�Ϻ�</span><span>5��</span>
                </div>
                
            </div> <!-- plan-tit -->

            <div class="list-contents">
                <div class="tit">����ī �� ���Ϲ��� �� ���� �� ���� �鼼�� (���� 30% + ���� 30% + �Թ� 40%)</div>
                <div class="desc">- �系 2���� �߿� �������� ���ƴ��� ����ī-���� 3�� 4�� ����

�� �ѱ� �� ����ī �ٳ��� �� ����ī ��޴�
�� ���Ϲ��Ƚ�Ʃ��� ���� �� ����Ÿ�� �� ��õ
�� ���� ��  ��������
�� ���溸�� �� ���׼��� �� �ѱ�

- �������� ���� ���ôµ�, �系 2���� �����뿡��, ���������, ��ȭ������ 1�ð� �̻� ������ �ʴ��󱸿�.
- �������� 30�� ������ �����δ� ���� ���°�쵵, ������ ��쵵 �ֽ��ϴ�. ������ �߰��߰��� �ð��� �������� ������ ��쿡 ���� ������ ������ ��ϵǾ� �ֽ��ϴ�.
- ��Ҹ��� �����ø� �� ���� ������ ���� �� �ֽ��ϴ�.
- ������ �帴�ϰ� ���� �� ������, ����Ʈ �� ���ú� ���÷� ���ø� �����ϰ� ���Դϴ�.
- ������ �غ��ϴ°��� ���������� ���̰�, �ð��� �����ϴ� ���̴�!
- ��� ������Ʈ ���Դϴ�!</div>
            </div><!-- list-contents -->

            <div class="response">
                <div class="tour-time">���� ��</div>
                <div class="count">
                    <div class="post"><span>190</span>���� ����Ʈ</div>
                    <div class="spot"><span>54</span>���� ���</div>
                </div>
            </div>
        </a>
    </div>
</li>



<li class="plan-item" data-id="8972cf0c5cfbe979">
    <!-- �������������� �� �������� �� ���� ��ư �־���� -->
    
    <div class="trav-sch">
        <a target="_blank" href="/plan/8972cf0c5cfbe979" class="plan_link" data-id="8972cf0c5cfbe979" >
            <div class="cover-img">
                <img src="https://thumb-wishbeen.akamaized.net/O5g2XDYyddXbvJhRizkIpPgBspo=/448x170/smart/filters:no_upscale()/img-wishbeen.akamaized.net/plan/1508741381522_%E1%84%8C%E1%85%A6%E1%84%86%E1%85%A9%E1%86%A8%E1%84%8B%E1%85%A5%E1%86%B9%E1%84%8B%E1%85%B3%E1%86%B7-3.jpg" />
                <div class="bg"></div>
            </div>
            <div class="list-author-info">
                <div class="user-img"><img src="https://thumb-wishbeen.akamaized.net/uA5FW06yQiTAgJu-2IjcLRZb3FE=/22x22/smart/filters:no_upscale()/img-wishbeen.akamaized.net/profile/1453799553744_15512784985_e3cddaf597_k.jpg" alt="" /></div>
                <div class="user-name">hangover</div>
                <div class="user-label">Customizer</div>
                
                <div class="user-type">�ĺ����������� ������ ����</div>
                
            </div><!-- list-author-info -->


*/
//
//
package ��������Ʈ_�ҽ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ���ú� {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Document doc = Jsoup.connect("https://www.wishbeen.co.kr/city?tab=plan").get();
	//	System.out.println(doc);
		Elements title = doc.select("div.plan-tit h3");
	    System.out.println(title);
		
	    Elements title2 = doc.select("div.desc");
		System.out.println(title2);

	}//main() end
	
//Hello Github


}//class end
