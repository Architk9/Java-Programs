/*import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;

public class GoogleSearch 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhuri\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch driver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dynamic wait
		
		//driver.manage().timeouts().pageLoadTimeOut(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
		
		List <WebElements> li = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
			
		System.out.println("Number of suggestion list appearing"+ li.size());
		
		for (int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i).gettext());
			if (li.get(i).gettext().equals("testing tutorial"));
			{
				li.get(i).click();
				break;
			}
		}

		
	
	}
}
*/
