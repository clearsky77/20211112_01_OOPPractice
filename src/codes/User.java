package codes;

public class User {
	String name;
	int birthYear;
	int money;
	String phoneNum;
	
	// 출생연도 - 궁금한 연도의 나이를 알려주는 기능
	
	int getKoreanAge (int year) {
		
		int age = year - this.birthYear + 1;
		
		return age;
	}
	
	void printUserInfo() {
		System.out.println("====================");
		System.out.println("     사용자 정보");
		System.out.println("이름:"+name);
		System.out.println("현재 나이:"+getKoreanAge(2021));
		System.out.println("보유 금액:"+money);
		System.out.println("연락처:"+phoneNum);
		System.out.println("====================");
	}
}
