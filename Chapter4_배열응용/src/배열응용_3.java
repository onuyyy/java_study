import java.util.Arrays;

/*
 * 
 * 6개의 난수 발생 (1~45) > 중복된 수가 없다
 * 
 */
public class 배열응용_3 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j =0; j < i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;							// i를 왜 -- 시키지 ..?
					break;
				}
			}
			
		}
		
		int su = 0; // 난수를 저장
		boolean bCheck = false; // 중복 여부 확인
		
		for(int i = 0; i < lotto.length; i++) {
			bCheck = true;
			while(bCheck) { 						// 범위 지정 안 됐을 때 while
				su = (int)(Math.random()*45+1);
				bCheck = false;
				for(int j = 0; j < i; j++) {		// 범위 있을 때 for
					if(lotto[j]==su) {
						bCheck=true;
						break;
					}
				}
			}
			
		}
		
		System.out.println(Arrays.toString(lotto));
			
		
		
	}

}
