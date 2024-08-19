package signadart;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class attendEvent {
   @Test
   public void openJoinPage() {
	   System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

       driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

       driver.get("https://signadart.ai/join?id=6464");
       driver.findElement(By.xpath("//button[text()='Go to event']")).click();
       driver.findElement(By.id("inputField")).sendKeys("Tester");
       driver.findElement(By.xpath("//button[text()='Submit']")).click();
       driver.findElement(By.xpath("//button[text()='Leave Event']")).click();
       WebElement welcomeTextElement = driver.findElement(By.xpath("//*[contains(text(),'Welcome to Signa Dart!')]"));
       if (welcomeTextElement.isDisplayed()) {
           System.out.println("Pass");
       } else {
           System.out.println("Fail");
       }
       driver.quit();

   }
}
