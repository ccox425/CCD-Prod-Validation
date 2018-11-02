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

WebUI.navigateToUrl('https://www.denvergov.org/denverapps/csa-hearings-files/R-20170405-003/index_server.html')

WebUI.waitForElementPresent(findTestObject('Page_Angular 2 QuickStart/input_Username_Username'), 5)

WebUI.setText(findTestObject('Object Repository/Page_Angular 2 QuickStart/input_Username_Username'), 'Test')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Angular 2 QuickStart/input_Password_Password'), 'rD2bE49Jl/U=')

WebUI.click(findTestObject('Object Repository/Page_Angular 2 QuickStart/button_Submit'))

