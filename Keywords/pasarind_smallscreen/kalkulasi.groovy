package pasarind_smallscreen

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.GetText
import internal.GlobalVariable

public class kalkulasi {


	String totalIncome, todayIncome, trxBayarind, trxNonBayarind, totalSoldItem, totalWithdrawal, saldoMerchant
	int beforeTotalIncome, beforeTodayIncome, beforeTrxBayarind, beforeTrxNonBayarind, beforeTotalSoldItem, beforeTotalWithdrawal, beforeSaldoMerchant

	@Keyword
	def getValueHomepageBeforeTrx(){
		totalIncome = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalPendapatan'), 0).replace('Rp', '0').replace('.', '')
		todayIncome = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/pendapatanHariIni'), 0).replace('Rp', '0').replace('.', '')
		CustomKeywords.'general.control.swipeDown'()
		trxBayarind = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/trxBayarind'), 0).replace('Rp', '0').replace('.', '')
		trxNonBayarind = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/trxNonBayarind'), 0).replace('Rp', '0').replace('.', '')
		totalSoldItem = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalSoldItem'), 0)
		totalWithdrawal = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalWithdrawal'), 0).replace('Rp', '0').replace('.', '')
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/withdrawal'), 0)
		saldoMerchant = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Withdrawal/balanceMerchant'), 0).replace('Rp', '0').replace('.', '')
		Mobile.pressBack()
		CustomKeywords.'general.control.swipeDown'()
		beforeTotalIncome = Integer.parseInt(totalIncome)
		beforeTodayIncome = Integer.parseInt(todayIncome)
		beforeTrxBayarind = Integer.parseInt(trxBayarind)
		beforeTrxNonBayarind = Integer.parseInt(trxNonBayarind)
		beforeTotalSoldItem = Integer.parseInt(totalSoldItem)
		beforeTotalWithdrawal = Integer.parseInt(totalWithdrawal)
		beforeSaldoMerchant = Integer.parseInt(saldoMerchant)
		println(beforeTodayIncome)
	}

	int afterTotalIncome, afterTodayIncome, afterTrxBayarind, afterTrxNonBayarind, afterTotalSoldItem, afterTotalWithdrawal, afterSaldoMerchant

	@Keyword
	def getValueHomepageAfterTrx() {
		totalIncome = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalPendapatan'), 0).replace('Rp', '0').replace('.', '')
		todayIncome = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/pendapatanHariIni'), 0).replace('Rp', '0').replace('.', '')
		CustomKeywords.'general.control.swipeDown'()
		trxBayarind = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/trxBayarind'), 0).replace('Rp', '0').replace('.', '')
		trxNonBayarind = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/trxNonBayarind'), 0).replace('Rp', '0').replace('.', '')
		totalSoldItem = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalSoldItem'), 0)
		totalWithdrawal = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalWithdrawal'), 0).replace('Rp', '0').replace('.', '')
		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/withdrawal'), 0)
		saldoMerchant = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Withdrawal/balanceMerchant'), 0).replace('Rp', '0').replace('.', '')
		Mobile.pressBack()
		CustomKeywords.'general.control.swipeDown'()
		afterTotalIncome = Integer.parseInt(totalIncome)
		afterTodayIncome = Integer.parseInt(todayIncome)
		afterTrxBayarind = Integer.parseInt(trxBayarind)
		afterTrxNonBayarind = Integer.parseInt(trxNonBayarind)
		afterTotalSoldItem = Integer.parseInt(totalSoldItem)
		afterTotalWithdrawal = Integer.parseInt(totalWithdrawal)
		afterSaldoMerchant = Integer.parseInt(saldoMerchant)
	}
}
