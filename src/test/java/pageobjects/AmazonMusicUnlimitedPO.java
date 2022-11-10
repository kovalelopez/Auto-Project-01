package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AmazonMusicUnlimitedPO {
    WebDriver driver;

    public AmazonMusicUnlimitedPO(WebDriver driver) {
        this.driver = driver;
    }

    public void validarUnlimited() throws InterruptedException {
        WebElement element = driver.findElement(By.cssSelector("#nav-subnav > a.nav-a.nav-hasImage > span > img"));

        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "Imagem não encontrada.");

    }
}
