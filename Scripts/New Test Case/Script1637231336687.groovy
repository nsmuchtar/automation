import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('sprintasia.tech.pasarind')
if(Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/totalPendapatan'), 3) == true) {
	CustomKeywords.'pasarind_smallscreen.control.openKasir'()
	Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/btnStartSelling') ,0)
}else if (Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/totalPendapatan'), 3) == true){
	Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/btnStartSelling') ,0)
}else if (Mobile.waitForElementAttributeValue(findTestObject('Object Repository/Pasarind Existing/Smallscreen/List Meja/btnOpenKasir'), 'text', 'BUKA KASIR', 3) == true){
	CustomKeywords.'pasarind_smallscreen.control.openKasir'()
}else {
	
}