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

WebUI.navigateToUrl('https://www.denvergov.org/property')

WebUI.setText(findTestObject('Page_Denver Property Taxation and A/input_Note_search'), '201 w colfax ave')

WebUI.click(findTestObject('Object Repository/Page_Denver Property Taxation and A/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Denver Property Taxation and A/a_201 W COLFAX AVE'))

WebUI.verifyElementPresent(findTestObject('Page_201 W COLFAX AVE  160965341/h1_201 W COLFAX AVE'), 2)

