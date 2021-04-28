import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {

    @Test
    public void checkAndPushCheckBoxes() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement checkBox1 = driver.findElement(By.cssSelector("[type=checkbox]"));
        if (checkBox1.isSelected()) {
            System.out.println("Флажок установлен");
        } else {
            System.out.println("Флажок отключен");
            checkBox1.click();
        }
        if (checkBox1.isSelected()) {
            System.out.println("Флажок установлен");
        }
        WebElement checkBox2 = driver.findElement(By.cssSelector("[type=checkbox]"));
        if (checkBox2.isSelected()) {
            System.out.println("Флажок установлен");
        }else{
            System.out.println("Флажок отключен");
            checkBox2.click();
        }
        if (checkBox2.isSelected()){
            System.out.println("Флажок отключен");
        }
    }
}
