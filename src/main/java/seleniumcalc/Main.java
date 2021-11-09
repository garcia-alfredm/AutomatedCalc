package seleniumcalc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://localhost:7000");

        //retreive web element by id
        WebElement inputElem1 = driver.findElement(By.id("add1-input"));
        WebElement inputElem2 = driver.findElement(By.id("add2-input"));

        //send keystroke to input element
        inputElem1.sendKeys("4");
        Thread.sleep(3000);
        inputElem2.sendKeys("5");
        Thread.sleep(3000);
        //add both numbers
        WebElement btn = driver.findElement(By.id("add-btn"));
        btn.click();
        Thread.sleep(3000);

        //driver.switchTo().frame("add-result");

        //try subtraction
        inputElem1 = driver.findElement(By.id("sub1-input"));
        inputElem2 = driver.findElement(By.id("sub2-input"));
        //send keystroke to input element
        inputElem1.sendKeys("6");
        Thread.sleep(3000);
        inputElem2.sendKeys("3");
        Thread.sleep(3000);

        btn = driver.findElement(By.id("sub-btn"));
        btn.click();
        Thread.sleep(3000);

        //try multiplication
        inputElem1 = driver.findElement(By.id("mult1-input"));
        inputElem2 = driver.findElement(By.id("mult2-input"));
        //send keystroke to input element
        inputElem1.sendKeys("8");
        Thread.sleep(3000);
        inputElem2.sendKeys("7");
        Thread.sleep(3000);

        btn = driver.findElement(By.id("mult-btn"));
        btn.click();
        Thread.sleep(3000);

        //try division
        inputElem1 = driver.findElement(By.id("div1-input"));
        inputElem2 = driver.findElement(By.id("div2-input"));
        //send keystroke to input element
        inputElem1.sendKeys("32");
        Thread.sleep(3000);
        inputElem2.sendKeys("8");
        Thread.sleep(3000);

        btn = driver.findElement(By.id("div-btn"));
        btn.click();
        Thread.sleep(3000);

        driver.quit();
    }
}
