import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void dynamicControls() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        boolean isDisplayed = checkbox.isDisplayed();
        assertTrue(isDisplayed, "Checkbox is not found");
        driver.findElement(By.cssSelector("[onclick='swapCheckbox()']")).click();
        WebElement messageCheckbox = driver.findElement(By.id("message"));
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(messageCheckbox));
        assertEquals(messageCheckbox.getText(), "It's gone!", "Message is not correct");
        try {
            isDisplayed = checkbox.isDisplayed();
        } catch (StaleElementReferenceException exception) {
            isDisplayed = false;
        }
        assertFalse(isDisplayed, "Checkbox is displayed");
        WebElement input = driver.findElement(By.id("input-example"));
        boolean isDisabled;
        try {
            input.getAttribute("disabled");
            isDisabled = true;
        } catch (StaleElementReferenceException exception) {
            isDisabled = false;
        }
        assertTrue(isDisabled, "Input is not disabled");
        driver.findElement(By.cssSelector("[type='button']")).click();
        WebElement message = driver.findElement(By.xpath("//*[@id='input-example']/p"));
        wait.until(ExpectedConditions.visibilityOfAllElements(message));
        assertEquals(message.getText(), "It's enabled!", "Invalid message");
    }
}
