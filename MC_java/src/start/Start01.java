package start;

public class Start01 {

	public static void main(String[] args) { 
		int age = 17;
		float height = 174.9f;
		boolean isFemale = false;
		String name = "yoonsangyoun";
		// 나이 이름 키(실수) 남자는 false 여자는 true
				
		System.out.println(age); //줄바꿈
		System.out.print(height); //줄바꿈X
		System.out.print(name); //줄바꿈X
		System.out.printf("여자인가요? : %b", isFemale); //변수 바인딩
	}

}
