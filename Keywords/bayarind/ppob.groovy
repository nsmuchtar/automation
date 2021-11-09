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
		Mobile.setText(findTestObject('Object Repository/Bayarind/Android/PPOB/Pulsa dan Paket Data/kolomPhoneNumber'), GlobalVariable.bayarindnohpPPOB, 0)
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
}
