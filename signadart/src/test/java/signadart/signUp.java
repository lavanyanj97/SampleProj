package signadart;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	 
	public class signUp {
	    @Test
	    public void main() {
	    	  System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	 
	        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
	 
	        driver.get("https://signadart.ai/");
	 
	        driver.findElement(By.xpath("//span[text()='Login']")).click();
	        driver.findElement(By.linkText("Sign up")).click();
	        driver.findElement(By.name("firstName")).sendKeys("Test");
	        driver.findElement(By.name("lastName")).sendKeys("User1");
	        driver.findElement(By.name("email")).sendKeys("testuser1@gmail.com");
	 
	        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	 
	        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	 
	        WebElement confirmationMessage = driver.findElement(By.xpath("//*[contains(text(), 'Please check your email to set your password.')]"));
	        Assert.assertTrue(confirmationMessage.isDisplayed(), "Sign-up was not successful.");
	 
	        driver.quit();
	    }
	}

