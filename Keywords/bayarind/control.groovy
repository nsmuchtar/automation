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

public class control {
	@Keyword
	def inputPINBayarind() {
		if(Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Input PIN/numpadPIN'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin1), 0)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin2), 0)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin3), 0)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin4), 0)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin5), 0)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Input PIN/pin' + GlobalVariable.pin6), 0)
		}else {
		}
	}

	@Keyword
	def scanQRTable() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnScanQR'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Scan QR/btnChooseImage'),0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager/btnBurgerFileManager'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager/btnImages'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager/menuDownload'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager/QRMeja'), 0)
		Mobile.delay(3)
		Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/merchantName'), 0)
	}

	@Keyword
	def inputOTP() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/OTP/halamanOTP'), 0)
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/OTP/kolomOTP'), GlobalVariable.bayarindotp2, 0)
	}

	@Keyword
	def closeBanner() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Homepage/btnOKBanner'), 3)  == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnOKBanner'), 0)
		}else {
		}
	}

	@Keyword
	def doneTransactionPPOB() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/PPOB/PBB/Payment Status/wordingWaitOperator'), 3) == true) {
			Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/PPOB/PBB/Payment Status/timerPBB'), 0)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/PBB/Payment Status/btnRefreshStatus') ,0)
			if (Mobile.waitForElementPresent(findTestObject('Bayarind/Android/PPOB/PBB/Payment Status/btnFavoritePBB'), 3) == true) {
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/PBB/Payment Status/btnFavoritePBB'), 0)
			}else {
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/PBB/Payment Status/btnClose'), 0)
			}
		} else if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Done Transaction/wordingTransactionSuccessMembership'), 0) == true ) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnDoneEducation'), 0)
		} else {
			Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Done Transaction/wordingStatusTransactionPPOB'), 0)
			if(Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnHowToRedeem'), 3) == true) {
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnHowToRedeem'), 0)
				Mobile.delay(3)
				Mobile.pressBack()
			}
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnSeeDetailTransaction') ,0)
			Mobile.delay(3)
			Mobile.pressBack()
			if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnAddFavorite'), 3) == true ) {
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnAddFavorite'), 0)
			}else {
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnDoneTransactionPPOB'), 0)
			}
		}
	}

	@Keyword
	def doneTransactionPasarind() {
		Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Done Transaction/wordingSuksesTransaksiPasarind'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnOKTransaksiPasarind') ,0)
	}

	@Keyword
	def promoNoMultiple() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Transaction Detail/btnPromo'), 3) ==  false) {
			Mobile.scrollToText('add promo')
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Transaction Detail/btnPromo') ,0)
		}else {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Transaction Detail/btnPromo') ,0)
		}
		Mobile.checkElement(findTestObject('Object Repository/Bayarind/Android/Promo/promoNoMultiple'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Promo/btnSavePromo'), 0)
	}

	@Keyword
	def promoMultiple() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Transaction Detail/btnPromo'), 3) ==  false) {
			Mobile.scrollToText('add promo')
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Transaction Detail/btnPromo') ,0)
		}else {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Transaction Detail/btnPromo') ,0)
		}
		Mobile.checkElement(findTestObject('Object Repository/Bayarind/Android/Promo/promoMultiple'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Promo/btnSavePromo'), 0)
	}
}