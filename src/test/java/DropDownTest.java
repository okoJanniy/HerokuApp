import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownTest extends BaseTest {

    @Test
    public void TakeAllTheElementsAndCheckForTheirPresence() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Option 2");
        String selectedText = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedText, "Option 2");
        List<WebElement> options = select.getOptions();
        for (WebElement element : options) {
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
