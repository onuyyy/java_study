
public class 문자열_6 {

	public static void main(String[] args) {
		
		String menu = ("오겹살(2인분)+한맥2병"
				+ " 38,000원"
				+ "목살(2인분)+한맥2병"
				+ " 38,000원");
		
		System.out.println(menu);
		
		System.out.println("========================");
		
		String[] menus = menu.split("원");		// split은 "원"을 앞에서 잘라서 구분해줌
		
		for(String m:menus) {
			System.out.println(m+"원");
		}
	}

}

