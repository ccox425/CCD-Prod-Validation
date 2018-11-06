import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.ElementNotVisibleException
import org.openqa.selenium.InvalidElementStateException

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

WebUI.navigateToUrl('https://accelawebprod1.gov.dnvr/security/hostSignon.do')

WebUI.setText(findTestObject('Object Repository/Page_Accela Automation - Secure Log/input_Agency_servProvCode'), 'Denver')

try{
	
WebUI.click(findTestObject('Object Repository/Page_Accela Automation - Secure Log/input_User Name_username', true))

WebUI.setText(findTestObject('Object Repository/Page_Accela Automation - Secure Log/input_User Name_username'), '134527')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Accela Automation - Secure Log/input_Password_password'), 
    '1/CUeUXHf5qK7pSmcX5wSQ==')

WebUI.click(findTestObject('Object Repository/Page_Accela Automation - Secure Log/input_Language_submit_'))
}

catch(InvalidElementStateException ex)
{}
WebUI.click(findTestObject('Object Repository/Page_Accela Automation/div_DENVER'))

WebUI.click(findTestObject('Object Repository/Page_Accela Automation/nobr_Sign Out'))

