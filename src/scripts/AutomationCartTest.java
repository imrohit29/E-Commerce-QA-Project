package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class AutomationCartTest {

    @Test
    public void addToCartTest() {
        // Load config
        ConfigReader config = new ConfigReader();

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.get(config.get("url"));

        // Add product to cart
        driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();

        // Verify item added
        String cartText = driver.findElement(By.id("cartCount")).getText();
        Assert.assertEquals(cartText, "1", "Cart count should be 1");

        driver.quit();
    }
}
