package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://erail.in/");;
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("Coimb", Keys.ARROW_DOWN, Keys.ENTER);
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("Chenn", Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
		Thread.sleep(1000);
		List<WebElement> findElement = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
		/*
		 * String text = driver .findElements(By.
		 * xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]")).get
		 * (0).getText();
		 */
		List<String> trainList = new ArrayList<String>();
		System.out.println("No of trains are: " + findElement.size());
		for (int i = 0; i < findElement.size(); i++) {
			String trainName = findElement.get(i).getText();
			trainList.add(trainName);
		}
		System.out.println("\n****Before Sorting****\n");
		for (String UnSortedTrainList : trainList) {
			System.out.println(UnSortedTrainList);
		}
		System.out.println("\n****After Sorting****\n");
		Collections.sort(trainList);
		for (String SortedTrainList : trainList) {
			System.out.println(SortedTrainList);
		}

	}

}
