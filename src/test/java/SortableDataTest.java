import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class SortableDataTest extends BaseTest {

    @Test
    public void checkingTables() {
        driver.get("http://the-internet.herokuapp.com/tables");
        List<WebElement> table1 = driver.findElements(By.id("table1"));
        List<WebElement> table2 = driver.findElements(By.id("table2"));
        assertTrue(matchLists(table1, table2), "Tables are not the same");
    }

    public boolean matchLists(List<WebElement> table1, List<WebElement> table2) {
        boolean isEquals = true;//сравниваем строку с указаным объектом(если аргумент не равен null)
        for (int i = 0; i < table1.size(); i++) {
            if (!table1.get(i).getText().equals(table2.get(i).getText())) {
                isEquals = false;
                break;
            }
        }
        return isEquals;
    }


}

