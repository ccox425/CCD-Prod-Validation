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

getNextDay()


/*
WebUI.navigateToUrl('https://denvervip.ezlinks.com/Search/ReservationRequest.aspx?AspxAutoDetectCookieSupport=1')

WebUI.click(findTestObject('Object Repository/Page_Online Tee Times Made EZ/input_Select from the list bel (1)'))

WebUI.click(findTestObject('Object Repository/Page_Online Tee Times Made EZ/input_Evergreen_btnSearch_Stan (1)'))

WebUI.click(findTestObject('Object Repository/Page_City of Denver Come Play - Onl/FirstTeeTime (1)'))

WebUI.setText(findTestObject('Object Repository/Page_City of Denver Come Play - Onl/input_RadDatePicker_rdpSearchS'), '11/8/2018')

*/

public void getNextDay()
{
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		cal.add(Calendar.DAY_OF_YEAR, 1); // <--
		Date tomorrow = cal.getTime();
		System.out.println(tomorrow);
		
}