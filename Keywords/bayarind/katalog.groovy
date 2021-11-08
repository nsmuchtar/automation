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
		while (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddGurameBakar'), 3) == false) {
			Mobile.delay(2)
			CustomKeywords.'general.control.swipeDown'()
			Mobile.scrollToText('Gurame Bakar')
		}
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddGurameBakar'),0)
	}

	@Keyword
	def productNasiGorengMurah() {
		while (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/wordingNasiGorengMurah'), 3) == false) {
			Mobile.delay(2)
			CustomKeywords.'general.control.swipeDown'()
		}

		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddNasiGorengMurah'), 0)
	}

	@Keyword
	def productPaketAyamGeprekPaketA() {
		while (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/wordingPaketAyamGrepekPaketA'), 3) == false) {
			Mobile.delay(2)
			CustomKeywords.'general.control.swipeDown'()
		}

		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddPaketAyamGeprekPaketA'), 0)
	}

	@Keyword
	def productPaketAyamGeprekPaketB() {
		while (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/wordingPaketAyamGeprekPaketB'), 3) == false) {
			Mobile.delay(2)
			CustomKeywords.'general.control.swipeDown'()
		}

		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Katalog/btnAddPaketAyamGeprekPaketB'), 0)
	}
	
	@Keyword
	def setQuantityItetm
}
