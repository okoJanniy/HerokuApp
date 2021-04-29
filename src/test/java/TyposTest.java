import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {

    @Test
    public void CheckParagraphSpelling() {
        driver.get("http://the-internet.herokuapp.com/typos");
        List<WebElement> typos = driver.findElements(By.tagName("p"));
        String text1 = typos.get(1).getText();
        assertEquals(text1, "Sometimes you'll see a typo, other times you won't.",
                "Texts do not match");

    }
}
