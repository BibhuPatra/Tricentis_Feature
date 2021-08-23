package step_definitions;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.testRunner.TricentisPageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Steps {

	private WebDriver driver;
	private TricentisPageFactory ticenties;
	XSSFWorkbook wb;
	XSSFSheet sh;


	@Before
	public void openBrowser() throws Exception{
		//launching web browser....
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ticenties = new TricentisPageFactory(driver);
		driver.manage().window().maximize();

		ticenties = PageFactory.initElements(driver, TricentisPageFactory .class);

		//reading file from excel....
		FileInputStream fread = new FileInputStream("./exceldata/tricentis_cucumber.xlsx");
		wb=new XSSFWorkbook(fread);
	}
	
	String LoginLink = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a";

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
		driver.navigate().to("http://demowebshop.tricentis.com/");
	}
	@When("User click on login link")
	public void user_is_clicking_login_link() {
		System.out.println("LoginLink");
		driver.findElement(By.xpath(LoginLink)).click();
	}
	@And("put the credentials")
	public void putting_credential() {
		System.out.println("Putting Credential");
		ticenties.setUname("bot.ptr@yahoo.com");
		ticenties.setPassword("Admin@123");
	}
	@Then("Click on login button")
	public void Click_on_login_button() {
		System.out.println("Putting Credential");
		ticenties.clickLogin();
	}
	@Given("user is on home page with authenticated")
	public void HomePageAuthenticated() {
		System.out.println("User is inside the site with fully authentication");
		
	}
}

