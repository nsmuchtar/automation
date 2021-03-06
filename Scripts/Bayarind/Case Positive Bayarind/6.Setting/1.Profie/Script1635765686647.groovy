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

long first6 = (long) (Math.random() * 100000);

String randomNumber = String.valueOf(first6)

String email = 'TESTQA' + randomNumber + '@gmail.com'

CustomKeywords.'bayarind.menu.menuAccount'()

Mobile.tap(findTestObject('Bayarind/Android/Setting/btnProfile'), 0)

Mobile.delay(3)

CustomKeywords.'general.control.swipeDown'()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Profile/kolomEmail'), email, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Profile/kolomAddress'), GlobalVariable.bayarinduseraddress, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Profile/kolomCountry'), GlobalVariable.bayarindusercountry, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Profile/kolomProvince'), GlobalVariable.bayarinduserprovince, 0)

CustomKeywords.'general.control.swipeDown'()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Profile/kolomCity'), GlobalVariable.bayarindusercity, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Profile/kolomZipCode'), GlobalVariable.bayarinduserzipcode, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/Profile/btnSave') ,0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Setting/Profile/wordingSuccess'), 0)

Mobile.pressBack()

Mobile.delay(1)

Mobile.pressBack()
