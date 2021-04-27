import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    @Test
    public void TakeAllTheElementsAndCheckForTheirPresence() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropDown);
        select.selectByVisibleText("Option 1");
        select.selectByValue("1");
        select.selectByVisibleText("Option 2");
        select.selectByValue("2");

    }
}
