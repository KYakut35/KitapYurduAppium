import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class Methods extends Hook {


    public final static Logger logger = LoggerFactory.getLogger(Methods.class);

    public void clickElement(By element) {
        androidDriver.findElement(element).click();
        logger.info("This " + element + " has been clicked.");
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void writeText(By element , String text) {
        androidDriver.findElement(element).sendKeys(text);
        logger.info("This text " + text +  " has been wrote to this " + element + " element.");
    }

    public void wait(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    public void isVisible(By element, String text) {
        boolean status = androidDriver.findElement(element).isDisplayed();

        if(status) {
            System.out.println(text + " successfully.");
        }
        else {
            System.out.println("Error");
        }
    }

    public void isDesiredTextInclude(By element ,String text) {
        String checkValue = androidDriver.findElement(element).getText();
        if (checkValue.contains(text)) {
            System.out.println(text + " included.");
        }
        else {
            System.out.println("Not included.");
        }
    }

    public String getText(By element) {
        return androidDriver.findElement(element).getText();
    }

    public List<WebElement> findAllElements(By locator) {
        return androidDriver.findElements(locator);
    }



    public void comparePrice(String value1 , String value2) {
        if (value1.equals(value2)){
            System.out.println("Prices matched.");
        }
        else {
            System.out.println("Prices did not match.");
        }
    }

    public void isDisplayed(By element) {
        if (androidDriver.findElement(element).isDisplayed()) {
            System.out.println("Element visible");
        }
        else {
            System.out.println("Element is not visible");
        }
    }



}
