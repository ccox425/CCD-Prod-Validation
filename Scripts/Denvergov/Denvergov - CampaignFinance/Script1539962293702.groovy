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

WebUI.navigateToUrl('https://www.denvergov.org/campaignfinancereport/Account?ReturnUrl=%2fcampaignfinancereport')

WebUI.setText(findTestObject('Page_Login/input_Login_Email'), 'loadtest@denvergov.org')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Login_Password'), 'F8W5mqEKaib5WXBnzGhZNQ==')

WebUI.click(findTestObject('Page_Login/input_Login_btn btn-info'))

WebUI.verifyElementPresent(findTestObject('Page_Home Page/div_Current User loadtestdenve'), 5)

