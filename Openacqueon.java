package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Openacqueon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
       driver.manage().window().maximize();
       
   WebElement Username= driver.findElement(By.id("username"));
   Username.sendKeys("DemoSalesManager");	
   WebElement Password= driver.findElement(By.id("password"));
   Password.sendKeys("crmsfa");
   WebElement Enter= driver .findElement(By.className("decorativeSubmit"));
   Enter.click();
   WebElement Hyper=driver.findElement(By.partialLinkText("CRM/SFA"));
   Hyper.click();
   WebElement FindLead=driver.findElement(By.linkText("Leads"));
   FindLead.click();
   WebElement CreateLead=driver.findElement(By.linkText("Create Lead"));
   CreateLead.click();
   WebElement CompanyName=driver.findElement(By.id("createLeadForm_companyName"));
   CompanyName.sendKeys("Acqueon");
   WebElement FirstName=driver.findElement(By.id("createLeadForm_firstName"));
   FirstName.sendKeys("Arun");
   WebElement LastName=driver.findElement(By.id("createLeadForm_lastName"));
   LastName.sendKeys("Arun");
   WebElement DropDown= driver.findElement(By.id("createLeadForm_dataSourceId"));
   Select DD = new Select (DropDown);
   DD.selectByVisibleText("Employee");
   WebElement LeadSubmit=driver.findElement(By.className("smallSubmit"));
   LeadSubmit.click();
   driver.close();
  
	}
	
}
