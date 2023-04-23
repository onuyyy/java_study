/*
 * 1-2+3-4+-6+7-8+9-10  >>  값?
 * 
 * for문은 일정한 패턴이 존재해야 사용 가능 (수열이 있어야 함)
 * 
 */
public class 반복문_4 {

	public static void main(String[] args) {

		
		
		int i = 0, sum = 0;
		for(i = 1; i <= 10; i++) {
			if(i%2==0) {
				sum-=1;
			}
			else {
				sum+=i;
			}
		}
		System.out.println("sum = "+sum);

	}

}
