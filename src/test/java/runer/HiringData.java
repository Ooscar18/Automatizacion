package runer;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HiringData {

    private WebDriver driver;

    @Before
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ogonzama\\OneDrive - NTT DATA EMEAL\\Documents\\Testing\\Pruebas\\selenium-export\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){

    }

    @Test
    public void hiringForm() throws InterruptedException {
        driver.get("https://cscvfun.santalucia.es/vida/hiring-data");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        //Quitamos el modal de aviso al entrar a la web:
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id=\"dni\"]")).sendKeys("48804898W");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Gonzalez");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id=\"secondLastName\"]")).sendKeys("Gonzalez");
        Thread.sleep(2000);
    }
}
