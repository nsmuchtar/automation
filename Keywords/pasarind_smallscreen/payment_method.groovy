package pasarind_smallscreen

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class payment_method {
	@Keyword
	def sendInvoiceBayarind() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Payment Method/walletBayarind'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Payment Method/btnBayar'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Payment Method/kolomInputBayarind'), GlobalVariable.nohpcustomerbayarind, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Payment Method/btnSendInvoiceBayarind') ,0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Payment Method/btnDoneSendInvoice'), 0)
	}

	@Keyword
	def fixedCash() {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/fixedCash') ,0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/btnBayar') ,0)
	}

	@Keyword
	def changeCash() {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/changeCash') ,0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/btnBayar') ,0)
	}

	@Keyword
	def paymentStatic() {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/QRStatic') ,0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/btnBayar') ,0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/btnOKStatic'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Static/chooseTRX') ,0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Static/btnSimpan'), 0)
	}

	@Keyword
	def creditCard() {
		Mobile.delay(1)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.delay(1)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/creditCardBCA (1)'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/kolomReffNumber'), '0027302100419812', 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/btnSimpan'), 0)
	}

	@Keyword
	def debitCard() {
		Mobile.delay(1)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.delay(1)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/debitCardBCA (1)'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/kolomReffNumber'), '0027302100419812', 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/btnSimpan'), 0)
	}

	@Keyword
	def EasyInvoice() {
		CustomKeywords.'general.control.swipeDown'()
		Mobile.delay(0.5)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/easyInvoice (1)'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/kolomEmailHPEasyInvoice'), 'pmqa.ecm@gmail.com' , 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/btnSendEasyInvoice'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Method/btnDoneSendInvoice') , 0)
		while (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/logoPasarind'), 3) == true) {
			Mobile.delay(0.5)
			Mobile.pressBack()
		}
	}

	@Keyword
	def googleMailEasyInvoice() {
		Mobile.delay(7)
		Mobile.startExistingApplication('com.google.android.gm')
		while (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/EasyInvoice/homepageGmail'), 3) == false) {
			Mobile.pressBack()
		}
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/EasyInvoice/newestMail'), 0)
		Mobile.delay(2)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.delay(0.5)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/EasyInvoice/linkInvoice'), 0)
	}
	
	@Keyword
	def choosePaymentEasyInvoice() {
		Mobile.delay(2)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.delay(0.3)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Easy Invoice/virtualAccount'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Easy Invoice/vaPermata'), 0)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Easy Invoice/checkBoxTnC'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Easy Invoice/btnPayNow'), 0)
	}
}
