package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePO {
    WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }

    public void openMenuTodos() {
        WebElement element = driver.findElement(By.cssSelector("#nav-hamburger-menu > span"));
        element.click();
    }

    public void clickAmazonMusic() {
        WebElement element = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(8) > a > div"));
        element.click();
    }

    public void clickAmazonMusicUnlimited() {
      WebElement element = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(4) > a"));
      element.click();
    }
    //Estes dois métodos a baixo, fazem parte do CT02.
    public void clickPrimeVideo(){
        WebElement element = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible > li:nth-child(9) > a > div"));
        element.click();

    }
    public void clickTodosOsTitulos() {
        WebElement element = driver.findElement(By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(3) > a"));
        element.click();
    }


}