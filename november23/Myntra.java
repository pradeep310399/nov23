package november23;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		
		//creating an object of Actions class
		
		Actions action = new Actions(driver);
		
		//perform the mousehover process
		action.moveToElement(men).perform();
		
		//click on the jackets
		driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		
		//find the total count
		
		String count = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Totalount is:"+count);
		
		//validate the sum of categories
		
		String categories = driver.findElement(By.xpath("//span[@class='categories-num']")).getText();
		System.out.println("sum of categories: "+categories);
		
		String categories2 = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		System.out.println("sum of categories2:"+categories2);
		
		String sum = categories + categories2;
		
		if(count==sum) {
			
			System.out.println("equals");
			
		}else {
			System.out.println("Not equals");
			
		}
		//check the jacket
		driver.findElement(By.xpath("//div[@class='common-checkboxIndicator']")).click();
		System.out.println("checked");
		
		//click the + at the brand
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		
		WebElement duke = driver.findElement(By.xpath("(//input[@class='FilterDirectory-searchInput'])"));
		duke.sendKeys("duke");
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//label[text()='Duke']")).click();
		
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		
		
		//check all the coats are duke using List and Set
		
		List<WebElement> duke1 = driver.findElements(By.xpath("//li[@class='product-base']"));
		Set<String> brandName = new HashSet<String>();
		for (WebElement webElement : duke1) {
			brandName.add(webElement.getText());

		}
		System.out.println(brandName);

		if (brandName.size() == 1) {
			System.out.println("All Coats are of brand" + brandName);
		}
		
			
			
		//sort by better discount
		
		WebElement sortBy = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		action.moveToElement(sortBy).perform();
		
		WebElement betterDiscount = driver.findElement(By.xpath("(//label[@class='sort-label '])[3]"));
		action.moveToElement(betterDiscount).doubleClick().perform();
		
		//price of the first displayed item
		
		String firstitem = driver.findElement(By.xpath("//span[@class='product-discountedPrice']")).getText();
		System.out.println("Price of the First displayed item: "+firstitem);
		
		driver.findElement(By.xpath("//div[@class='product-productMetaInfo']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String>();
		handlesList.addAll(handles);
		driver.switchTo().window(handlesList.get(1));
		driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
		System.out.println("wishlist is clicked");
		driver.close();
			
		
		
		
		
		
			
		
		
		
		
		
		
		
	} 

}
