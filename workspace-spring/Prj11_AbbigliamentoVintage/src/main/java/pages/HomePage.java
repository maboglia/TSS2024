package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Costanti;

public class HomePage {

	private WebDriver driver;
	
	public HomePage() {
		this.driver = new ChromeDriver();
		this.driver.get(Costanti.HOME_PAGE);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "username")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(css = "body > main > div > form > input.btn")
	WebElement btnLogin;

	public void doLogin() {
		
		username.sendKeys("test");
		password.sendKeys("test");
		btnLogin.click();
	}
	
	
}
