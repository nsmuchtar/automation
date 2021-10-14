import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.beans.Customizer

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

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Login Page/btnRegistrasi'), 0)

Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/btnNextToStoreInfo (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/kolomUsername'), GlobalVariable.username, 
    0)

Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/btnNextToStoreInfo (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/kolomUsername'), GlobalVariable.username, 
    0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/kolomInputEmailHP'), GlobalVariable.loginemail, 
    0)

Mobile.setText(findTestObject('Pasarind/Smallscreen/Registrasi/kolomPIN'), '112233', 0)

Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/btnNextToStoreInfo (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/kolomInputEmailHP'), GlobalVariable.logintelephone, 
    0)

Mobile.setText(findTestObject('Pasarind/Smallscreen/Registrasi/kolomPIN'), '112233', 0)

Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/btnNextToStoreInfo (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/kolomInputEmailHP'), 'uwuowo6677@gmail.com', 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Pasarind/Smallscreen/Registrasi/kolomPIN'), '11223', 0)

Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/btnNextToStoreInfo (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

Mobile.delay(2)

Mobile.setText(findTestObject('Pasarind/Smallscreen/Registrasi/kolomPIN'), '112233', 0)

Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/btnNextToStoreInfo (1)'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/kolomStoreName'), 0)

CustomKeywords.'general.control.swipeDown'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnNextToTnC (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()
//
CustomKeywords.'general.control.swipeUp'()
//
Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/kolomStoreName'), GlobalVariable.storename, 
    0)

CustomKeywords.'general.control.swipeDown'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnNextToTnC (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

CustomKeywords.'general.control.swipeUp'()
//
Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/dropDownCategory (1)'), 0)

Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/categoryFnB (1)'), 0)

CustomKeywords.'general.control.swipeDown'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnNextToTnC (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

CustomKeywords.'general.control.swipeUp'()

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/kolomNoHP'), GlobalVariable.nohpstore,
	0)

CustomKeywords.'general.control.swipeDown'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnNextToTnC (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

CustomKeywords.'general.control.swipeUp'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/pinPoint'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/tapSearchMap'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/searchBarMap'), GlobalVariable.storeaddress,
	0)

Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/hasilSearch (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnEnter'), 0)

Mobile.delay(3)

CustomKeywords.'general.control.swipeDown'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnNextToTnC (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/dropDownProvinsi (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/searchBarRegistrasi'), GlobalVariable.inputprovinsi,
	0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/hasilSearchDropDown'), 0)

CustomKeywords.'general.control.swipeDown'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnNextToTnC (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/dropDownKota (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/searchBarRegistrasi'), GlobalVariable.inputkota,
	0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/hasilSearchDropDown'), 0)

Mobile.delay(2)

CustomKeywords.'general.control.swipeDown'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnNextToTnC (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/dropDownKecamatan (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/searchBarRegistrasi'), GlobalVariable.inputkecamatan,
	0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/hasilSearchDropDown'), 0)

CustomKeywords.'general.control.swipeDown'()

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnNextToTnC (1)'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/dropDownKodePos'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/hasilSearchDropDown'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnNextToTnC (1)'), 0)
CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

Mobile.tap(findTestObject('Pasarind/Smallscreen/Registrasi/btnAcceptTnC (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnVerify'), 0)

CustomKeywords.'pasarind_smallscreen.control.closePopUp'()

Mobile.setText(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/kolomOTPemail'), '000000', 0)

Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Registrasi/btnVerify'), 0)
	
CustomKeywords.'pasarind_smallscreen.control.closePopUp'()
