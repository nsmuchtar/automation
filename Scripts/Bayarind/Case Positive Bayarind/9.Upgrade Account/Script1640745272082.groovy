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

Mobile.startExistingApplication('net.sprintasia.ewallet')

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Homepage/btnUpgradeAccount') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/btnNextToID') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/eKTP'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomNoKTP'), 60)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomNoKTP'), '1234567890123456', 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomTempatLahir'), 'Jakarta', 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomTanggalLahir') ,0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/btnOKKalender') ,0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomNama'), 'Lagi Ditest ama QA', 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomGender'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/genderMale'), 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomGolonganDarah') ,'A',0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomAlamat'), 'Jalan Bunga Mayang', 0)

CustomKeywords.'general.control.swipeDown'()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomRTRW') ,'01 / 01',0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomKelurahanDesa') ,'Kelurahan 01',0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomKecamatan') ,'Kecamatan 01',0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomAgama') ,'Agama 01',0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomStatusPerkawinan'), 'Status 01', 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomPekerjaan'), 'Pekerjaan 01', 0)

CustomKeywords.'general.control.swipeDown'()

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomNegara'), 'Negara 01', 0)

Mobile.setText(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/kolomBerlakuHingga'), 'Seumur Hidup', 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/btnSave'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/btnSubmit'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/selfieKTP'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/btnCaptureSelfie'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/btnUpgrade'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/btnSubmit'), 0)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/Upgrade Account/btnOK'), 0)
