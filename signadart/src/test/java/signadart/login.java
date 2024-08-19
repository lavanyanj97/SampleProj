package signadart;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	 
	public class login {
	    @Test
	    public void loginv1() {
	        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
	        driver.get("https://signadart.ai/");
	        driver.findElement(By.xpath("//span[text()='Login']")).click();
	        driver.findElement(By.name("userName")).sendKeys("Testingteam@signatech.com");
	        driver.findElement(By.name("password")).sendKeys("test@123");
	        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	        WebElement welcomeTextElement = driver.findElement(By.xpath("//*[contains(text(),'Welcome onboard')]"));
	        if (welcomeTextElement.isDisplayed()) {
	            System.out.println("Pass");
	        } else {
	            System.out.println("Fail");
	        }
	        driver.quit();
	    }
	}


