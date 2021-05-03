import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropDownTest extends BaseTest {

    @Test
    public void takeAllTheElementsAndCheckForTheirPresence() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Option 1");
        String selectedText = select.getFirstSelectedOption().getText();
        assertEquals(selectedText, "Option 1", "Option 1 not selected");
        select.selectByVisibleText("Option 2");
        String selectedText2 = select.getFirstSelectedOption().getText();
        assertEquals(selectedText2, "Option 2", "Option 2 not selected");
        driver.quit();
    }
}
