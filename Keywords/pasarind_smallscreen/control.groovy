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
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/btnBurger'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Menu Burger/logout'), 0)
		if (Mobile.verifyElementExist(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/popUpKasirTutup'), 3, FailureHandling.OPTIONAL) == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/btnOkKasir'), 0)
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Rekap Kas/btnTutupKasir'), 0)
			CustomKeywords.'pasarind_smallscreen.control.inputPIN'()
			CustomKeywords.'pasarind_smallscreen.control.inputKasDiterima'()
			Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Rekap Kas/btnRiwayatKas'), 0)
			Mobile.pressBack()
		}else {
		}
	}

	@Keyword
	def openKasir() {
		if(Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/btnOpenKasir'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/btnOpenKasir'), 0)
			Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Rekap Kas/kolomInputKasAwal'), GlobalVariable.kasawal, 0)
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Rekap Kas/btnSimpan'), 0)
		}else if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/btnOpenKasir'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/btnOpenKasir'), 0)
			Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Rekap Kas/kolomInputKasAwal'), GlobalVariable.kasawal, 0)
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Rekap Kas/btnSimpan'), 0)
		}else {
		}
	}

	@Keyword
	def inputPIN() {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Input PIN/angka1'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Input PIN/angka3'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Input PIN/angka0'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Input PIN/angka0'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Input PIN/angka2'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Input PIN/angka7'), 0)
	}
	@Keyword
	def inputKasDiterima() {
		Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Rekap Kas/kolomInputTunaiDiterima'), GlobalVariable.tunaiditerima, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Rekap Kas/btnSimpan'), 0)
	}

	@Keyword
	def closePopUp() {
		if(Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Registrasi/btnDone'), 3) == true) {
			Mobile.delay(2)
			Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Registrasi/respondError'), 3)
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Registrasi/btnDone'), 3)
		}else if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Settings/Tax/btnOK'), 3) == true) {
			Mobile.delay(2)
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Settings/Tax/btnOK'), 3)
		}else if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Settings/Tax/btnSelesai'), 3) == true) {
			Mobile.delay(2)
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Settings/Tax/btnSelesai'), 3)
		}
	}

	@Keyword
	def scrollDownTnC() {
		while (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Registrasi/btnAcceptTnC (1)'), 2) == false) {
			CustomKeywords.'general.control.swipeDown'()
		}
	}

	@Keyword
	def pilihBatalValidasiUpgradeAccount() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Validasi Upgrade Account/validasiUpgradeAccount'), 3)  == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Validasi Upgrade Account/btnBatal'), 0)
		}
		else {
		}
	}

	@Keyword
	def pilihOKValidasiUpgradeAccount() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Validasi Upgrade Account/validasiUpgradeAccount'), 3)  == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Validasi Upgrade Account/btnOK'), 0)
		}
		else {
		}
	}

	@Keyword
	def startSelling () {
		if(Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/totalPendapatan'), 3) == true) {
			CustomKeywords.'pasarind_smallscreen.control.openKasir'()
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/btnStartSelling') ,0)
		}else if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/totalPendapatan'), 3) == true){
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/btnStartSelling') ,0)
		}else if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/dashboardKasirSPV'), 3) == true){
			CustomKeywords.'pasarind_smallscreen.control.openKasir'()
		}else {
		}
	}


	@Keyword
	def cekKategoriProduct() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/popUpCategoryKosong'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/btnOK'), 0)
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Category Management/btnAddCategory'), 0)
			Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Category Management/kolomKategori'), GlobalVariable.kategorimakanan, 0)
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Category Management/btnSimpan'), 0)
			Mobile.pressBack()
		}else {
		}
	}

	@Keyword
	def chooseTakeaway() {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/takeaway'), 0)
		if (Mobile.verifyElementExist(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/btnNewBill'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/btnNewBill') ,0)
		}else {
		}
	}

	@Keyword
	def reorderTakeaway() {
		Mobile.pressBack()
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/takeaway'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/newestOrder') ,0)
	}

	@Keyword
	def chooseSocialPayment() {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/socialPayment'), 0)
		if (Mobile.verifyElementExist(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/btnNewBill'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/btnNewBill') ,0)
		}else {
		}
	}

	@Keyword
	def reorderSocialPayment() {
		Mobile.pressBack()
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/socialPayment'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/newestOrder') ,0)
	}
	@Keyword
	def createInvoice() {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/btnBayar'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/kolomNamaCustomer'), GlobalVariable.customername, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/btnCreateInvoice') ,0)
	}

	@Keyword
	def saveInvoice() {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/btnSimpan'), 0)
		Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/kolomNamaCustomer'), GlobalVariable.customername, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/btnCreateInvoice') ,0)
	}
	
	@Keyword
	def appPasarind() {
		Mobile.startExistingApplication('sprintasia.tech.pasarind')
		while (Mobile.verifyElementExist(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/logoPasarind'), 3) == false) {
			Mobile.pressBack()
			Mobile.delay(0.5)
		}
	}
}
