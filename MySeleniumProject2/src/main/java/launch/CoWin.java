package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoWin {

	public static void main(String[] args) throws InterruptedException {
		/* WebDriverManager.chromedriver().setup(); */
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selfregistration.cowin.gov.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement enterMobile = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
		enterMobile.sendKeys("Enter your Mobile Number");

		WebElement getOtp = driver.findElement(By.xpath(
				"//*[@id=\"main-content\"]/app-login/ion-content/div/ion-grid/ion-row/ion-col/ion-grid/ion-row/ion-col[1]/ion-grid/form/ion-row/ion-col[2]/div/ion-button"));
		getOtp.click();
	}
}
