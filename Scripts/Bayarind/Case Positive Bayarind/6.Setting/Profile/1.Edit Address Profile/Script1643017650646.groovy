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

CustomKeywords.'bayarind.menu.menuAccount'()

Mobile.tap(findTestObject('Bayarind/Android/Setting/btnProfile'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Profile Revamp/kolomGender'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Registrasi/gender' + GlobalVariable.bayarindgender), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Profile Revamp/kolomAddress'), 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Profile Revamp/addressDetail'), GlobalVariable.bayarinduseraddress, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Profile Revamp/City'), GlobalVariable.bayarindusercity, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Profile Revamp/zipCode'), GlobalVariable.bayarinduserzipcode, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Profile Revamp/Province'), GlobalVariable.bayarinduserprovince, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Profile Revamp/Country'), GlobalVariable.bayarindusercountry, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Profile Revamp/btnSave'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Setting/Profile/wordingSuccess'), 0)