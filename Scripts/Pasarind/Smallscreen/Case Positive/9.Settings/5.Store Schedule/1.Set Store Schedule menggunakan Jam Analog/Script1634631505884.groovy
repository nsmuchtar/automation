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

CustomKeywords.'pasarind_smallscreen.menu_pasarind.StoreSchedule'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Halaman Store Schedule/' + GlobalVariable.inputHari1 + 'Open'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Analog/Jam/' + GlobalVariable.pilihJamBukaAnalog1) ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Analog/Menit/' + GlobalVariable.pilihMenitBukaAnalog1) ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Analog/btnOke') ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Halaman Store Schedule/' + GlobalVariable.inputHari1 + 'Close'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Analog/Jam/' + GlobalVariable.pilihJamTutupAnalog1) ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Analog/Menit/' + GlobalVariable.pilihMenitTutupAnalog1) ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Analog/btnOke') ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Halaman Store Schedule/btnSimpanSchedule') ,0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()