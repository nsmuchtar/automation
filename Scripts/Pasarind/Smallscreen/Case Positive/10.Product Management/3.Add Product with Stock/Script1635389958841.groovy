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

long first14 = (long) (Math.random() * 100000000000000L);

long generate = 5200000000000000L + first14;

String sku = String.valueOf(generate)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/btnAddProduct'),0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/category1'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/kolomProductName'), GlobalVariable.namaproduct3, 0)

Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/kolomSellingPrice'), GlobalVariable.sellingprice4, 0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/switchDeskripsi'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/kolomBasePrice'), GlobalVariable.baseprice2, 0)

Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/kolomSKU'), sku, 0)

Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/kolomDeskripsi'), GlobalVariable.deskripsi1, 0)

CustomKeywords.'general.control.swipeDown'()

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/dropDownProductUnit'),0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/productUnit' + GlobalVariable.productunit2), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/switchStock') ,0)

CustomKeywords.'general.control.swipeDown'()

Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/stockOutletPusat1'), GlobalVariable.stock1, 0)

Mobile.setText(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/stockOutletCabang1'), GlobalVariable.stock3, 0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/btnSimpan'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Product Management/kotakDialogTidak'), 0)