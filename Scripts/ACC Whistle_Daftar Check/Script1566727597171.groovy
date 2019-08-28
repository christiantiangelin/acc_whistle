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

WebUI.click(findTestObject('Page_ACC - Whistle Blower/a_Daftar'))

WebUI.setText(findTestObject('Object Repository/Page_ACC - Whistle Blower/input_Nama Lengkap_fullname'), nama_lengkap)

WebUI.setText(findTestObject('Page_ACC - Whistle Blower/input_Email_email'), email)

WebUI.setText(findTestObject('Object Repository/Page_ACC - Whistle Blower/input_No handphone_no_handphone'), no_hp)

WebUI.setText(findTestObject('Page_ACC - Whistle Blower/input_Password_password'), password)

WebUI.setText(findTestObject('Object Repository/Page_ACC - Whistle Blower/input_Password Konfirmasi_password_confirmation'), 
    password_konfirmasi)

WebUI.click(findTestObject('Object Repository/Page_ACC - Whistle Blower/button_Register'))

if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/h3_Daftar akun baru ACC Whistle sekarang'), 2, 
    FailureHandling.STOP_ON_FAILURE)) {
    'if (check fullname > 6 karakter), else if (check fullname sesuai format)'
    if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/strong_The fullname must be at least 6 characters'), 
        2, FailureHandling.STOP_ON_FAILURE)) {
    } else if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/strong_The fullname format is invalid'), 
        2, FailureHandling.STOP_ON_FAILURE)) {
    }
    
    WebUI.delay(1)

    'if (check email sudah terdaftar sebelumnya), else if (check email sesuai format)'
    if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/strong_The email must be a valid email address'), 
        2, FailureHandling.STOP_ON_FAILURE)) {
    } else if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/strong_The email has already been taken'), 
        2, FailureHandling.STOP_ON_FAILURE)) {
    }
    
    WebUI.delay(1)

    'check no_hp sesuai format'
    if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/strong_The no handphone format is invalid'), 
        2, FailureHandling.STOP_ON_FAILURE)) {
    }
    
    WebUI.delay(1)

    'if (check password > 6 karakter), else if (check password konfirmasi)'
    if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/strong_The password must be at least 6 characters'), 
        2, FailureHandling.STOP_ON_FAILURE)) {
    } else if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/strong_The password confirmation does not match'), 
        2, FailureHandling.STOP_ON_FAILURE)) {
    }
    
    WebUI.delay(1)

    'check input kosong'
    if (WebUI.waitForElementAttributeValue(findTestObject('Page_ACC - Whistle Blower/input_Nama Lengkap_fullname'), 'value', 
        '', 2)) {
    } else if (WebUI.waitForElementAttributeValue(findTestObject('Page_ACC - Whistle Blower/input_Email_email'), 'value', 
        '', 2)) {
    } else if (WebUI.waitForElementAttributeValue(findTestObject('Page_ACC - Whistle Blower/input_No handphone_no_handphone'), 
        'value', '', 2)) {
    } else if (WebUI.waitForElementAttributeValue(findTestObject('Page_ACC - Whistle Blower/input_Password_password'), 'value', 
        '', 2)) {
    } else if (WebUI.waitForElementAttributeValue(findTestObject('Page_ACC - Whistle Blower/input_Password Konfirmasi_password_confirmation'), 
        'value', '', 2)) {
    }
} else if (WebUI.waitForElementPresent(findTestObject('Page_ACC - Whistle Blower/h4_Silakan masuk ke dalam akun kamu'), 
    2, FailureHandling.STOP_ON_FAILURE)) {
}

WebUI.closeBrowser()

