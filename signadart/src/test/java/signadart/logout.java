package signadart;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	 
	public class logout {
	    @Test
	    public void logoutv1() {
	    	  System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	 
	        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
	 
	        driver.get("https://signadart.ai/");
	        driver.findElement(By.xpath("//span[text()='Login']")).click();
	        driver.findElement(By.name("userName")).sendKeys("Testingteam@signatech.com");
	        driver.findElement(By.name("password")).sendKeys("test@123");
	        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	        driver.findElement(By.xpath("//span[contains(@class, 'avatar-circle bg-amber-500')]")).click();
	        driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
	        // Check if the URL after logout is "https://signadart.ai/"
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertEquals(currentUrl, "https://signadart.ai/", "Logout was not successful.");
	 
	        driver.quit();
	    }
	}
