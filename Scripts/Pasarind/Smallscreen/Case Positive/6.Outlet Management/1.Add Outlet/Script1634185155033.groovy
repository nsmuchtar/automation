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

long first12 = (long) (Math.random() * 100000000000);

String randomNumber = String.valueOf(first12)

Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Homepage/btnBurger'), 0)
Mobile.tap(findTestObject('Object Repository/Pasarind Existing/Smallscreen/Menu Burger/outlet'), 0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/btnAddOutlet'),0)
Mobile.setText(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/kolomNamaOutlet'), 'Cabang ' + randomNumber, 0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/pinPoint'), 0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/tapSearchMap'), 0)
Mobile.setText(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/searchBarMap'), 'Jakarta Selatan', 0)	
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/hasilSearch') ,0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/btnEnter'),0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/dropDownProvinsi'), 0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/provinsiDKIJakarta'), 0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/dropDownKota'), 0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/kotaJakartaSelatan'), 0)
Mobile.scrollToText('Nomor HP')
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/dropDownKecamatan') ,0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/kecamatanPesanggrahan') ,0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/dropDownKodePos') ,0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/zipCodePesanggrahan') ,0)
Mobile.setText(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/kolomHPStore'), GlobalVariable.outletnomorHP, 0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/btnSimpan'), 0)
Mobile.waitForElementPresent(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/wordingSuksesAdd'), 0)
Mobile.tap(findTestObject('Pasarind Existing/Smallscreen/Menu Burger/Outlet Management/btnOK'), 0)