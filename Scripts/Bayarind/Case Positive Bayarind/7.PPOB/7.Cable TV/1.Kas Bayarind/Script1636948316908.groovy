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

String kasAwalBayarind = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/Homepage/saldoKasBayarind'), 0).replace('.', '')

int intKasAwalBayarind = Integer.parseInt(kasAwalBayarind)

CustomKeywords.'bayarind.ppob.ppobTVCable'()

CustomKeywords.'bayarind.ppob.transaksiTVCable'()

String amount = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/PPOB/TV Cable/amountPelanggan'), 0).replace('Rp', '').replace('.', '')
String transactionFee = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/PPOB/TV Cable/transactionFeePelanggan'), 0).replace('Rp', '').replace('.', '')

Mobile.delay(1)
CustomKeywords.'general.control.swipeDown'()

String actualTotalBill = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/PPOB/TV Cable/totalBillPelanggan'), 0).replace('Rp', '').replace('.', '')

int intAmount = Integer.parseInt(amount)
int intTransactionFee = Integer.parseInt(transactionFee)

String expectTotalBill = intAmount + intTransactionFee

Mobile.verifyMatch(actualTotalBill, expectTotalBill, false)

Mobile.tap(findTestObject('Object Repository/Bayarind/Android/PPOB/TV Cable/btnNext') ,0)

String totalPayment = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/Payment Method/totalPayment'), 0).replace('Rp', '').replace('.', '')
Mobile.verifyMatch(actualTotalBill, totalPayment, false)

int intTotalPayment = Integer.parseInt(totalPayment)

String expectKasBayarind = (intKasAwalBayarind - intTotalPayment)

CustomKeywords.'bayarind.payment.kasBayarind'()

CustomKeywords.'bayarind.control.inputPINBayarind'()

CustomKeywords.'bayarind.control.doneTransactionPPOB'()

Mobile.delay(2)

String actualKasBayarind = Mobile.getText(findTestObject('Object Repository/Bayarind/Android/Homepage/saldoKasBayarind'), 0).replace('.', '')

println('============================================ \n'+
	'Kas awal bayarind = '+kasAwalBayarind+ '\n'+
	'total payment = ' +totalPayment+ '\n'+
	'kas akhir bayarind = ' +actualKasBayarind+ '\n'+
	'============================================ \n')

if (Mobile.verifyMatch(actualKasBayarind, expectKasBayarind, true) == true) {
	println('SALDO SESUAI!')
} else {
	println('ERROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOR')
}