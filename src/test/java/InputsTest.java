import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void valueInput() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement inputs = driver.findElement(By.cssSelector("[type=number]"));
        inputs.sendKeys("5");
        inputs.sendKeys(Keys.UP);
        assertEquals(inputs.getAttribute("value"), "6", "Don't work");
        inputs.sendKeys(Keys.DOWN);
        assertEquals(inputs.getAttribute("value"), "5", "Dont work");
    }
}

