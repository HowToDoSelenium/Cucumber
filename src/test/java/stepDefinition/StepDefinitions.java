package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.MainPage;

public class StepDefinitions extends MainPage {
	MainPage mp = new MainPage();
	@Before
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	@When("User opens URL {string} and launch the application")
	public void user_opens_URL(String url) {
		driver.get(url);
	}

	@Then("Select {string} and click {string} from dropdown")
	public void select_and_click_dropdown(String menu, String subMenu) {
		mp.menuBar(menu);
		mp.menuBar(subMenu);
	}

	@Then("Select {string} and click {string}")
	public void select_and_click(String brand, String type) {
		mp.brand(brand);
		mp.type(type);
	}

	@Then("Select Apply")
	public void apply() {
		mp.apply();
	}
}
