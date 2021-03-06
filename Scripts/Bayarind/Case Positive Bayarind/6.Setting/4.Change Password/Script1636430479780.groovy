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

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/btnChangePassword'), 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/kolomOldPassword'), GlobalVariable.bayarindpassword, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/kolomNewPassword'), GlobalVariable.bayarindnewpassword, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/kolomConfirmNewPassword'), GlobalVariable.bayarindnewpassword, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/btnSavePassword') ,0)

Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/wordingSuksesUpdatePassword'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/btnClose') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/btnChangePassword') ,0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/kolomOldPassword'), GlobalVariable.bayarindnewpassword, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/kolomNewPassword'), GlobalVariable.bayarindpassword, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/kolomConfirmNewPassword'), GlobalVariable.bayarindpassword, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/btnSavePassword') ,0)

Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/wordingSuksesUpdatePassword'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/Setting/Change Password/btnClose') ,0)

