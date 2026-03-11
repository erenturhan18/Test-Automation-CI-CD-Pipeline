package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import java.time.Duration;

public class AmazonSearchTest {

    @Test
    public void amazonAramaTesti() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

        Driver.getDriver().get("https://www.amazon.com");

        WebElement aramaKutusu = wait.until(ExpectedConditions.elementToBeClickable(By.name("field-keywords")));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        wait.until(ExpectedConditions.urlContains("Nutella"));

        WebElement sonucElementi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"p_123/246889\"]/span/a/span")));

        Assert.assertTrue(sonucElementi.isDisplayed());
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("Nutella"));

        Driver.closeDriver();
    }
}