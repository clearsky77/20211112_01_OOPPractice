package codes;

public class MainDrive {

	public static void main(String[] args) {
		Book b1 = new Book();
		
		b1.title = "어린 왕자";
		b1.limitAge = 0;
		b1.rentFee = 500;
		
		b1.title = "타짜";
		b1.limitAge = 19;
		b1.rentFee = 700;
	}

}
