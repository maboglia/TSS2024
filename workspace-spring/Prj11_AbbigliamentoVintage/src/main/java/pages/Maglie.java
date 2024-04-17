package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.Costanti;

public class Maglie {

	private WebDriver driver;
	
	public Maglie() {
		this.driver = new ChromeDriver();
		this.driver.get(Costanti.MAGLIE);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(tagName = "tr")
	List<WebElement> righe;

	public void leggiRighe() {

		for (WebElement riga : righe) {
			System.out.println(riga.getText());
		}
		
	}
	
	
}
