import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
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
import java.util.Random

long first8 = (long) (Math.random() * 10000000);

long generate = 00000000 + first8;

String nohp = String.valueOf(generate)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Login Page/btnRegister'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Registrasi/kolomPhoneNumber'), '823' + nohp, 
    0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Registrasi/kolomFullName'), GlobalVariable.bayarinduserfullname, 
    0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Registrasi/dropDownGender'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Registrasi/gender' + GlobalVariable.bayarindgender), 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Registrasi/kolomEmail'), GlobalVariable.bayarindemail, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Registrasi/kolomPassword'), GlobalVariable.bayarindpassword, 
    0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Registrasi/kolomConfirmPassword'), GlobalVariable.bayarindconfirmpassword, 
    0)

Mobile.checkElement(findTestObject('Object Repository/Bayarind/Android/Registrasi/checkBoxTnC'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Registrasi/btnNext'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/OTP/halamanOTP'), 0)

CustomKeywords.'bayarind.control.inputOTP'()

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/PIN/halamanPIN'), 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PIN/kolomInputPIN'), GlobalVariable.bayarindpin, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PIN/kolomConfirmPIN'), GlobalVariable.bayarindconfirmpin, 
    0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PIN/btnNext'), 0)

Mobile.waitForElementPresent(findTestObject('Bayarind/Android/PIN/halamanSuccessRegistrasi'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PIN/btnStartApplicaton'), 0)

CustomKeywords.'bayarind.control.closeBanner'()

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnAccount'), 0)

Mobile.scrollToText('Logout')

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/btnLogout'), 0)

Mobile.tap(findTestObject('Bayarind/Android/Setting/btnConfirmLogout'), 0)

Mobile.waitForElementPresent(findTestObject('Bayarind/Android/Login Page/btnRegister'), 0)

