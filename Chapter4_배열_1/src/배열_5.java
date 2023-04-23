import java.util.Arrays;

public class 배열_5 {

	public static void main(String[] args) {
		
		char[] arr = new char[20];
		for(int i = 0; i < arr.length; i++) {
			int  n = (int)(Math.random()*2); // 0, 1
			if(n==0)
				arr[i] = (char)((Math.random()*26)+65);		// 대문자 발생
			else 
				arr[i] = (char)((Math.random()*26)+97);
				
		}
		System.out.println(Arrays.toString(arr));
		
		int count1 = 0, count2 = 0;
		for(char c:arr) {
			if(c > 'A' && c <= 'Z')
				count1++;
			else
				count2++;
		}
		
		System.out.println("대문자 : "+count1);
		System.out.println("소문자 : "+count2);
		}

}
