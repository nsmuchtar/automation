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

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/btnAddProduct'),0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/category1'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/kolomProductName'), GlobalVariable.namaproduct2, 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/btnAddVariant') ,0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/kolomProductName'), GlobalVariable.variant3, 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/kolomSellingPrice'), GlobalVariable.sellingprice3, 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/switchDeskripsi'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/kolomCapitalPrice'), GlobalVariable.baseprice1, 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/kolomDeskripsi'), GlobalVariable.deskripsi1, 0)

Mobile.scrollToText('simpan')

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/btnSimpanProduct'), 0 )

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/btnAddVariant01') ,0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/kolomProductName'), GlobalVariable.variant4, 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/kolomSellingPrice'), GlobalVariable.sellingprice4, 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/switchDeskripsi'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/kolomCapitalPrice'), GlobalVariable.baseprice2, 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/kolomDeskripsi'), GlobalVariable.deskripsi2, 0)

Mobile.scrollToText('simpan')

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/btnSimpanProduct'), 0 )

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/btnSimpanProduct'), 0 )

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Product Management/kotakDialogTidak'),0)