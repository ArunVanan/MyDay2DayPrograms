package week1.day2;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library Lib=new Library();
		Lib.addbook(null);
		Lib.issuebook();
		
	}
	
	public String addbook(String bookTitle) {
		System.out.println("Book Added Successfully");
		return bookTitle;	
	}
	public void issuebook() {
		System.out.println("Book issued successfully");
	}

}
