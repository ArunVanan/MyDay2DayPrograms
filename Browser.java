package Week3.day1;

public class Browser {

	String Browsername = "Chromer";
	int browserversion = 1;
	
	public static void main(String[] args) 
	{
		Browser br=new Browser();
		br.openURL();
		br.closebrowser();
		br.navigateBack();
		System.out.println(br.Browsername);
		System.out.println(br.browserversion);
		
	}
	public void openURL() {
		
		System.out.println("The URL is open");
		
	}
	public void closebrowser() {
		
		System.out.println("The Browser is closed");
	}
	public void navigateBack() {
		
		System.out.println("Navigate Back");
	}

}
