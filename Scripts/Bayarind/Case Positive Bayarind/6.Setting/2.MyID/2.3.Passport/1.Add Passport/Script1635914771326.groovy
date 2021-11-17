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

int first4 = (int) (Math.random() * 1000);

long generate1 = 50000 + first4;
long generate2 = 5422135632 + first4;

String nopassport = String.valueOf(generate1)
String noreg = String.valueOf(generate2)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnAccount'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/btnMyID'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/btnAddPaspor') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnCapture'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Camera/btnDone'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/gambareKTP'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomNomorPassport'), nopassport, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomKodeNegara') ,0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomSearchNegara'), GlobalVariable.bayarindnamanegarapassport, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/chooseKodeNegara1') ,0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomJenis'), GlobalVariable.bayarindjenispassport, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomGender') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/gender' + GlobalVariable.bayarindgender), 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomNamaLengkap'), GlobalVariable.bayarindnamalengkappassport, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomKewarganegaraan') , 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomSearchNegara'), GlobalVariable.bayarindnamanegarapassport, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/chooseKodeNegara1') ,0)

Mobile.hideKeyboard()

Mobile.delay(2)

CustomKeywords.'general.control.swipeDown'()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomTempatLahir'), GlobalVariable.bayarindtempatlahirpassport, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomTanggalLahir') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnDoneTanggal') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomTanggalPengeluaran') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnDoneTanggal') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomTanggalHabisBerlaku') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-KTP/btnDoneTanggal') ,0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomRegNo'), noreg, 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/kolomKantorPenerbit'), GlobalVariable.bayarindkantorpenerbitpassport, 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/Passport/btnSave') ,0)

Mobile.verifyElementExist(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/wordingSuksesSave'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Setting/MyID/e-SIM/btnDoneAddCard'), 0)