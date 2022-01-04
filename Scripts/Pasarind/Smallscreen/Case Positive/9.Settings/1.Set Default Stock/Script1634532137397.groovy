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

Mobile.startExistingApplication('sprintasia.tech.pasarind', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/btnBurger'), 0)

Mobile.scrollToText('Pengaturan')

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Menu Burger/settings'), 0)

Mobile.setText(findTestObject('Pasarind Existing/Smallscreen/Settings/defaultStock'), GlobalVariable.defaultstock, 
    0)

String ExpectDefaultStock = Mobile.getText(findTestObject('Pasarind Existing/Smallscreen/Settings/defaultStock'), 0)

Mobile.pressBack()

CustomKeywords.'pasarind_smallscreen.menu_pasarind.productManagement'()

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/btnAddProduct'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/category1'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/kolomProductName'), 'TEST PRODUCT', 0)

Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/kolomSellingPrice'), '69000', 0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/switchDeskripsi'), 0)

CustomKeywords.'general.control.swipeDown'()

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/switchStock'), 0)

Mobile.pressBack()

Mobile.delay(1)

Mobile.pressBack()

Mobile.delay(1)

Mobile.pressBack()