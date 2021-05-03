import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxesTest extends BaseTest {

    @Test
    public void checkAndPushCheckBoxes() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("[type=checkbox]"));
        assertFalse(checkBoxes.get(0).isSelected(), "Checkbox is selected");
        checkBoxes.get(0).click();
        assertTrue(checkBoxes.get(0).isSelected(), "Checkbox not selected");
        assertTrue(checkBoxes.get(1).isSelected(), "Checkbox not selected");
        checkBoxes.get(1).click();
        assertFalse(checkBoxes.get(1).isSelected(), "Checkbox is selected");

    }
}
