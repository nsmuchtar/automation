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

long first14 = (long) (Math.random() * 100000000000000L);

long generate = 3100000000000000L + first14;

String nosim = String.valueOf(generate)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/imageESIM') , 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/btnChangeCard'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnTakePicture') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnCapture'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnDone'), 0)

Mobile.delay(2)

CustomKeywords.'general.control.swipeUp'()

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/gambareKTP'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/kolomNamaLengkap'), 'Antoni Budi', 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/kolomAlamat'), 'Komplek Rajawali Citra', 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/kolomTempatLahir'), 'Bukittinggi', 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/kolomTanggalLahir'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/btnDoneTanggal'), 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/kolomTinggiBadan'), '175', 0)

Mobile.delay(2)

CustomKeywords.'general.control.swipeDown'()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/kolomPekerjaan'), 'Karyawan Swasta', 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/kolomNomorSIM'), nosim, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/kolomBerlakuSIM'), 'SeumurHidup', 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/btnSave'),0)

Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/wordingSuksesSave'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/btnDoneAddCard'), 0)