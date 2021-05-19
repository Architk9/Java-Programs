//change2
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment1 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.drive","C:\\\\Users\\\\Madhuri\\\\Drivers\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='search']")).sendKeys("Howstuffworks");
	List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@role='listbox']//li[@class='sbct']"));
	System.out.println(suggestion.size());
	for (int i=0; i<=suggestion.size();i++)
	{
		System.out.println("suggestion(i)");
	}
		
}
}
