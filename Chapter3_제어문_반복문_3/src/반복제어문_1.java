/*
 * 
 * 반복제어문
 * 	= break
 * 		> 반복문을 종료
 * 		> 반복문 (for, do~while, while), 선택문  (switch~case)
 * 		> break 밑에는 코딩이 불가능하다
 * 			for() {
 * 				if() {
 * 					break;
 * 					>> 이 줄은 코딩 불가능
 * 				}  
 * 
 * 
 * 	= continue
 * 		> 특정 부분을 제외할 때 사용 (반복문을 계속 수행)
 * 		> 반복문(for, do~while, while)에서만 사용이 가능
 * 		> 웹에서는 거의 없고 앱에서 주로 사용
 * 
 * 
 * 
 * 
 * 
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		
		System.out.println("==============break");
		
		for(int i = 1; i <= 10; i++) {
			if(i==5)
				break;			// 4까지만 출력하고 5일 때 중단, 단독 if문일 때 break 쓰면 오류, 무조건 반복문 안에서만
			System.out.print(i+" ");
		}
		
		/*
		 *	for > break 종료, continue 증가식 이동 
		 *	while > break 종료, continue 조건식으로 이동
		 * 							> 처음부터 다시 실항할 때
		 * 							> 잘못하면 무한루프가 걸릴 수도 있음
		 * 
		 * 	int i =1;
		 *  while(i <= 10) {
		 *  	if(i==5)
		 * 		continue;
		 * 		sout(i+" ");	> 1,2,3,4 지나고 5가 되었을 때 무한루프가 걸린다, 조건식으로 올라가기 때문에 계속 continue에서 걸림
		 * 		i++;
		 * 	}
		 * 
		 */
		
		System.out.println("\n============continue");
		
		for(int i = 1; i <= 10; i++) {
			if(i==5 || i==7 || i==9)
				continue;	// continue가 걸리면 5를 지나치고 i++로 올라간다
			System.out.print(i+" ");
		}
		
		System.out.println("==============comtinue 무한루프");
		
//		int i =1;
//		while(i<=10) {
//			if(i==5)
//				continue;			>> 단점 : 증가식으로 안 가고 조건식으로 가기 때문에 문제가 될 수 있음
//			System.out.print(i);
//			i++;					>> 무한루프 걸린 상태
//		}
		
	}

}
