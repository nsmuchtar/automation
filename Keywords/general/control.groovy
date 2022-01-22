package general

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class control {
	int device_Height = Mobile.getDeviceHeight()
	int device_Width = Mobile.getDeviceWidth()

	//vertical
	int startXvertical = device_Width / 2
	int endXvertical = startXvertical
	int startYvertical = device_Height * 0.30
	int endYvertical = device_Height * 0.70
	//vertical

	/*swipe general*/
	@Keyword
	def swipeUp(){
		Mobile.swipe(startXvertical, startYvertical, endXvertical, endYvertical)
	}
	@Keyword
	def swipeDown(){
		Mobile.swipe(startXvertical, endYvertical, endXvertical, startYvertical)
	}
	/*swipe general*/	

	/*swipe detail*/
	@Keyword
	def swipeUpDetail(){
		int heightDetail = Mobile.getElementHeight(findTestObject('Object Repository/Bayarind/Android/PPOB/viewDetail'), 1)
		int widthDetail = Mobile.getElementWidth(findTestObject('Object Repository/Bayarind/Android/PPOB/viewDetail'), 1)

		int startXverticalDetail = heightDetail / 2
		int endXverticalDetail = startXverticalDetail
		int startYverticalDetail = heightDetail * 0.30
		int endYverticalDetail = heightDetail * 0.70


		Mobile.swipe(startXverticalDetail, startYverticalDetail, endXverticalDetail, endYverticalDetail)
	}
	@Keyword
	def swipeDownDetail(){
		int heightDetail = Mobile.getElementHeight(findTestObject('Object Repository/Bayarind/Android/PPOB/viewDetail'), 1)
		int widthDetail = Mobile.getElementWidth(findTestObject('Object Repository/Bayarind/Android/PPOB/viewDetail'), 1)

		int startXverticalDetail = heightDetail / 2
		int endXverticalDetail = startXverticalDetail
		int startYverticalDetail = heightDetail * 0.30
		int endYverticalDetail = heightDetail * 0.70

		Mobile.swipe(startXverticalDetail, endYverticalDetail, endXverticalDetail, startYverticalDetail)
	}
	/*swipe detail*/

	@Keyword
	def swipeDownTakeaway() {
		int heightTakeaway = Mobile.getElementHeight(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/rincianPesanan'), 1)
		int widthTakeaway = Mobile.getElementWidth(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/rincianPesanan'), 1)

		int startXverticalTakeaway = heightTakeaway / 2
		int endXverticalTakeaway = startXverticalTakeaway
		int startYverticalTakeaway = heightTakeaway * 0.30
		int endYverticalTakeaway = heightTakeaway * 0.70

		Mobile.swipe(startXverticalTakeaway, endYverticalTakeaway, endXverticalTakeaway, startYverticalTakeaway)
	}

	@Keyword
	def swipeUpTakeaway() {
		int device_Height = Mobile.getElementHeight(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/rincianPesanan'), 1)
		int device_Width = Mobile.getElementWidth(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Takeaway/rincianPesanan'), 1)

		//vertical
		int startXvertical1 = device_Width / 2
		int endXvertical1 = startXvertical1
		int startYvertical1 = device_Height * 0.30
		int endYvertical1 = device_Height * 0.70

		Mobile.swipe(startXvertical1, startYvertical1, endXvertical1, endYvertical1)
	}

	@Keyword
	def clearCache() {
		Mobile.startExistingApplication('com.android.settings')
		Mobile.scrollToText('Apps')
		Mobile.tap(findTestObject('Object Repository/Settings Android/Apps'), 0)
		Mobile.tap(findTestObject('Object Repository/Settings Android/appBayarind'), 0)
		Mobile.tap(findTestObject('Object Repository/Settings Android/storage'), 0)
		Mobile.tap(findTestObject('Object Repository/Settings Android/clearData'), 0)
		Mobile.tap(findTestObject('Object Repository/Settings Android/btnOKClearData'), 0)

	}
}
