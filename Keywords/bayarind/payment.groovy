package bayarind

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

public class payment {

	@Keyword
	def kasBayarind() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/kasBayarind'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/btnPay') ,0)
	}

	@Keyword
	def creditCard() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/creditCard') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/btnPay') ,0)
	}

	@Keyword
	def oneKlik() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/oneKlik') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/btnPay') ,0)
		Mobile.delay(2)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin1), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin2), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin3), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin4), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin5), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin6), 0)
		if(Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Done Transaction/wordingSuccessMembershipMercedes'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnDoneMercedes') ,0)
		} else {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction PPOB Oneklik/btnOK (1)'), 0)
		}
	}

	@Keyword
	def paymentStatic() {

		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Payment/kolomPaymentAmount1'), GlobalVariable.bayarindamountpayment, 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment/btnNext'), 0)
	}

	@Keyword
	def linkAja() {
		Mobile.delay(0.5)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/linkAja') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/btnPay') ,0)
		Mobile.delay(2)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin1), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin2), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin3), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin4), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin5), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin6), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/linkAja/btnSubmit (1)') ,0)
		Mobile.delay(1)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.delay(1)
		CustomKeywords.'general.control.swipeDown'()

		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/linkAja/btnProses (1)'), 0)
	}

	@Keyword
	def paprika() {
		Mobile.tap(findTestObject('Bayarind/Android/Payment Method/Paprika/paprika'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/btnPay') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/Paprika/btnBayar01') ,0 )
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Payment Method/Paprika/kolomPIN01'), '130027', 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/Paprika/btnNext'), 0)
		Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Payment Method/Paprika/wordingPembayaranBerhasil'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment Method/Paprika/btnBackToBayarind'), 0)
	}
}
