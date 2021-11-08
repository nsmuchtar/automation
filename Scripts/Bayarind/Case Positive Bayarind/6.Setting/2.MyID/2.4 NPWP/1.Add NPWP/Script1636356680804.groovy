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

long first14 = (long) (Math.random() * 10000000000000L);

long generate = 500000000000000L + first14;

String nokartu = String.valueOf(generate)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnAccount'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/btnMyID'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/btnAddNPWP') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnCapture'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnDone'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/gambareKTP'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/NPWP/kolomNomorKartu'), nokartu, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/NPWP/kolomNamaLengkap'), GlobalVariable.bayarindnamalengkapNPWP, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/NPWP/kolomAlamat'), GlobalVariable.bayarindalamatNPWP, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/NPWP/kolomTanggalTerdaftar') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnDoneTanggal') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/btnSave') ,0)

Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/wordingSuksesSave'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/btnDoneAddCard'), 0)