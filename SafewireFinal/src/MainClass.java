
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation_java\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
	   driver.findElement(By.name("q")).sendKeys("safewire");
	   
	   driver.findElement(By.name("btnK")).submit();
	   
	   Thread.sleep(1000);
	   driver.findElement(By.cssSelector("div:nth-child(2) > .rc .ellip")).click();
	   System.out.println("Title of the page is : "+driver.getTitle());
	   
	   driver.findElement(By.xpath("//a[contains(@href, '/s/SafeWire-QuickStartGuide-for-Realtorscompressed.pdf')]")).click();
	   System.out.println("PDF is open....");
	   
	   Thread.sleep(1000);
	  // String getURL = driver.getCurrentUrl();
	  // System.out.println("Current URL " +getURL);
	   
	  
	   String fAddress = "https://static1.squarespace.com/static/5b3a2c7c266c075328f8ff56/t/5b6c842b4fa51a46a359e2a0/1533838380135/SafeWire+QuickStartGuide+for+Realtors.compressed.pdf";
       String destinationDir = "D:\\";
       readFile.fileDownload(fAddress, destinationDir);
       URL url = new URL(driver.getCurrentUrl());
       System.out.println(url);
       System.out.println("File downloaded Successfully on D Drive..");
       
       
	 
	   driver.findElement(By.linkText("About")).click();
	   System.out.println("About SafeChain page is open");
	   Thread.sleep(5000);
	   
	   driver.close();
	   driver.quit();
	   
	}

}
