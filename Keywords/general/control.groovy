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

	/*
	 int browser_height = WebUI.getPageHeight()
	 int browser_width = WebUI.getPageWidth()
	 int startXverticalBrowser = browser_width /2
	 int endXverticalBrowser = startXverticalBrowser
	 int startYverticalBrowser = browser_height * 0.30
	 int endYverticalBrowser = browser_height * 0.70
	 */

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
}
