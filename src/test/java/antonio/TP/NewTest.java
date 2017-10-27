package antonio.TP;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	FirefoxDriver driver;
	WebDriverWait wait;
	
	
	
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  wait = new WebDriverWait(driver, 10);
	  driver.get("http:/f1news.ru");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
