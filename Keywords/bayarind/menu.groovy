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

public class menu {
	@Keyword
	def menuSetting() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnAccount'), 0)
		CustomKeywords.'general.control.swipeDown'()
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/btnSetting') ,0)
	}

	@Keyword
	def menuAccount() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnAccount'), 0)
	}

	@Keyword
	def passStore() {
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnAccount'), 0)
		Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/btnMyID'), 0)
	}
}
