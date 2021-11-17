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
			int endXverticalDetail = startXvertical
			int startYverticalDetail = heightDetail * 0.30
			int endYverticalDetail = heightDetail * 0.70
			
			
			Mobile.swipe(startXverticalDetail, startYverticalDetail, endXverticalDetail, endYverticalDetail)
		}
		@Keyword
		def swipeDownDetail(){
			int heightDetail = Mobile.getElementHeight(findTestObject('Object Repository/Bayarind/Android/PPOB/viewDetail'), 1)
			int widthDetail = Mobile.getElementWidth(findTestObject('Object Repository/Bayarind/Android/PPOB/viewDetail'), 1)
		
			int startXverticalDetail = heightDetail / 2
			int endXverticalDetail = startXvertical
			int startYverticalDetail = heightDetail * 0.30
			int endYverticalDetail = heightDetail * 0.70
			
			Mobile.swipe(startXverticalDetail, endYverticalDetail, endXverticalDetail, startYverticalDetail)
		}
	/*swipe detail*/
}
