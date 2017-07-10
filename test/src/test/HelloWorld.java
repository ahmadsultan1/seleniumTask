package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HelloWorld {
static WebDriver driver;
	
	public static void main(String[] args){
		//this block would open the autotrader site
		String str2 = "C:\\\\Users\\Ahmad Sultan\\Desktop\\Newfolder\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", str2);

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.autotrader.co.uk");
		driver.manage().window().maximize();
		
		//this block would search for the make ASTON MARTIN
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='searchVehiclesMake']")));
		sel1.selectByValue("ASTON MARTIN");
		
		//this block would find the model DB6
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='searchVehiclesModel']")));
		sel2.selectByValue("DB6");
		
		//this would click the search button
		driver.findElement(By.xpath(".//*[@id='search']")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='postcode-lightbox-form']/span/span/input")).sendKeys("HA35LZ");
		//Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='postcode-lightbox-form']/span/span/input")));
		
		driver.findElement(By.xpath(".//*[@id='postcode-lightbox-continue']")).click();
	}
}