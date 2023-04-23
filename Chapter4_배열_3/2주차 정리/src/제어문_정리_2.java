/*
 * 
 * 1. 조건문 / 선택문
 * 		=> ex) 상세보기, 검색, 로그인, 아이디 테크, 우편번호 검색, 댓글, 수정, 삭제 ...
 * 		=> 형식)
 * 			if(조건문) >> 조건문 안에는 연산자가 들어가야 함 (부정연산자, 비교연산자, 논리연산자) {
 * 				출력내용 >> true일 때만 수행하는 문장
 * 			}
 * 				ex) 번호가 3번인 내용을 출력
 * 					if(int i = 3); {
 * 					 sout("출력");
 * 					}
 * 		=> 단일조건문 : 속도가 늦다, 독립적인 문장이다, 중복적으로 수행할 떈 단일로 많이 쓴다
 * 		=> 다중조건문 : 조건이 많은 경우 해당되는 조건만 수행이 가능
 * 			1) if ~ else
 * 			true false를 나눠서 처리
 * 			if(조건문) {
 * 				조건이 true일 때 수행
 * 			} else {
 * 				조건이 false일 때 수행
 * 			}
 * 
 * 			ex) if(로그인이 되었다면) {
 * 					home으로 이동해라
 * 				} else {
 * 					회원가입으로 이동해라
 * 				}
 * 			ex) if(아이디 중복체크) {
 * 					이미 사용중인 아이디입니다
 * 				} else {
 * 					사용 가능한 아이디입니다
 * 				}
 * 			
 * 			2) if ~ else if
 * 				if(조건문) {
 * 					조건이 true일 때 수행  ==> true이면 여기서 종료
 * 								   ==> false이면 아래로 내려감
 * 				} else if(조건문) {
 * 					조건이 true일 때 수행  ==> true이면 여기서 종료
 * 								   ==> false이면 아래로 내려감
 * 				} else if(조건문) {
 * 					조건이 true일 때 수행  ==> true이면 여기서 종료
 * 								   ==> false이면 아래로 내려감
 * 				} else		
 * 					위 조건에 해당사항이 없는 경우 ==> 생략 가능
 * 				}
 * 
 * 			--	조건이 두 개인 경우 ==> &&
 * 				if(아이디가 같고 비밀번호가 같으면 id.equals("") && pw.equals("")) {
 * 				
 * 				} if(id.equals("")) {
 * 					if(pw.equals("")) {
 * 						로그인
 * 					} else {
 * 						비밀번호가 틀립니다
 * 					} 
 * 					else {
 * 						아이디가 존재하지 않습니다
 * 					}
 * 		=> 선택문 : 네트워크, 게임 (키값)
 * 			ex) switch(정수,문자,문자열) {		>> 해당 위치부터 break가 있을 때까지 수행한다, break가 없으면 밑에 문장까지 계속해서 수행한다
 * 				case "Find" :
 * 				case "Search" :  >> 두 개의 case 동시 처리 가능
 * 					처리
 * 					break;
 * 				case "Login" :
 * 					처리
 * 					break;
 * 				case "Logout" :
 * 					처리
 * 					break;
 * 				default :
 * 					해당 문자열이 없는 경우에 처리
 * 			}
 * 
 * 			ex)	case 1 :
 * 					문장1			>> case 1번이면 여기서 수행 후 종료
 * 					break;
 * 				case 2 :
 * 					문장2			>> case 2번이면 4번 수행 후 종료 (break 위치 확인)
 *  			case 3 :
 *  				문장3
 * 				case 4 :
 * 					문장4
 * 					break;
 * 				case 5 :
 * 					문장5
 * 
 * 			ex) switch() {
 * 				case 1 :
 * 					int a = 10;
 * 					sout(a);
 * 					break;
 * 				case 2 :
 * 					int a = 20;
 * 					sout(a);
 * 					break;
 * 				case 3 :
 * 					int a = 30;
 * 					sout(a);
 * 					break;
 * 				}				==> switch 값이 2라면 ... 오류 : 같은 블록 안에 같은 변수를 썼기 때문에 오류 발생
 * 																==> case마다 블록을 생성해주면 오류 해결
 * 
 * 
 * 
 * 
 * 2. 반복문
 * 		=> ex) 목록, 페이징 (화면 출력)
 * 		1) for : 반복횟수가 지정된 경우에 주로 사용
 * 		2) while : 반복횟수가 없는 경우에 사용
 * 			=> 파일 읽기. 데이터베이스(갯수를 알지 못할 땐 while)
 * 		3) do ~ while : 한 번 이상은 수행할 때 사용
 * 
 * 3. 반복 제어문
 * 		=> 페이징
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
import java.io.*;
public class 제어문_정리_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		** 선택문 예시		
//		int i = 1;
//		int a = 1;					// 변수를 밖으로 빼서 써도 된다
//		switch(i) {
//		case 1 : {
//			a = 10;
//			System.out.println(a);
//			break;
//		}
//		case 2 : {
//			a = 20;
//			System.out.println(a);
//			break;
//		}
//		case 3 : {
//			a = 30;
//			System.out.println(a);
//			break;		
//		}
//		}
		
		
		
//		** for문 ( ** 오류 있음 다시 봐라)
		
		String[] title = {"Kitsch","CHRISTIAN","꽃","Ditto","Hype boy","Teddy Bear","사건의 지평선","OMG","심 (心)","I Don't Think That I Like Her","사랑은 늘 도망가","건물 사이에 피어난 장미","우리들의 블루스","빙글빙글 (Prod. by R.Tee)","가질 수 없는 너","After LIKE","다시 만날 수 있을까","밤이 무서워요 (Lonely Night)","이제 나만 믿어요","London Boy","파이팅 해야지 (Feat. 이영지)","Polaroid","무지개","Attention","아버지","A bientot","LOVE DIVE","손이 참 곱던 그대","사랑인가 봐","사랑해 진짜","연애편지","보금자리","인생찬가","ANTIFRAGILE","NIGHT DANCER","Dangerously","Zero","The Drum","Like Crazy","바보가슴","Nxde","사랑하기 싫어","새삥 (Prod. by ZICO) (Feat. 호미들)","That's Hilarious","Nostalgia","흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야","Monologue","VIBE (Feat. Jimin of BTS)","Dynamite","오르트구름","그때 그 순간 그대로 (그그그)","다정히 내 이름을 부르면","TOMBOY","너의 모든 순간","해요 (2022)","Pink Venom","Unholy","Shut Down","취중고백","Dreamers (Music from the FIFA World Cup Qatar 2022 Official Soundtrack) (Feat. FIFA Sound)","그라데이션","Stay","That That (Prod. & Feat. SUGA of BTS)","사랑하지 않아서 그랬어","Loving You Girl (Feat. Hkeem)","고백","Set Me Free Pt.2","내가 아니라도","Cookie","Love Me Like This","Say I Love You","보고싶었어","나의 X에게","NOT SORRY (Feat. pH-1) (Prod. by Slom)","Candy","D N D","그대를 알고","그중에 그대를 만나","아모르 파티","ELEVEN","너를 보는게 지친 하루에","Rush Hour (Feat. j-hope of BTS)","Butter","아로하","봄날","When I Get Old","Say My Name","잘가요","희재","2002","모든 날, 모든 순간 (Every day, Every Moment)","정이라고 하자 (Feat. 10CM)","나의 목소리로","Blueming","FEARLESS","발걸음","당신을 만나","Every Second","봄여름가을겨울 (Still Life)","LOVE me","나비무덤","딱 10CM만","결국엔 너에게 닿아서","자격지심 (Feat. ZICO)","Off My Face","밤하늘의 별을 (2020)","인생은 뷰티풀","신호등","빛이 나는 사람","Face-off","주마등","Permission to Dance","오래오래","Bad Habits","주저하는 연인들을 위해","슬픈등","친구","Celebrity","Made You Look","Bad","Love story","약속 (約束)","INVU","Il Mare Calmo Della Sera","Alone","벚꽃 엔딩","떠나보낼 준비해 둘걸 그랬어","내 기쁨은 너가 벤틀리를 끄는 거야","At My Worst","내 손을 잡아","사계 (Four Seasons)","Love in Portofino","마지막 사랑","Left and Right (Feat. Jung Kook of BTS)","위대한 사랑 (Un Amore Cosi Grande)","나비 (Outro)","비와 당신","우린 그렇게 사랑해서","OHAYO MY NIGHT","Poppy (Korean Ver.)","Stronger (What Doesn't Kill You)","strawberry moon","풍등","Yet To Come","Ai Wo Tsutaetaidatoka","Feel My Rhythm","찰나가 영원이 될 때 (The Eternal Moment)","예뻤어","새벽에 걸려온 너의 전화는","라일락","오늘도 빛나는 너에게 (To You My Light) (Feat.이라온)","어떻게 이별까지 사랑하겠어, 널 사랑하는 거지","그댄 행복에 살텐데 (2022)","That's Not How This Works (Feat. Dan ＋ Shay)","Cupid","on the street","한 페이지가 될 수 있게","비도 오고 그래서 (Feat. 신용재)","바라만 본다","Next Level","첫눈처럼 너에게 가겠다","Weekend","있잖아","Switch","BETELGEUSE","팡파레","헤픈 우연","WHEN I MOVE","En Garde (준비,시작!)","도깨비불 (Illusion)","Tiny Riot","사이렌 Remix (Feat. UNEDUCATED KID & Paul Blanco)","마이웨이 (MY WAY) (Prod. by R.Tee)","건배","회전목마 (Feat. Zion.T & 원슈타인) (Prod. by Slom)","GHOST TOWN","12 : 45 (Stripped)","에잇 (Prod. & Feat. SUGA of BTS)","트위스트고고","너의 번호를 누르고 (Prod. by 영화처럼)","그대가 내 안에 박혔다 (그내박)","Expectations","시작","언제나 사랑해","MY BAG","나와 함께 가시렵니까","봄 사랑 벚꽃 말고","KISS ME (Feat. BIG Naughty)","처음부터 너와 나","너를 생각해","Way Back Home","오래된 노래","오.내.언.사 (Guitar Ver.)","Crazy","바람 같은 사람","스티커 사진","좋아 (JOAH)","사나이 청춘","비 오는 날 듣기 좋은 노래 (Feat. Colde)","밥 한 번 먹자"};
		System.out.println("총 "+title.length+"곡");
		
		int page = 0;
		if(page==0)		// default 만듦
			page=1;

		int j = 0;
		int rowSize = 50;
		int pagecnt = (page*rowSize)-rowSize;		// 시작 위치 , 여기서부터 10개를 가져와라
		/*
		 * start		end
		 *   0			 9  => 1page
		 *   10			 19 => 2page
		 *   20			 29 => 3page
		 */
		
		for(int i = 0; i < title.length; i++) {
			if(j < 10 && i >= pagecnt) {				// 0 ~ 9 skip
				if(j < rowSize && i >= pagecnt) {
				System.out.println((i+1)+"."+title[i]);
				j++;
				}
			}	
			System.out.println("페이지 입력 : ");
			page = scan.nextInt();
			break;
		}

		System.out.println("while 사용");
		try {
			FileReader fr = new FileReader("C:\\javaDev\\javaStudy\\2주차 정리\\src\\제어문_정리_2.java");
			int i = 0;
			while((i-fr.read())!=-1) {
				System.out.print((char)i);
			}
		} catch(Exception ex) {}
		
		
		
		
	}

}
