package Automation;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoJuitIde {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert =           true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://akamai.markethub.shell.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDemoJava() throws Exception {
    driver.get(baseUrl + "/nextgenstorefront/financeWorkSpace/showFinanceWorkSpace?page=dashboard&site=estore.shell.us.com&lang=en_us#");
    driver.findElement(By.id("popMenuItem")).click();
    driver.wait(5000);
    driver.findElement(By.linkText("Financials")).click();
    driver.wait(5000);
    driver.findElement(By.linkText("Billing documents")).click();
    driver.wait(5000);
    driver.findElement(By.cssSelector("button.secondary.datepickerButton")).click();
    driver.wait(5000);
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | css=button.secondary.datepickerButton | 0.899993896484375,15.79998779296875]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | css=select.picker__select--month | 88.89999389648438,10.066650390625]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | css=select.picker__select--month | 88.89999389648438,10.066650390625]]
    // ERROR: Caught exception [ERROR: Unsupported command [clickAt | css=select.picker__select--month | 89,10]]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | LOCATOR_DETECTION_FAILED | 443,373]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | css=div.picker__day.picker__day--infocus | 17.16668701171875,11.76666259765625]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | css=div.picker__day.picker__day--infocus | 17.16668701171875,11.76666259765625]]
    // ERROR: Caught exception [ERROR: Unsupported command [clickAt | css=div.picker__day.picker__day--infocus | 17,12]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | LOCATOR_DETECTION_FAILED | 335,360]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | xpath=(//button[@type='button'])[9] | 13.76666259765625,9.79998779296875]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | xpath=(//button[@type='button'])[9] | 13.76666259765625,9.79998779296875]]
    driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
    driver.wait(5000);
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | xpath=(//button[@type='button'])[9] | 13.76666259765625,9.79998779296875]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | css=#toDateSearch_root > div.picker__holder > div.picker__frame > div.picker__wrap > div.picker__box > div.picker__header > select.picker__select--month | 36.76666259765625,10.066650390625]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | css=#toDateSearch_root > div.picker__holder > div.picker__frame > div.picker__wrap > div.picker__box > div.picker__header > select.picker__select--month | 36.76666259765625,10.066650390625]]
    // ERROR: Caught exception [ERROR: Unsupported command [clickAt | css=#toDateSearch_root > div.picker__holder > div.picker__frame > div.picker__wrap > div.picker__box > div.picker__header > select.picker__select--month | 37,10]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | css=#toDateSearch_root > div.picker__holder > div.picker__frame > div.picker__wrap > div.picker__box > div.picker__header > select.picker__select--month | 36.76666259765625,10.066650390625]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | css=#toDateSearch_root > div.picker__holder > div.picker__frame > div.picker__wrap > div.picker__box > div.picker__header > select.picker__select--month > option[value="3"] | 29.5999755859375,8.066650390625]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | css=#toDateSearch_root > div.picker__holder > div.picker__frame > div.picker__wrap > div.picker__box > div.picker__header > select.picker__select--month > option[value="3"] | 29.5999755859375,8.066650390625]]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | LOCATOR_DETECTION_FAILED | 628,374]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | //table[@id='toDateSearch_table']/tbody/tr[5]/td[2]/div | 10.38330078125,19.633331298828125]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | //table[@id='toDateSearch_table']/tbody/tr[5]/td[2]/div | 10.38330078125,19.633331298828125]]
    // ERROR: Caught exception [ERROR: Unsupported command [clickAt | //table[@id='toDateSearch_table']/tbody/tr[5]/td[2]/div | 10,20]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | LOCATOR_DETECTION_FAILED | 538,508]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | id=searchButtonSubmit | 27.51666259765625,17.5]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | id=searchButtonSubmit | 27.51666259765625,17.5]]
    driver.findElement(By.id("searchButtonSubmit")).click();
    driver.wait(5000);
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | id=searchButtonSubmit | 27.51666259765625,17.5]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | id=cbox1bc | 8.76666259765625,6.4666595458984375]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | id=cbox1bc | 8.76666259765625,6.4666595458984375]]
    driver.findElement(By.id("cbox1bc")).click();
    driver.wait(5000);
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | id=cbox1bc | 8.76666259765625,6.4666595458984375]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | css=tr._jsDocumentResultRow.even > td > div.inputBox.checkbox > #cbox1bc | 8.76666259765625,4.23333740234375]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | css=tr._jsDocumentResultRow.even > td > div.inputBox.checkbox > #cbox1bc | 8.76666259765625,4.23333740234375]]
    driver.findElement(By.cssSelector("tr._jsDocumentResultRow.even > td > div.inputBox.checkbox > #cbox1bc")).click();
    driver.wait(5000);
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | css=tr._jsDocumentResultRow.even > td > div.inputBox.checkbox > #cbox1bc | 8.76666259765625,4.23333740234375]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | xpath=(//input[@id='cbox1bc'])[3] | 8.76666259765625,12]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | xpath=(//input[@id='cbox1bc'])[3] | 8.76666259765625,12]]
    driver.findElement(By.xpath("(//input[@id='cbox1bc'])[3]")).click();
    driver.wait(5000);
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | xpath=(//input[@id='cbox1bc'])[3] | 8.76666259765625,12]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | xpath=(//input[@id='cbox1bc'])[4] | 6.76666259765625,12.5333251953125]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | xpath=(//input[@id='cbox1bc'])[4] | 6.76666259765625,12.5333251953125]]
    driver.findElement(By.xpath("(//input[@id='cbox1bc'])[4]")).click();
    driver.wait(5000);
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | xpath=(//input[@id='cbox1bc'])[4] | 6.76666259765625,12.5333251953125]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | id=downlaodDoc | 74.01666259765625,20.26666259765625]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | id=downlaodDoc | 74.01666259765625,20.26666259765625]]
    driver.findElement(By.id("downlaodDoc")).click();
    driver.wait(5000);
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | id=downlaodDoc | 68.10000610351562,1.20001220703125]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | id=radioDoc2 | 5.600006103515625,8.83331298828125]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | id=radioDoc2 | 5.600006103515625,8.83331298828125]]
    driver.findElement(By.id("radioDoc2")).click();
    driver.wait(5000);
    // ERROR: Caught exception [ERROR: Unsupported command [mouseDownAt | id=radioDoc2 | 4.600006103515625,33.83331298828125]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseMoveAt | css=#downloadData > button[name="terms"] | 53.600006103515625,9.366668701171875]]
    // ERROR: Caught exception [ERROR: Unsupported command [mouseUpAt | css=#downloadData > button[name="terms"] | 53.600006103515625,9.366668701171875]]
    driver.findElement(By.cssSelector("#downloadData > button[name=\"terms\"]")).click();
    driver.wait(5000);
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
