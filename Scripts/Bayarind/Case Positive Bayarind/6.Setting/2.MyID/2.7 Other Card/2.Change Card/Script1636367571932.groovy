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

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/imageOtherCard') , 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/btnChangeCard'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnTakePicture') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnCapture'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnDone'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/gambareKTP'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Other Card/kolomNamaKartu'), 'Kartuku', 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Other Card/kolomNomorKartu'), '075299002211', 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Other Card/kolomNamaLengkap'), 'Battousai', 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnSave'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/wordingSuksesSave'), 3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnDoneAddCard'), 0)