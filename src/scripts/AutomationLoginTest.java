package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ConfigReader;

public class AutomationLoginTest {

    @Test
    public void loginTest() {
        // Load config
        ConfigReader config = new ConfigReader();

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.get(config.get("url"));

        // Login steps
        driver.findElement(By.id("username")).sendKeys(config.get("username"));
        driver.findElement(By.id("password")).sendKeys(config.get("password"));
        driver.findElement(By.id("loginBtn")).click();

        // Verify login
        Assert.assertTrue(driver.getTitle().contains("Dashboard"), "Login failed!");

        driver.quit();
    }
}
