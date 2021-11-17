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

long generate = 5200000000000000L + first14;

String noktp = String.valueOf(generate)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/imageEKTP') , 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/btnChangeCard'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnTakePicture') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnCapture'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnDone'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/gambareKTP'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomInputNIK'), noktp, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomTempatLahir'), 'Padang', 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomTanggalLahir') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnDoneTanggal'), 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomNamaLengkap'), 'Nasrullah', 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/dropDownGender') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/gender' + GlobalVariable.bayarindgender), 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomGolonganDarah'), GlobalVariable.bayarindgolongandarahKTP, 0)

Mobile.delay(2)

CustomKeywords.'general.control.swipeDown'()

CustomKeywords.'general.control.swipeDown'()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomAlamat'),'Komplek Rajawali', 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomRTRW'), '04/04', 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomKelDesa'), 'Kecamatanku', 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomKecamatan'), GlobalVariable.bayarindkecamatanKTP, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomAgama'), GlobalVariable.bayarindAgamaKTP, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomStatusPerkawinan'), GlobalVariable.statusperkawinanKTP, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomPekerjaan'), GlobalVariable.bayarindpekerjaanKTP, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomKewarganegaraan'), GlobalVariable.bayarindkewarganegaraanKTP, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/kolomBerlakuHingga'), GlobalVariable.bayarindberlakuKTP, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnSave'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/wordingSuksesSave'), 3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnDoneAddCard'), 0)