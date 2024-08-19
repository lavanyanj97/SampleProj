package signadart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import java.awt.Robot;
import java.awt.event.KeyEvent;
 
public class createEvent {
    @Test
    public void logoutv1() throws Exception {
    	  System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
 
        driver.manage().timeouts().implicitlyWait(20, java.util.concurrent.TimeUnit.SECONDS);
 
        driver.get("https://signadart.ai/");
        driver.findElement(By.xpath("//span[text()='Login']")).click();
        driver.findElement(By.name("userName")).sendKeys("Testingteam@signatech.com");
        driver.findElement(By.name("password")).sendKeys("test8786$");
        driver.findElement(By.xpath("//button[text()='Sign In']")).click();
        driver.findElement(By.cssSelector("div.header-action-item.header-action-item-hoverable")).click();
        driver.findElement(By.xpath("//span[text()='Event- Live']")).click();
        driver.findElement(By.xpath("//span[text()='Event']")).click();
        driver.findElement(By.xpath("//span[@class='ltr:ml-1 rtl:mr-1' and text()='Create Event']")).click();
        driver.findElement(By.xpath("//input[@name='title' and @placeholder='Enter Event name']")).sendKeys("Sample Event");
        driver.findElement(By.xpath("//textarea[@name='description' and @placeholder='Enter Event description']")).sendKeys("test");
        driver.findElement(By.xpath("//span[@class='ltr:ml-1 rtl:mr-1' and text()='Add Question']")).click();
        driver.findElement(By.cssSelector("div.select-dropdown-indicator")).click();
 
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.id("questions.0.text")).sendKeys("Test Characters");
        driver.findElement(By.xpath("//button[@type='submit' and text()='Submit']")).click();
        WebElement welcomeTextElement = driver.findElement(By.xpath("//*[contains(text(),'Event List')]"));
        if (welcomeTextElement.isDisplayed()) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

}
