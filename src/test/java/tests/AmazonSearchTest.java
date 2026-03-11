package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class AmazonSearchTest {

    @Test
    public void amazonAramaTesti() {

        Driver.getDriver().get("https://www.amazon.com");
        System.out.println("Amazon ana sayfa acildi.");


        WebElement aramaKutusu = Driver.getDriver().findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        System.out.println("Arama yapildi: Nutella");

        WebElement hedefElement = Driver.getDriver().findElement(By.xpath("//*[@id=\"p_123/246889\"]/span/a/span"));
        Assert.assertTrue(hedefElement.isDisplayed(), "HATA: Aranan spesifik filtre/element sayfada gorunmuyor!");

        System.out.println("Test Basarili: Sonuc yazisinda Nutella goruldu.");
        Driver.closeDriver();
    }
}