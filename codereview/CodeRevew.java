import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndAddToBasketTest {

  public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "c://user//chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    // Navigate to website
    driver.get("http://www.onlineshop77.com");

    // Wait for page to load
    Thread.sleep(5000);

    // Click login button
    WebElement loginButton = driver.findElement(By.xpath("//button[@id="main-panel"][2]"));
    loginButton.click();

    // Wait for login modal to load
    Thread.sleep(5000);

    // Enter login credentials
    WebElement usernameField = driver.findElement(By.cssSelector("#__next > div.overflow.relative > div.md\:fixed.md\:inset-y-0.md\:flex.md\:w-\[260px\].md\:flex-col > a:nth-child(7)"));
    WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
    WebElement loginSubmitButton = driver.findElement(By.id("sign-in-button-id"));

    usernameField.sendKeys("automationuser");
    passwordField.sendKeys("qwerty123");
    loginSubmitButton.click();

    // Wait for main page modal to load
    Thread.sleep(5000);

    // Verify that the user is logged in
    WebElement welcomeMessage = driver.findElement(By.xpath("//div[contains(text(),'Welcome back,')]"));
    if (welcomeMessage.isDisplayed()) {
      System.out.println("Login successful!");
    } else {
      System.out.println("Login failed.");
    }

    WebElement item = driver.findElement(By.xpath("//div[contains(@class, 'product')]//h2[contains(text(),'Product A')]"));
    item.click();

    WebElement addToBasketButton = driver.findElement(By.xpath("//button[contains(text(),'Add to basket')]"));
    addToBasketButton.click();


    Thread.sleep(5000);

    WebElement basketItem = driver.findElement(By.xpath("//div[contains(@class, 'basket-item')]//h3[contains(text(),'Product A')]"));
    if (basketItem.isDisplayed()) {
      System.out.println("Item added to basket!");
    } else {
      System.out.println("Adding item to basket failed.");
    }

    // Close the browser
    driver.quit();
  }
}
