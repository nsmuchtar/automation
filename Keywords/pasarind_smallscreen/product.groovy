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
			Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Takeaway/btnAddVariant1') ,0)
		}
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
}
