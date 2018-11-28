import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver


String tomorrow = getNextDay()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://denvervip.ezlinks.com/Search/ReservationRequest.aspx?AspxAutoDetectCookieSupport=1')

WebUI.click(findTestObject('Object Repository/Page_Online Tee Times Made EZ/input_Select from the list bel (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Online Tee Times Made EZ/a_Open the calendar popup.'))

WebUI.delay(1)

//WebUI.setText(findTestObject('Page_City of Denver Come Play - Sea/input_RadDatePicker_rdpDateToS'), tomorrow)

WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.id("rdpDateToSearch_dateInput")).clear();

driver.findElement(By.id("rdpDateToSearch_dateInput")).sendKeys(tomorrow);

//WebUI.executeJavaScript(tomorrow, null)





WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Online Tee Times Made EZ/input_Evergreen_btnSearch_Stan (1) (1)'))

WebUI.click(findTestObject('Page_City of Denver Come Play - Onl/FirstTeeTime (1)'))

String getNextDay() {
    String tomorrow

    LocalDate date = LocalDate.now().plusDays(1)

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern('MM/dd/YYYY')

    tomorrow = formatter.format(date)

    return tomorrow
}

