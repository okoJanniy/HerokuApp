import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void uploadFile() {
        driver.get("http://the-internet.herokuapp.com/upload");
        File file = new File("src/test/resources/UploadFile");
        driver.findElement(By.id("file-upload")).sendKeys(file.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
        assertEquals(file,"src/test/resources/UploadFile", "File not found");
    }
}
