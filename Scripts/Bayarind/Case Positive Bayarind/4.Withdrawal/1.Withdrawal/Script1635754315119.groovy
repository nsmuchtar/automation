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

String saldoBayarind = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/Homepage/saldoKasBayarind'), 0).replace('.', '')

int beforeSaldoBayarind = Integer.parseInt(saldoBayarind)

CustomKeywords.'bayarind.menu.menuAccount'()

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnWithdrawal') ,0)

String saldoBayarindWithdrawal = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/Withdrawal/saldoBayarind'), 0).replace('Rp', '').replace('.', '')

Mobile.verifyMatch(saldoBayarind, saldoBayarindWithdrawal, false)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Withdrawal/kolomInputAmount'), GlobalVariable.bayarindamountwithdrawal, 0)

String amountWithdrawal = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/Withdrawal/kolomInputAmount'), 0).replace('Rp', '').replace('.', '')

int iAmountWithdrawal = Integer.parseInt(amountWithdrawal)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Withdrawal/btnNext'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Withdrawal/chooseBank1'), 0)

CustomKeywords.'bayarind.control.inputPINBayarind'()

String expectSaldoBayarind = (beforeSaldoBayarind - iAmountWithdrawal).toString()

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Withdrawal/requestWithdrawalSuccess'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Withdrawal/btnOKWithdrawal') ,0)

Mobile.pressBack()

String actualSaldoBayarind = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/Homepage/saldoKasBayarind'), 0).replace('.', '')

Mobile.verifyMatch(expectSaldoBayarind, actualSaldoBayarind, false)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnWithdrawal'), 0)

Mobile.delay(3)

String actualSaldoBayarindWithdrawal = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/Withdrawal/saldoBayarind'), 0).replace('Rp', '').replace('.', '')

Mobile.verifyMatch(actualSaldoBayarind, actualSaldoBayarindWithdrawal, false)

Mobile.pressBack()