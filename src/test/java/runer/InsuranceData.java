package runer;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InsuranceData {

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
    public void iAccessWebdriverUniversityContactUsPage() throws InterruptedException {

        driver.get("https://cscvfun.santalucia.es/vida/insurance-data");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        //Quitamos el modal de aviso al entrar a la web:
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='fechanacimiento']")).sendKeys("01/01/1992");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//h2[@class=\"page-title__main page-title__main--sl\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@class=\"sl-button__normalize\"]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@class=\"ui-inputtext ui-corner-all ui-state-default ui-widget ng-untouched ng-pristine ng-invalid\"]")).sendKeys("Oscar");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@class=\"ui-inputtext ui-corner-all ui-state-default ui-widget ng-untouched ng-pristine ng-invalid\"]")).sendKeys("661661661");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@class=\"ui-inputtext ui-corner-all ui-state-default ui-widget ng-untouched ng-pristine ng-invalid\"]")).sendKeys("prueba@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[contains(text(), 'Continuar')]")).click();
        Thread.sleep(6000);

    }
}
