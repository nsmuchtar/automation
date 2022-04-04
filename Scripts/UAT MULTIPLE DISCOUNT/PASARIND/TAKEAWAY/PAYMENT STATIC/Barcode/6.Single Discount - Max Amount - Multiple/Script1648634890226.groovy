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

Mobile.startExistingApplication('net.sprintasia.ewallet')
CustomKeywords.'bayarind.control.skipPopUp'()
CustomKeywords.'bayarind.control.scanBarcodeStatic'()
CustomKeywords.'bayarind.control.inputAmountPaymentStatic'()
CustomKeywords.'bayarind.payment.kasBayarind'()
CustomKeywords.'bayarind.control.inputPINBayarind'()
CustomKeywords.'bayarind.control.doneTransactionPasarind'()
Mobile.startExistingApplication('sprintasia.tech.pasarind')
Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/withdrawal'), 0)
int balancePreTransaction = Mobile.getText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Withdrawal/saldoMerchant'), 0).replaceAll("[^0-9]", "").toInteger()
Mobile.pressBack()
CustomKeywords.'pasarind_smallscreen.control.startSelling'()
CustomKeywords.'pasarind_smallscreen.control.chooseTakeaway'()
CustomKeywords.'pasarind_smallscreen.product.singleDiscountMaxAmount'()
CustomKeywords.'pasarind_smallscreen.control.createInvoice'()
CustomKeywords.'pasarind_smallscreen.promo.promoMultiple'()
Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Confirm Order/btnBayar') ,0)
CustomKeywords.'pasarind_smallscreen.payment_method.paymentStatic'()
int payment = Mobile.getText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Success/totalPayment'), 0).replaceAll("[^0-9]", "").toInteger()
int mdr = Math.ceil(0.015 * payment)
int postMDR = Math.floor(payment - mdr)
CustomKeywords.'pasarind_smallscreen.control.nextTransaction'()
Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/withdrawal'), 0)
int balancePostTransaction = Mobile.getText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Withdrawal/saldoMerchant'), 0).replaceAll("[^0-9]", "").toInteger()
int selisih = balancePostTransaction - balancePreTransaction
String selisihString = Integer.toString(selisih)
String postMDRString = Integer.toString(postMDR)
Mobile.verifyMatch(selisihString, postMDRString, false)
Mobile.pressBack()