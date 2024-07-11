package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement UserName= driver.findElement(By.id("username"));
		UserName.sendKeys("DemoSalesManager");
		WebElement Password= driver.findElement(By.name("PASSWORD"));
		Password.sendKeys("crmsfa");
		WebElement Login = driver .findElement (By.className("decorativeSubmit"));
			Login.click();	
			WebElement CRMFA= driver.findElement(By.linkText("CRM/SFA"));
			CRMFA.click();
			WebElement Account = driver.findElement(By.linkText("Accounts"));
			Account.click();
			WebElement CreateAccount= driver.findElement(By.linkText("Create Account"));
			CreateAccount.click();
			WebElement AccountName= driver.findElement(By.id("accountName"));
			AccountName.sendKeys("ArunAccountNew1");
			WebElement Description = driver.findElement (By.name("description"));
			Description.sendKeys("Selenium Automation Tester");
			WebElement IndustryDD= driver .findElement (By.name("industryEnumId"));
			Select DropDown = new Select (IndustryDD);
			DropDown.selectByVisibleText("Computer Software");
			WebElement Ownership = driver .findElement(By.name("ownershipEnumId"));
			Select OwnershipDD= new Select(Ownership);
			OwnershipDD .selectByIndex(4);
			WebElement Source = driver .findElement(By.id("dataSourceId"));
			Select SourceDropDown = new Select(Source);
			SourceDropDown.selectByValue("LEAD_EMPLOYEE");
			WebElement MarketingCampaign= driver .findElement(By.id("marketingCampaignId"));
			Select MarketingDD = new Select(MarketingCampaign);
			MarketingDD.selectByIndex(6);
			WebElement Province= driver .findElement(By.name("generalStateProvinceGeoId"));
			Select provinceDD= new Select(Province);
			provinceDD.selectByValue("TX");
			WebElement CreateAccountFinal=driver.findElement(By.className("smallSubmit"));
			CreateAccountFinal.click();
			
			String accountnameprint= driver.findElement(By.id("accountName")).getText();
			System.out.println("The account name is " +accountnameprint);
						

	}

}
