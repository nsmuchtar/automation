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
Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/btnBurger'), 0)
Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Menu Burger/outlet'), 0)
Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Menu Burger/listStore'), 0)
Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Outlet Management/chooseOutletCabang'), 0)
Mobile.scrollToText('Hapus Toko Ini')
Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Outlet Management/btnDeleteOutlet'),0)
Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Outlet Management/kotakDialogYa'), 0)

