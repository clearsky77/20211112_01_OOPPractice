package codes;

public class MainDrive {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.title = "어린 왕자";
		b1.limitAge = 0;
		b1.rentFee = 500;
		
		b2.title = "타짜";
		b2.limitAge = 19;
		b2.rentFee = 700;
		
		b1.printBookInfo();
		b2.printBookInfo();
		
		User u1 = new User();
		u1.name = "김어른";
		u1.birthYear = 1980;
		u1.money = 50000;
		u1.phoneNum = "010-6666-7777";

		User u2 = new User();
		u2.name = "이샛별";
		u2.birthYear = 2010;
		u2.money = 200;
		u2.phoneNum = null ; // 없다를 표현해보자.
		
	}

}
