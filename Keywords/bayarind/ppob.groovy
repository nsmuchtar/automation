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

public class ppob {

	@Keyword
	def ppobPulsa() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnSeeAllPPOB'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/ppobPulsaPaketData') ,0)
	}

	@Keyword
	def transaksiPulsa() {
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/Pulsa dan Paket Data/kolomPhoneNumber'), GlobalVariable.bayarindnohpPPOBpulsa, 0)
		String nohp = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/PPOB/Pulsa dan Paket Data/kolomPhoneNumber'), 0)

		switch(nohp) {
			case '085644112211' :
				Mobile.scrollToText('ISAT IM3 / MENTARI REGULER 5RB')
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Pulsa dan Paket Data/Nominal Pulsa/pulsa5rbSukses') ,0)
				break
			case '0895800675766' :
				Mobile.scrollToText('THREE 25RB')
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Pulsa dan Paket Data/Nominal Pulsa/pulsa25rbSukses') ,0)
				break
			case '081938505552' :
				Mobile.scrollToText('XL   50RB')
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Pulsa dan Paket Data/Nominal Pulsa/pulsa50rbsukses') ,0)
				break
			case '081327404356' :
				Mobile.scrollToText('TELKOMSEL SIMPATI / AS 100RB')
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Pulsa dan Paket Data/Nominal Pulsa/pulsa100rbsukses'), 0)
				break
			case '08156876626' :
				Mobile.scrollToText('ISAT IM3 / MENTARI REGULER 100RB')
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Pulsa dan Paket Data/Nominal Pulsa/pulsa100rbSukses2'), 0)
				break
			default :
				Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Pulsa dan Paket Data/Nominal Pulsa/chooseRandomPulsa'), 0)
		}
	}

	@Keyword
	def ppobPulsaPascaBayar() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnSeeAllPPOB'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/ppobPulsaPascaBayar') ,0)
	}

	@Keyword
	def transaksiPulsaPascaBayar() {
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/Pulsa Pascabayar/kolomPhoneNumber'), GlobalVariable.bayarindnohpPPOBpulsapascabayar, 0)
		Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/PPOB/Pulsa Pascabayar/detailPascaBayar'), 0)
	}

	@Keyword
	def ppobPLNPrabayar() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnSeeAllPPOB'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/ppobPLN') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/PLN Prabayar/tabPrabayar') ,0)
	}

	@Keyword
	def transaksiPLNPrabayar() {
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/PLN Prabayar/kolomCustomerID'), GlobalVariable.bayarindIDPLNPrabayar, 0)
		if (Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/PPOB/PLN Prabayar/voucher' + GlobalVariable.bayarindnominalPLNPrabayar) ,3) == true) {
		}else {
			Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/PLN Prabayar/voucher' + GlobalVariable.bayarindnominalPLNPrabayar + 'token') ,0)
		}
	}

	@Keyword
	def ppobPLNPascabayar() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnSeeAllPPOB'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/ppobPLN') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/PLN Pascabayar/tabPascaBayar') ,0)
	}

	@Keyword
	def transaksiPLNPascaBayar() {
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/PLN Prabayar/kolomCustomerID'), GlobalVariable.bayarindIDPLNPascabayar, 0)
	}

	@Keyword
	def ppobBPJS() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnSeeAllPPOB'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/ppobBPJS'), 0)
	}

	@Keyword
	def transaksiBPJS() {
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/BPJS/kolomCustomerID'), GlobalVariable.bayarindIDBPJS, 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/BPJS/kolomPaymentPeriod') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/BPJS/period' + GlobalVariable.bayarindperiodBPJS), 0)
	}

	@Keyword
	def ppobTelkom() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnSeeAllPPOB'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/ppobTelkom'), 0)
	}

	@Keyword
	def transaksiIndihome() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Telkom/kolomProduct') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Telkom/indihome'), 0)
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/Telkom/kolomCustomerID'), GlobalVariable.bayarindindihome, 0)
	}

	@Keyword
	def transaksiTelephone() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Telkom/kolomProduct') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Telkom/telephone'), 0)
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/Telkom/kolomCustomerID'), GlobalVariable.bayarindtelephone, 0)
	}

	@Keyword
	def ppobPDAM() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnSeeAllPPOB'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/ppobPDAM'), 0)
	}

	@Keyword
	def transaksiPDAM() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/PDAM/kolomWilayah'), 0)
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/PDAM/kolomSearchWilayah'), GlobalVariable.bayarindWilayah, 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/PDAM/chooseWilayah'), 0)
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/PDAM/kolomCustomerID'), GlobalVariable.bayarindIDPDAM, 0)
		CustomKeywords.'general.control.swipeDown'()
	}

	@Keyword
	def ppobTVCable() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnSeeAllPPOB'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/ppobTVCable'), 0)
	}

	@Keyword
	def transaksiTVCable() {
		long first6 = (long) (Math.random() * 100000L);
		long generate = 342000000 + first6;
		String customerID = String.valueOf(generate)

		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/TV Cable/kolomChooseTVCable'), 0)
		Mobile.scrollToText(GlobalVariable.bayarindproviderTVCable)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/TV Cable/Provider/' + GlobalVariable.bayarindproviderTVCable) , 0)
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/TV Cable/kolomCustomerID'), customerID, 0)
	}

	@Keyword
	def ppobPBB() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnSeeAllPPOB'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/ppobPBB'), 0)
	}

	@Keyword
	def TransaksiPBB() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/PBB/kolomDistrict') ,0)
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/PBB/kolomSearchDistrict'), GlobalVariable.bayarindwilayahPBB, 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/PBB/chooseDistrict'), 0)
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/PBB/kolomTaxNumber'), GlobalVariable.bayarindtaxnumberPBB, 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/PBB/btnCheckBills') ,0)
	}

	@Keyword
	def ppobGames() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnSeeAllPPOB'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/ppobGames'), 0)
	}

	@Keyword
	def transaksiGames() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Games/Game/' + GlobalVariable.bayarindjenisvouchergame), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Games/Nominal Voucher/20') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Games/btnNext') ,0)
	}

	@Keyword
	def ppobMercedes() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnMembership') ,0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Membership/membershipMercedes'), 0)
	}

	@Keyword
	def transaksiMercedes() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Membership/Mercedes/btnRenewMembership'), 0)
	}
	
	@Keyword
	def ppobProperty() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnSeeAllPPOB'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/ppobProperty'), 0)
	}
	
	@Keyword
	def transaksiProperty() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Property/dropDownProperty'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Property/residentialGrahaAlterraJaya'), 0)
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/Property/kolomNoPelanggan'), 'A0000001', 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Property/btnCheckBills'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/Property/btnConfirm'), 0)
	}
}
