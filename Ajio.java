package week3.day2;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@for,'Fashion')]")).click();
		Thread.sleep(1000);
		String filterCount = driver.findElement(By.xpath("//div[@class='filter-container']/div[1]/div[1]")).getText();
		System.out.println("Filtered count: "+filterCount);
		Thread.sleep(2000);
		List<WebElement> findFilrdBrand = driver
				.findElements(By.xpath("//div[@class='preview']/div[2]/div[@class='brand']"));
		System.out.println("Size of brand: "+findFilrdBrand.size());
		for (WebElement webElement : findFilrdBrand) {
			System.out.println(webElement.getText());
		}
		//Set<String> removeDup=new LinkedHashSet<String>(findFilrdBrand);
		List<WebElement> filteredName = driver
				.findElements(By.xpath("//div[@class='preview']/div[2]/div[@class='name']"));
		System.out.println("Size of name: "+filteredName.size());
		for (WebElement webElementName : filteredName) {
			System.out.println(webElementName.getText());
		}
	}

}
