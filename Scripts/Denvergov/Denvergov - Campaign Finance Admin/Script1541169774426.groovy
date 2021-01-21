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

WebUI.navigateToUrl('https://www.denvergov.org/campaignfinanceadmin/Account/LogOn?ReturnUrl=%2fcampaignfinanceadmin%2f')

WebUI.setText(findTestObject('Page_Log On/input__UserName'), '134527')

WebUI.setEncryptedText(findTestObject('Page_Log On/input__Password'), 'L+46GMxahPnRaqrRkuozOw==')

WebUI.click(findTestObject('Page_Log On/input__btnLogin'))

WebUI.verifyTextPresent('Cox, Cameron M. - TS Sr IT Systems Analyst ', false)

