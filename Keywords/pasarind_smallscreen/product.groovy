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

public class product {
	@Keyword
	def productBatagor() {
		for(int i=1; i <= GlobalVariable.quantityitem1; i++){
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/productBatagor') ,0)
		}
	}

	@Keyword
	def productGurameBakar() {
		for(int i=1; i <= GlobalVariable.quantityitem1; i++){
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/productGurameBakar') ,0)
		}
	}

	@Keyword
	def productNasiGorengMurah() {
		for(int i=1; i <= GlobalVariable.quantityitem1; i++){
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/productNasiGorengMurah') ,0)
		}
	}

	@Keyword
	def ProductPaketAyamGreprekPaketA() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/productPaketAyamGrepek') ,0)
		for(int i=1; i <= GlobalVariable.quantityitem1; i++){
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/btnAddVariant1') ,0)
		}
	}

	@Keyword
	def ProductPaketAyamGreprekPaketB() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/productPaketAyamGrepek') ,0)
		for(int i=1; i <= GlobalVariable.quantityitem1; i++){
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/btnAddVariant2') ,0)
		}
	}

	@Keyword
	def MieAcehGoreng() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/productMieAceh') ,0)
		for(int i=1; i <= GlobalVariable.quantityitem1; i++){
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/btnAddVariant1') ,0)
		}
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/btnSimpanQuantityVariant'), 0)
	}

	@Keyword
	def MieAcehTongseng() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/productMieAceh') ,0)
		for(int i=1; i <= GlobalVariable.quantityitem1; i++){
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/btnAddVariant2') ,0)
		}
	}

	@Keyword
	def MieAcehRebus() {
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/productMieAceh') ,0)
		for(int i=1; i <= GlobalVariable.quantityitem1; i++){
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/btnAddVariant3/') ,0)
		}
	}

	@Keyword
	def additionalItem() {
		Mobile.waitForElementPresent(findTestObject('Pasarind Existing/Smallscreen Exisiting/Takeaway/btnAdditionalItem'), 0)
		Mobile.tap(findTestObject('Pasarind Existing/Smallscreen Exisiting/Takeaway/btnAdditionalItem'), 0)
		Mobile.setText(findTestObject('Pasarind Existing/Smallscreen Exisiting/Takeaway/kolomProductName'), 'Rokok Sebungkus', 0)
		Mobile.setText(findTestObject('Pasarind Existing/Smallscreen Exisiting/Takeaway/kolomSellingPrice'), '10000', 0)
		Mobile.tap(findTestObject('Pasarind Existing/Smallscreen Exisiting/Takeaway/btnAdd') ,0)
	}

	@Keyword
	def hargaNego() {
		Mobile.waitForElementPresent(findTestObject('Pasarind Existing/Smallscreen/Takeaway/btnAdditionalItem'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/chooseProductNego1'), 0)
		String hargasatuan = Mobile.getText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/hargaSatuan'), 0).replace('@Rp ', '').replace('.', '')
		int intHargaSatuan = Integer.parseInt(hargasatuan)
		String hargaNego = intHargaSatuan - 500
		Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/kolomHargaNego'), hargaNego, 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/btnSimpan (1)'), 0)
		CustomKeywords.'pasarind_smallscreen.control.inputPIN'()
	}
	
	@Keyword
	def multipleDiscount () {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/tabUAT02') ,0)
		for(int i=1; i <= GlobalVariable.quantityitem2; i++){
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/productMultipleDiscount') ,0)
		}
	}
	
	@Keyword
	def multipleDiscountMaxAmount() {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/tabUAT02') ,0)
		for(int i=1; i <= GlobalVariable.quantityitem3; i++){
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/productMultipleDiscountMaxAmount') ,0)
		}
	}
	
	@Keyword
	def singleDiscountMaxAmount() {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/tabUAT02') ,0)
		for(int i=1; i <= GlobalVariable.quantityitem1; i++){
			Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/productSingleDiscountMaxAmount') ,0)
		}
	}
}
