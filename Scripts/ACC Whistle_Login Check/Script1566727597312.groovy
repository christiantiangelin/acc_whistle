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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8000/')

WebUI.click(findTestObject('Page_ACC - Whistle Blower/a_Login'))

WebUI.setText(findTestObject('Page_ACC - Whistle Blower/input_Email_email'), email)

WebUI.setText(findTestObject('Object Repository/Page_ACC - Whistle Blower/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/Page_ACC - Whistle Blower/button_Login'))

if (WebUI.verifyElementPresent(findTestObject('Page_ACC - Whistle Blower/a_Login'), 2)) {
    if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/span_Email anda tidak terdaftar'), 2, FailureHandling.STOP_ON_FAILURE)) {
    } else if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/span_Password anda salah'), 2, FailureHandling.STOP_ON_FAILURE)) {
    } else if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/span_The email must be a valid email address'), 
        2, FailureHandling.STOP_ON_FAILURE)) {
    } else {
        'if email not match with "" then password kosong\r\nelse if password not match with "" then email kosong'
        if (WebUI.waitForElementAttributeValue(findTestObject('Page_ACC - Whistle Blower/input_Email_email'), 'value', '', 2)) {
        } else if (WebUI.waitForElementAttributeValue(findTestObject('Page_ACC - Whistle Blower/input_Password_password'), 'value', 
            '', 2)) {
        }
    }
}

WebUI.closeBrowser()

