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

public class promo {
	@Keyword
	def noPromo() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Social Payment/bannerPromo'), 3) == true) {
		}else {
			Mobile.scrollToText('Tidak Menggunakan Promo')
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Promo/btnNoPromo') ,0)
		}
	}
	@Keyword
	def promoNoMultiple() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Social Payment/bannerPromo'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Social Payment/btnChoosePromo'), 0)
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Promo/promoNoMultiple') ,0)
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Promo/btnApplyPromo'), 0)
		}else {
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Promo/promoNoMultiple') ,0)
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Promo/btnApplyPromo'), 0)
		}
	}
	@Keyword
	def promoMultiple() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Social Payment/bannerPromo'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Social Payment/btnChoosePromo'), 0)
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Promo/promoMultiple') ,0)
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Promo/btnApplyPromo'), 0)
		}else {
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Promo/promoMultiple') ,0)
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Promo/btnApplyPromo'), 0)
		}
	}
}
