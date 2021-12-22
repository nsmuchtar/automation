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
	def doneTransaction() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Success/wordingSuksesPayment'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Payment Success/btnNewTrx') ,0)
	}
}
