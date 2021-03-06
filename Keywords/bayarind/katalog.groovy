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

public class katalog {

	int device_Height = Mobile.getDeviceHeight()
	int device_Width = Mobile.getDeviceWidth()

	//vertical
	int startXvertical = device_Width / 2
	int endXvertical = startXvertical
	int startYvertical = device_Height * 0.30
	int endYvertical = device_Height * 0.70
	//vertical


	@Keyword
	def productBatagor() {
		Mobile.scrollToText('Batagor', FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddBatagor'), 0)
	}

	@Keyword
	def produtMieAcehGoreng() {
		Mobile.scrollToText('Mie Aceh Goreng', FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddMieAcehGoreng'), 0)
	}

	@Keyword
	def productMieAcehRebus() {
		Mobile.scrollToText('Mie Aceh Rebus')
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddMieAcehRebus'), 0)
	}

	@Keyword
	def productMieAcehTongseng() {
		Mobile.scrollToText('Mie Aceh Tongseng')
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddMieAcehTongseng'), 0)
	}

	@Keyword
	def productGurameBakar() {
		Mobile.swipe(startXvertical, endYvertical, endXvertical, startYvertical)
		Mobile.scrollToText('Gurame Bakar')
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddGurameBakar'),0)
	}

	@Keyword
	def productNasiGorengMurah() {
		while (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/wordingNasiGorengMurah'), 3) == false) {
			Mobile.delay(2)
			Mobile.swipe(startXvertical, endYvertical, endXvertical, startYvertical)
		}

		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddNasiGorengMurah'), 0)
	}

	@Keyword
	def productPaketAyamGeprekPaketA() {
		while (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/wordingPaketAyamGrepekPaketA'), 3) == false) {
			Mobile.delay(2)
			Mobile.swipe(startXvertical, endYvertical, endXvertical, startYvertical)
		}

		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddPaketAyamGeprekPaketA'), 0)
	}

	@Keyword
	def productPaketAyamGeprekPaketB() {
		while (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/wordingPaketAyamGeprekPaketB'), 3) == false) {
			Mobile.delay(2)
			Mobile.swipe(startXvertical, endYvertical, endXvertical, startYvertical)
		}

		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddPaketAyamGeprekPaketB'), 0)
	}

	@Keyword
	def setQuantityItem() {
		if(Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Summary Order/inputQuantityProduct1'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/inputQuantityProduct1') ,0)
			Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Summary Order/kolomInputQuantity'), GlobalVariable.bayarindquantityitem1, endYvertical)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/btnDoneQuantity'), 0)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/noteProduct1') ,0)
			Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Summary Order/kolomInputNote'), GlobalVariable.bayarindnoteitem1, endYvertical)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/btnDoneNote'), 0)
		} else {

		}

		if(Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Summary Order/inputQuantityProduct2'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/inputQuantityProduct2') ,0)
			Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Summary Order/kolomInputQuantity'), GlobalVariable.bayarindquantityitem2, endYvertical)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/btnDoneQuantity'), 0)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/noteProduct2') ,0)
			Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Summary Order/kolomInputNote'), GlobalVariable.bayarindnoteitem2, endYvertical)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/btnDoneNote'), 0)
		} else {

		}

		if(Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Summary Order/inputQuantityProduct3'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/inputQuantityProduct3') ,0)
			Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Summary Order/kolomInputQuantity'), GlobalVariable.bayarindquantityitem3, endYvertical)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/btnDoneQuantity'), 0)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/noteProduct3') ,0)
			Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Summary Order/kolomInputNote'), GlobalVariable.bayarindnoteitem3, endYvertical)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/btnDoneNote'), 0)
		} else {

		}
	}

	@Keyword
	def submitOrder() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/btnSubmitOrder'), 0)
		Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Summary Order/wordingSuksesSubmitOrder'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Summary Order/btnOK') ,0)
	}
}
