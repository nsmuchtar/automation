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

CustomKeywords.'pasarind_smallscreen.menu_pasarind.storeSchedule'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Halaman Store Schedule/' + GlobalVariable.inputHari2 + 'Open') ,0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Analog/toggleMode') ,0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Digital/kolomJam'), '25', 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Digital/kolomMenit'), '75', 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/responInvalidSchedule'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Settings/Store Schedule/Jam/Analog/btnOke') ,0)

Mobile.pressBack()

Mobile.delay(1)

Mobile.pressBack()

Mobile.delay(1)

Mobile.pressBack()