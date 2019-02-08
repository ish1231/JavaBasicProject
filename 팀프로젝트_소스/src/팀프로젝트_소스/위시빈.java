/*
    <div class="trav-sch">
        <a target="_blank" href="/plan/7d43057ada7a788a" class="plan_link" data-id="7d43057ada7a788a" >
            <div class="cover-img">
                <img src="https://thumb-wishbeen.akamaized.net/8-ecrddWjWFb4qnRHvWfu5bsEu8=/448x170/smart/filters:no_upscale()/img-wishbeen.akamaized.net/plan/1482124278566_IMG_0824.JPG" />
                <div class="bg"></div>
            </div>
            <div class="list-author-info">
                <div class="user-img"><img src="https://thumb-wishbeen.akamaized.net/9qdBn67bvxOeo9OkdYPMdtjnN68=/22x22/smart/filters:no_upscale()/img-wishbeen.akamaized.net/profile/1461814413559_KakaoTalk_20160428_123306609.jpg" alt="" /></div>
                <div class="user-name">SSEgoon(쌔군)</div>
                <div class="user-label">Author</div>
                
                <div class="user-type">오사카 주유패스 소셜가 비교</div>
                
            </div><!-- list-author-info -->

            <div class="plan-tit">
                <h3>신나게 돌아댕기는 오사카-쿄토여행 (관광 30% + 쇼핑 30% + 먹방 40%)</h3>
                <div class="countries-day-term">
                    <span class="state">일본</span><span>5일</span>
                </div>
                
            </div> <!-- plan-tit -->

            <div class="list-contents">
                <div class="tit">오사카 → 유니버셜 → 쿄토 → 공항 면세점 (관광 30% + 쇼핑 30% + 먹방 40%)</div>
                <div class="desc">- 사내 2명이 발에 땀나도록 돌아댕기는 오사카-쿄토 3박 4일 투어

① 한국 → 오사카 텐노지 → 오사카 우메다
② 유니버셜스튜디오 재팬 → 덴덴타운 → 온천
③ 쿄토 →  여행정리
④ 도톤보리 → 공항쇼핑 → 한국

- 이전에도 같이 가봤는데, 사내 2명이 전망대에서, 명승지에서, 잡화점에서 1시간 이상 있지를 않더라구요.
- 스케쥴이 30분 단위라 실제로는 조금 남는경우도, 부족한 경우도 있습니다. 스케쥴 중간중간에 시간이 남을경우와 부족할 경우에 대한 스케쥴 조정이 기록되어 있습니다.
- 장소명을 누르시면 더 많은 정보를 보실 수 있습니다.
- 지도는 흐릿하게 보일 수 있지만, 스마트 폰 위시빈 어플로 보시면 선명하게 보입니다.
- 빡세게 준비하는것이 실행착오를 줄이고, 시간을 절약하는 길이다!
- 계속 업데이트 중입니다!</div>
            </div><!-- list-contents -->

            <div class="response">
                <div class="tour-time">여행 후</div>
                <div class="count">
                    <div class="post"><span>190</span>개의 포스트</div>
                    <div class="spot"><span>54</span>개의 명소</div>
                </div>
            </div>
        </a>
    </div>
</li>



<li class="plan-item" data-id="8972cf0c5cfbe979">
    <!-- 유저페이지에서 내 페이지일 때 삭제 버튼 넣어야함 -->
    
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
                
                <div class="user-type">후불제쿠폰으로 관광지 할인</div>
                
            </div><!-- list-author-info -->


*/
//
//
package 팀프로젝트_소스;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 위시빈 {

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
