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

public class commision {

	@Keyword
	def komisiKasirPersen() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kasirPersen'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kasirKomisi'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), GlobalVariable.persenkasir, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiKasirAmount() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kasirRp'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kasirKomisi'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), GlobalVariable.amountkasir, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiSPVPersen() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvPersen'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvKomisi'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), GlobalVariable.persenspv, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiSPVAmount() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvRp'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvKomisi'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), GlobalVariable.amountspv, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiKitchenPersen() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kitchenPersen'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kitchenKomisi'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), GlobalVariable.persenkitchen, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiKitchenAmount() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kitchenRp'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kitchenKomisi'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), GlobalVariable.amountkitchen, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiKasir0() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kasirPersen'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kasirKomisi'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), '0', 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiSPV0() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvPersen'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvKomisi'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), '0', 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiKitchen0() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kitchenPersen'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kitchenKomisi'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), '0', 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiKasir20Persen() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kasirPersen'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kasirKomisi'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'),0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), '20', 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiSPV30Persen() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvPersen'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvKomisi'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'),0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), '30', 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiKitchen50Persen() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kitchenPersen'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kitchenKomisi'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'),0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), '50', 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiKasir2000() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kasirRp'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kasirKomisi'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'),0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), '2000', 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiSPV5000() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvRp'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvKomisi'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'),0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), '5000', 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def komisiKitchen4000() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kitchenRp'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kitchenKomisi'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'),0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), '4000', 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}

	@Keyword
	def KomisiSPV3500() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvRp'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/spvKomisi'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'),0)
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/kolomInputKomisi'), '3500', 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Commision/btnSimpanNilaiKomisi'), 0)
	}
}
