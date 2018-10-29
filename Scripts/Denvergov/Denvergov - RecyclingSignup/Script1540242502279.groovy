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

WebUI.navigateToUrl('https://www.denvergov.org/recyclingsignup')

WebUI.setText(findTestObject('Page_Home Page/input_Number_form-control ng-u'), '201')

WebUI.selectOptionByValue(findTestObject('Page_Home Page/select_Select Direction.......'), '4', true)

WebUI.waitForElementClickable(findTestObject('Page_Home Page/select_Select Direction.......'), 2)

WebUI.selectOptionByValue(findTestObject('Page_Home Page/select_Select Street Name.....'), '209', true)

WebUI.selectOptionByValue(findTestObject('Page_Home Page/select_Select Qualifier.......'), '3', true)

WebUI.click(findTestObject('Page_Home Page/button_Search'))

WebUI.click(findTestObject('Page_Home Page/td_201 W COLFAX AV'))

