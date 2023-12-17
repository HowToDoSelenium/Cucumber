package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	public static WebDriver driver;
	

	public void menuBar(String menu) {
		driver.findElement(By.xpath("(//*[text()='" + menu + "'])[1]")).click();
		driver.manage().deleteAllCookies();
	}

	public void submenu(String submenu) {
		driver.findElement(By.xpath("(//*[text()='" + submenu + "'])[1]")).click();
		driver.manage().deleteAllCookies();
	}

	public void brand(String brand) {
		driver.findElement(By.xpath("(//*[text()='" + brand + "'])[1]")).click();
		driver.manage().deleteAllCookies();
	}

	public void type(String page2elements) {
		driver.manage().deleteAllCookies();
		try {
			driver.findElement(By.xpath("(//a[@data-title='" + page2elements + "'])[1]")).click();
		} catch (Exception e) {
			driver.manage().deleteAllCookies();
			driver.findElement(By.xpath("(//*[text()='" + page2elements + "'])[1]")).click();
		}
		driver.manage().deleteAllCookies();
	}

	public void apply() {
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("(//button[@class='bc-sf-filter-select-button'])[5]")).click();
		driver.manage().deleteAllCookies();
	}
}