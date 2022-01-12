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

CustomKeywords.'bayarind.menu.menuSetting'()

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/btnListAddress'), 0)

if(Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Address/btnSetDefaultAddress'), 3, FailureHandling.CONTINUE_ON_FAILURE) == false) {
	Mobile.pressBack()
	Mobile.callTestCase(findTestCase('Test Cases/Bayarind/Case Positive Bayarind/6.Setting/6.Address/6.1.Add Address'), null)
}

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Address/btnSetDefaultAddress') ,0)

Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Address/wordingConfirmAddress'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Address/btnYesDefaultAddress') ,0)