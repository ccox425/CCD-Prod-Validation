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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://safetyweb/VictimAssistanceUnit/')

WebUI.click(findTestObject('Object Repository/Page_Victim Assistance Case Manager/a_Cases'))

WebUI.click(findTestObject('Object Repository/Page_Victim Assistance Case Manager/a_Reports (1)'))

WebUI.click(findTestObject('Object Repository/Page_Victim Assistance Case Manager/a_Audit Logs (1)'))

WebUI.click(findTestObject('Object Repository/Page_Victim Assistance Case Manager/a_Cases'))

WebUI.setText(findTestObject('Object Repository/Page_Victim Assistance Case Manager/input_Manage Reference Tables_ (1)'), 
    'smith')

WebUI.click(findTestObject('Object Repository/Page_Victim Assistance Case Manager/button_Search (1)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Victim Assistance Case Manager/a_V2018-159769'), 2)

WebUI.click(findTestObject('Object Repository/Page_Victim Assistance Case Manager/a_V2018-159769'))

WebUI.click(findTestObject('Object Repository/Page_Victim Assistance Case Manager/button_View RMS Notes'))

WebUI.click(findTestObject('Object Repository/Page_Victim Assistance Case Manager/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Victim Assistance Case Manager/body_Victim Assistance Case Ma'))

