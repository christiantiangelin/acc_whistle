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

WebUI.navigateToUrl('http://localhost:8000/')

WebUI.click(findTestObject('Page_ACC - Whistle Blower/a_Login'))

WebUI.setText(findTestObject('Page_ACC - Whistle Blower/input_Email_email'), 'christianti.angelin@ti.ukdw.ac.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ACC - Whistle Blower/input_Password_password'), 'DRvB4iE/1J1sjfk+zd9YEA==')

WebUI.click(findTestObject('Object Repository/Page_ACC - Whistle Blower/button_Login'))
