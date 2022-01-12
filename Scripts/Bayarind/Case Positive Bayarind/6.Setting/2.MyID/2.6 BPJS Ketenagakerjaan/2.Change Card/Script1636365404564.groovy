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

long first6 = (long) (Math.random() * 100000L);
long first14 = (long) (Math.random() * 100000000000000L);

long generate1 = 7123425341243L + first6;
long generate2 = 5200000000000000L + first14;

String nokartu = String.valueOf(generate1)
String nik = String.valueOf(generate2)

CustomKeywords.'bayarind.menu.passStore'()

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/imageBPJSKetenagakerjaan') , 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/btnChangeCard'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnTakePicture') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnCapture'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnDone'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/gambareKTP'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/BPJS Ketenagakerjaan/kolomNIK'), nik, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/BPJS Ketenagakerjaan/kolomNomorKartu'), nokartu, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/BPJS Ketenagakerjaan/kolomNamaLengkap'), 'Sasuke Uchihe', 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/BPJS Ketenagakerjaan/kolomTanggalDibuat') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnDoneTanggal') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnSave'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/wordingSuksesSave'), 3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnDoneAddCard'), 0)