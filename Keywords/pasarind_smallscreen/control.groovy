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

public class control {
	@Keyword
	def logoutPasarind() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/btnBurger'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Menu Burger/logout'), 0)
		if (Mobile.verifyElementExist(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/popUpKasirTutup'), 3, FailureHandling.OPTIONAL) == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/btnOkKasir'), 0)
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Rekap Kas/btnTutupKasir'), 0)
			CustomKeywords.'pasarind_smallscreen.control.inputPIN'()
			CustomKeywords.'pasarind_smallscreen.control.inputKasDiterima'()
			Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind/Smallscreen/Rekap Kas/btnRiwayatKas'), 0)
			Mobile.pressBack()
		}else {
		}
	}
	@Keyword
	def inputPIN() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Input PIN/angka1'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Input PIN/angka3'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Input PIN/angka0'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Input PIN/angka0'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Input PIN/angka2'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Input PIN/angka7'), 0)
	}
	@Keyword
	def inputKasDiterima() {
		Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Rekap Kas/kolomInputTunaiDiterima'), GlobalVariable.tunaiditerima, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Rekap Kas/btnSimpan'), 0)
	}

	@Keyword
	def closePopUp() {
		Mobile.delay(2)
		Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/respondError'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnDone'), 0)
	}

	@Keyword
	def scrollDownTnC() {
		while (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnAcceptTnC (1)'), 2) == false) {
			CustomKeywords.'general.control.swipeDown'()
		}
	}

	@Keyword
	def pilihBatalValidasiUpgradeAccount() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind/Smallscreen/Validasi Upgrade Account/validasiUpgradeAccount'), 3)  == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Validasi Upgrade Account/btnBatal'), 0)
		}
		else {
		}
	}

	@Keyword
	def pilihOKValidasiUpgradeAccount() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind/Smallscreen/Validasi Upgrade Account/validasiUpgradeAccount'), 3)  == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Validasi Upgrade Account/btnOK'), 0)
		}
		else {
		}
	}

	@Keyword
	def startSelling () {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/btnOpenKasir'), 0) == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/btnOpenKasir'), 0)
			Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Rekap Kas/kolomInputKasAwal'), GlobalVariable.kasawal, 0)
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Rekap Kas/btnSimpan (1)'), 0)
		}else {
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/btnStartSelling'), 0)
		}
	}
}