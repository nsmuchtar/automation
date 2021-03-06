import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('sprintasia.tech.pasarind', FailureHandling.STOP_ON_FAILURE)

//if (Mobile.verifyElementExist(findTestObject('Object Repository/Pasarind/Smallscreen/Login Page/forgotPIN'), 3, FailureHandling.OPTIONAL) == true) {
//
//} else {
//	CustomKeywords.'pasarind_smallscreen.control.logoutPasarind'()
//	
//	CustomKeywords.'pasarind_smallscreen.control.popUpLogout'()
//}

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Login Page/btnForgotPIN'), 0)
Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Forgot PIN/inputEmailHP'), GlobalVariable.logintelephone, 0)
Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Forgot PIN/btnSend (1)'), 0)
if (Mobile.verifyElementExist(findTestObject('Object Repository/Pasarind/Smallscreen/Forgot PIN/iconMultipleMerchant'), 0) == true) {
	Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Forgot PIN/merchant1 (1)'),0)
}else {	
	
}
/*Mobile.setText('Object Repository/Pasarind/Smallscreen/Forgot PIN/kolomInputOTP', '000000', 0)*/

Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind/Smallscreen/Forgot PIN/inputPINBaru'), 60)
Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Forgot PIN/inputPIN'), GlobalVariable.PINLogin, 0)
Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Forgot PIN/confirmPIN'), GlobalVariable.PINLogin, 0)
Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Forgot PIN/btnSubmit'), 0)
Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind/Smallscreen/Forgot PIN/wordingSuksesGantiPIN'), 0)
Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnDone'), 0)