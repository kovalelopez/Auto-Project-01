package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PrimeVideoPO {
    WebDriver driver;

    public PrimeVideoPO(WebDriver driver) {
        this.driver = driver;
    }

    public void validarPrimeVideo() throws InterruptedException {
        WebElement element = driver.findElement(By.cssSelector("#pv-nav-logo > div"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "Imagem não encontrada.");
    }
}
