package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.AmazonMusicUnlimitedPO;
import pageobjects.HomePO;
import pageobjects.PrimeVideoPO;

public class Runner {

    WebDriver driver;

    @BeforeMethod
    public void setupDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Carol\\Desktop\\Ale\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.br/");


    }

    @AfterMethod
    public void endDriver() {
        driver.quit();
    }


    @Test(testName = "Validando a home Amazon Music Unlimited")
    public void validateAmazonMusicUnlimited() throws InterruptedException {
        HomePO homePO = new HomePO(driver);
        homePO.openMenuTodos();
        Thread.sleep(5000);
        homePO.clickAmazonMusic();
        Thread.sleep(3000);
        homePO.clickAmazonMusicUnlimited();
        Thread.sleep(5000);
        AmazonMusicUnlimitedPO amazonMusicUnlimitedPO = new AmazonMusicUnlimitedPO(driver);
        Thread.sleep(10000);
        amazonMusicUnlimitedPO.validarUnlimited();


    }


    @Test(testName = "Validar home do Prime Video")
    public void validarPrimeVideo() throws InterruptedException {
        HomePO homePO = new HomePO(driver);
        homePO.openMenuTodos();
        Thread.sleep(5000);
        homePO.clickPrimeVideo();
        Thread.sleep(3000);
        homePO.clickTodosOsTitulos();
        Thread.sleep(3000);
        PrimeVideoPO primeVideoPO = new PrimeVideoPO(driver);
        Thread.sleep(5000);
        primeVideoPO.validarPrimeVideo();
    }
}


