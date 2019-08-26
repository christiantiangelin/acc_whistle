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

WebUI.click(findTestObject('Page_ACC - Whistle Blower/a_Daftar'))

WebUI.setText(findTestObject('Object Repository/Page_ACC - Whistle Blower/input_Nama Lengkap_fullname'), 'Christianti Angelin Maarende')

WebUI.setText(findTestObject('Page_ACC - Whistle Blower/input_Email_email'), 'christianti.angelin@ti.ukdw.ac.id')

WebUI.setText(findTestObject('Object Repository/Page_ACC - Whistle Blower/input_No handphone_no_handphone'), '085242869607')

not_run: WebUI.verifyElementHasAttribute(findTestObject('Page_ACC - Whistle Blower/input_No handphone_no_handphone'), '', 
    0)

WebUI.setEncryptedText(findTestObject('Page_ACC - Whistle Blower/input_Password_password'), 'DRvB4iE/1J1sjfk+zd9YEA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ACC - Whistle Blower/input_Password Konfirmasi_password_confirmation'), 
    'DRvB4iE/1J1sjfk+zd9YEA==')

not_run: WebUI.verifyMatch('DRvB4iE/1J1sjfk+zd9YEA==', 'DRvB4iE/1J1sjfk+zd9YEA==', false)

WebUI.getText(findTestObject('Page_ACC - Whistle Blower/input_Nama Lengkap_fullname'))

if (true) {
    WebUI.verifyNotMatch('Christianti Angelin Maarende', '', false)
} else if (true) {
    WebUI.verifyNotMatch('', '', false)
}

WebUI.click(findTestObject('Object Repository/Page_ACC - Whistle Blower/button_Register'))

WebUI.closeBrowser()

