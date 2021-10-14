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

Mobile.tap(findTestObject('Pasarind/Smallscreen/Homepage/btnBurger'), 0)

Mobile.tap(findTestObject('Pasarind/Smallscreen/Menu Burger/employee'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Table Management/btnAddEmployee'), 0)

Mobile.setText(findTestObject('Pasarind/Smallscreen/Employee Management/inputNamaEmployee'), GlobalVariable.employeecashier, 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Employee Management/inputEmailHP'), GlobalVariable.akunemployee2, 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Employee Management/pilihPrivilage'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Employee Management/privilageCashier'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Employee Management/inputPIN'), GlobalVariable.pinemployee, 0)
x
Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Employee Management/btnSimpan'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()
