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
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager/qrMejaTester'), 0)
		Mobile.delay(3)
		Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/merchantName'), 0)
	}

	@Keyword
	def scanBarcodeStatic() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnScanQR'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Scan QR/btnChooseImage'), 0)
		//		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Scan QR/btnChooseImage'), 3) == true ) {
		//			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Scan QR/btnChooseImage'),0)
		//			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager/btnBurgerFileManager'), 0)
		//			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager/btnImages'), 0)
		//			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager/menuDownload'), 0)
		//			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager/barcodeStaticTester'), 0)
		//		}else {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager POCO/btnBurger01'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager POCO/images'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager POCO/folderQRBarcode'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/File Manager POCO/barcodeStatic (1)'), 0)
		//		}
	}

	@Keyword
	def bayarindShop() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnShopNow') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Bayarind Shop/kolomSearchMerchant'), 0)
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Bayarind Shop/kolomSearchMerchant'), GlobalVariable.bayarindnamamerchant, 0)
		Mobile.delay(2)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Bayarind Shop/chooseMerchant'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Bayarind Shop/btnQuickOrder') ,0)
	}

	@Keyword
	def outletPusat() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Bayarind Shop/imageOutlet'), 3) == true ) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Bayarind Shop/outletPusat'), 0)
			Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/merchantName'), 0)
		}else {
			Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/merchantName'), 0)
		}
	}

	@Keyword
	def outletCabang() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Bayarind Shop/imageOutlet'), 3) == true ) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Bayarind Shop/outletCabang'), 0)
			Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/merchantName'), 0)
		}else {
			Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Katalog/merchantName'), 0)
		}
	}
	@Keyword
	def pilihDelivery() {
		Mobile.tap(findTestObject('Bayarind/Android/Transaction Detail/btnDelivery') ,0)
		if(Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Delivery/' + GlobalVariable.bayarindjenisdelivery), 3)  == true ){
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Delivery/' + GlobalVariable.bayarindjenisdelivery), 0)
		}else {
			Mobile.scrollToText(GlobalVariable.bayarindjenisdelivery)
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Delivery/' + GlobalVariable.bayarindjenisdelivery), 0)
		}
	}

	@Keyword
	def inputOTP() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/OTP/halamanOTP'), 0)
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/OTP/btnResendRegister'), 60) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/OTP/btnResendRegister'), 0)
		} else {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/OTP/btnResendOTPForgotPassword'), 0)
		}
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/OTP/kolomOTP'), GlobalVariable.bayarindotp2, 0)
	}

	@Keyword
	def closeBanner() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Homepage/btnOKBanner'), 3)  == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnOKBanner'), 0)
		}else {
		}
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Validasi Email/kolomInputEmail'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Validasi Email/btnSkip') ,0)
		}else {
		}
	}

	@Keyword
	def favoriteDetailTransaction() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnHowToRedeem'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnHowToRedeem'), 0)
			Mobile.delay(3)
			Mobile.pressBack()
		}else {
		}

		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnSeeDetailTransaction'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnSeeDetailTransaction') ,0)
			Mobile.delay(3)
			if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Detail Transaction/btnHowToRedeem'), 3) == true) {
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnHowToRedeem'), 0)
				Mobile.delay(3)
				Mobile.pressBack()
			}else {
			}
			Mobile.pressBack()
		}

		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnAddFavorite'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnAddFavorite'), 0)
		}else {
		}
	}

	@Keyword
	def doneTransactionPPOB() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnDoneMercedes'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnDoneMercedes') ,0)
		} else if(Mobile.waitForElementPresent('Object Repository/Bayarind/Android/Done Transaction/btnDoneTransactionPPOB', 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnDoneTransactionPPOB') ,0)
		} else if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnDoneTopUp'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Done Transaction/btnDoneTopUp') ,0)
		} else {
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

	@Keyword
	def splashScreen() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Splashscreen/accessLocation'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Splashscreen/btnAllow'), 0)
		} else {
		}

		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Splashscreen/btnNextSplashscreen') ,0)
		Mobile.delay(1.5)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Splashscreen/btnNextSplashscreen') ,0)
		Mobile.delay(1.5)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Splashscreen/btnNextSplashscreen') ,0)
		Mobile.delay(1.5)

		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Splashscreen/accessPhoneCalls'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Splashscreen/btnAllow'), 0)
		} else {
		}

		Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Login Page/kolomPhoneNumber'), 0)
	}

	@Keyword
	def logoutBayarind() {
		while(Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Homepage/btnAccount'), 3) == false ) {
			Mobile.delay(0.5)
			Mobile.pressBack()
		}
		CustomKeywords.'bayarind.menu.menuAccount'()
		Mobile.scrollToText('Logout')
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/btnLogout'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/btnConfirmLogout'), 0)
	}

	@Keyword
	def skipPopUp() {
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Paprika/btnClose'), 3 ) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Paprika/btnClose'), 0)
		} else {
		}

		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Validasi Email/btnSkip'), 3) == true) {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Validasi Email/btnSkip') ,0)
		} else {
		}
	}

	@Keyword
	def inputAmountPaymentStatic() {
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Payment/kolomPaymentAmount1'), '100000', 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Payment/btnNext'), 0)
	}
}