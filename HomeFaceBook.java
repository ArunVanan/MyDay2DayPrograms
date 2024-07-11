package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeFaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		WebElement CreateAccount=driver.findElement (By.xpath("//a[text()='Create new account']"));
		CreateAccount.click();
	    WebElement EnterMobile=driver.findElement(By.name("firstname"));
	    EnterMobile.sendKeys("Aarush");
	    WebElement Lastname=driver.findElement(By.name("lastname"));
	    Lastname.sendKeys("Arun");
	    WebElement Email=driver.findElement(By.name("reg_email__"));
	    Email.sendKeys("aarusharun@gmail.com");
	    WebElement ReEmail=driver.findElement(By.name("reg_email_confirmation__"));
	    ReEmail.sendKeys("aarusharun@gmail.com");
	    WebElement NewPassword= driver.findElement(By.name("reg_passwd__"));
	    NewPassword.sendKeys("1234");
	    WebElement DOB = driver.findElement(By.name("birthday_day"));
	    Select DD= new Select(DOB);
	    DD.selectByVisibleText("14");
	    WebElement Month1=driver.findElement(By.id("month"));
	    Select Mnth= new Select(Month1);
	    Mnth.selectByVisibleText("Sep");
	    WebElement YR = driver.findElement(By.name("birthday_year"));
	    Select YearOfB = new Select (YR);
	    YearOfB.selectByVisibleText("1990");
	    WebElement Radio=driver.findElement(By.className("_58mt"));
	    Radio.click();
	    	

	}

}
