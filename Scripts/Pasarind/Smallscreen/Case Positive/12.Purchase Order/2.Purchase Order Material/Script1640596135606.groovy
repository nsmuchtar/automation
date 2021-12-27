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

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Purchase Order/dropDownPO'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Purchase Order/poMaterial') ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Purchase Order/dropDownMaterial'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Purchase Order/chooseItem'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Purchase Order/quantityPurchase'), '10', 0)

Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Purchase Order/purchasePrice'), '1000', 0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Purchase Order/btnSimpan') ,0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Purchase Order/wordingSukses'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Purchase Order/btnDone') ,0)