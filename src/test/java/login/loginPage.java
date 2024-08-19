package login;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.Test;

	
public class loginPage{
	
//	    @Test
	
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Maximize the browser window
	        driver.manage().window().maximize();

	        // Navigate to the target URL
	        driver.get("https://signadart.ai/");

	        // Set up an explicit wait with a Duration instead of an int
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Click on the "Login" button
	        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(@class, 'block text-inherit w-full h-full rounded-[50px] text-lg font-bold') and text()='Login']")));
	        loginButton.click();

	        // Enter the email
	        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='userName' and @placeholder='Email']")));
	        emailInput.sendKeys("Testingteam@signatech.com");

	        // Enter the password
	        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password' and @placeholder='Password']")));
	        passwordInput.sendKeys("test@123");

	        // Click the "Sign In" button
	        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Sign In']")));
	        signInButton.click();

	        // Check if the "Welcome onboard" text is present
	        WebElement welcomeTextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Welcome onboard')]")));
	        if (welcomeTextElement.isDisplayed()) {
	            System.out.println("Pass");
	        } else {
	            System.out.println("Fail");
	        }

	        // Optionally close the browser
	        driver.quit();
	    }
	}

	    }
	}

	


