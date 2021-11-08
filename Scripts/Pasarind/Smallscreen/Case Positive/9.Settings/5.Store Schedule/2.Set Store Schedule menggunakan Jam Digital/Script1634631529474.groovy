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

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/storeSchedule') ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Halaman Store Schedule/' + GlobalVariable.inputHari2 + 'Open') ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Analog/toggleMode') ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Digital/kolomJam') ,0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Digital/kolomJam'), GlobalVariable.pilihJamBukaAnalog2, 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Digital/kolomMenit'), GlobalVariable.pilihMenitBukaAnalog2, 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Digital/btnOke'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Halaman Store Schedule/' + GlobalVariable.inputHari2 + 'Close') ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Analog/toggleMode') ,0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Digital/kolomJam'), GlobalVariable.pilihJamTutupAnalog2, 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Digital/kolomMenit'), GlobalVariable.pilihMenitTutupAnalog2, 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Digital/btnOke'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Halaman Store Schedule/btnSimpanSchedule'),0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()