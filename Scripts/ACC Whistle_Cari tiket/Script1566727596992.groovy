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

WebUI.callTestCase(findTestCase('ACC Whistle_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_ACC - Whistle Blower/a_Lacak Tiket'))

WebUI.setText(findTestObject('Object Repository/Page_ACC - Whistle Blower/input_Hi Christianti Angelin Maarende_search'), 
    no_tiket)

WebUI.sendKeys(findTestObject('Object Repository/Page_ACC - Whistle Blower/input_Hi Christianti Angelin Maarende_search'), 
    Keys.chord(Keys.ENTER))

WebUI.verifyTextPresent(no_tiket, false)

WebUI.verifyElementPresent(findTestObject('Page_ACC - Whistle Blower/div_no tiket', [('text') : no_tiket]), 2)

WebUI.closeBrowser()

