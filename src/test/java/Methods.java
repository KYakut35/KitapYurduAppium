
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


public class Methods extends Hook {


    public final static Logger logger = LoggerFactory.getLogger(Methods.class);

    public void clickElement(By element) { // Click Element Function with using By parameters
        androidDriver.findElement(element).click();
        logger.info("This " + element + " has been clicked.");
    }

    public void clickElement(WebElement element) { // Click Element Function with using WebElement parameters
        element.click();
    }

    public void writeText(By element , String text) { // sendKeys methods
        androidDriver.findElement(element).sendKeys(text);
        logger.info("This text " + text +  " has been wrote to this " + element + " element.");
    }

    public void wait(int seconds) throws InterruptedException { // Wait function
        Thread.sleep(seconds * 1000);
    }

    public void isVisible(By element, String text) { // Checks Element is visible or not
        boolean status = androidDriver.findElement(element).isDisplayed();

        if(status) {
            System.out.println(text + " successfully.");
        }
        else {
            System.out.println("Error");
        }
    }

    public void isDesiredTextInclude(By element ,String text) { // Checks Text is included or not
        String checkValue = androidDriver.findElement(element).getText();
        if (checkValue.contains(text)) {
            System.out.println(text + " included.");
        }
        else {
            System.out.println(text+ " Not included.");
            System.out.println("Actual : " + checkValue);
        }
    }

    public String getText(By element) { // returns element's text method
        return androidDriver.findElement(element).getText();
    }

    public List<WebElement> findAllElements(By locator) { // Gets all elements to List with same locator
        return androidDriver.findElements(locator);
    }



    public void comparePrice(String value1 , String value2) { // Compare two Strings
        if (value1.equals(value2)){
            System.out.println("Prices matched.");
        }
        else {
            System.out.println("Prices did not match.");
        }
    }

    public void isDisplayed(By element,String text) { // Check element is displayed in screen or not
        if (androidDriver.findElement(element).isDisplayed()) {
            System.out.println(text + " visible");
        }
        else {
            System.out.println(text + " is not visible");
        }
    }



}
