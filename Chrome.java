package Week3.day1;

public class Chrome extends Browser {

	public static void main(String[] args) {
	
		Chrome ch= new Chrome();
		ch.openURL();
		ch.closebrowser();
		ch.navigateBack();
		System.out.println(ch.Browsername);
		System.out.println(ch.browserversion);

	}
	public void openincognito() {
		
		System.out.println("Incognito Mode");
		
	}
	public void clearcache() {
		
		System.out.println("ClearCache");
	}
	}


