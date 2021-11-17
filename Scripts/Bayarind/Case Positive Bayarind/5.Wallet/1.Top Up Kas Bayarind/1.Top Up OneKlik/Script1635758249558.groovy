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

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnWallet'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Wallet/Kas Bayarind/btnTopUp'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Top Up/topUp20rb'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Top Up/btnNext (1)') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Top Up/btnTopUpNow (1)') , 0)

CustomKeywords.'bayarind.control.inputPINBayarind'()

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Wallet/Credit Card/listPhoneNumber'), 0)

Mobile.delay(2)

CustomKeywords.'general.control.swipeDown'()

Mobile.scrollToText('0823XXXXXX45')

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Top Up/imageOTP'), 0)