package setUp;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class BrowserConfig {

	/**
	 * @author Thomas Cheriyan
	 *
	 * Lead QA Engineer
	 */
	
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Before
	public static void initializeBrowser(){

		System.setProperty("webdriver.gecko.driver", ".\\chromedriver\\geckodriver.exe");
//	    driver = new ChromeDriver();
	    driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    		
	}
	
	@After
	public static void closeBrowser(){

		driver.quit();
	    		
	}
	
	public static void main(String[] args) throws InterruptedException{
		BrowserConfig.initializeBrowser();
		driver.get("https://edureka.co/");
       
        try{
                    driver.findElement(By.xpath("//span[@data-button-name='Login']")).click();
        
        }catch(Exception e){
        	System.out.println("Cannot find login button"); //exception
        }
        
        BrowserConfig.closeBrowser();
	}
}
