/*
 * 
 * 세 개의 정수를 받아서 평균을 구해서 등급을 출력한다
 * 
 * >=90
 * >=80
 * >=70
 * >=60
 * 		else >60
 * 
 */
import java.util.Scanner;

public class 다중조건문_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  // Sysrem.in은 키보드 입력값을 받아서 메모리에 저장해주는 역할
												// scanner : 정수 (nextInt();, 실수 (nextDouble(); nextBoolean(), 
												// next() : 문자열 (문자 char은 존재하지 않는다
												// 도스에서만 사용이 가능
		
		System.out.println("세 개의 정수 입력");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int avg = (kor+eng+math)/3;
		
		System.out.println("국어 점수 : "+kor);
		System.out.println("국어 점수 : "+eng);
		System.out.println("국어 점수 : "+math);
		
		System.out.println("총점 : "+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+math+eng)/3.0);
				
		// 학점 계산
		char score ='F';	// 값이 변경이 없는 경우에 처리되는 값(default)
		if(avg >= 90)
			score='A';
		else if(avg >= 80)
			score = 'B';
		else if(avg >= 70)
			score = 'C';
		else if(avg >= 60)
			score = 'D';
		else	// 이것을 안 쓰려면 위의 디폴트 값을 F학점으로 잡아주면 된다 (위 조건에 맞는 것 없으면 F로 나오게끔)
			score='F';
		
		System.out.println("학점 : "+score);
		
				
		// else if 문장은 수행하면 바로 종료
		// if는 맞으면 다음으로 넘어가서 계속 수행함
		
		

	}

}
