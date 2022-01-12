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

public class menu_pasarind {
	@Keyword
	def tableManagement() {
		Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Homepage/btnBurger'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Menu Burger/tableManagement'), 0)
	}

	@Keyword
	def outletManagement() {
		Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Homepage/btnBurger'), 0)
		Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/outlet'), 0)
	}

	@Keyword
	def employeeManagement() {
		Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Homepage/btnBurger'), 0)
		Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/employee'), 0)
	}

	@Keyword
	def customerManagement() {
		Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Homepage/btnBurger'), 0)
		Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/employee'), 0)
	}

	@Keyword
	def productManagement() {
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/productManagement'), 0)
	}

	@Keyword
	def Tax() {
		Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Homepage/btnBurger'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Menu Burger/settings'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Settings/' + GlobalVariable.tax), 0)
	}

	@Keyword
	def storeSchedule() {
		Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Homepage/btnBurger'), 0)
		Mobile.scrollToText('Pengaturan')
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Menu Burger/settings'), 0)
		Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Settings/storeSchedule'), 0)
	}
}
