import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
//
//class Transaksi_Cash {
//String totalIncome, todayIncome, trxBayarind, trxNonBayarind, totalSoldItem, totalWithdrawal, saldoMerchant
//int beforeTotalIncome, beforeTodayIncome, beforeTrxBayarind, beforeTrxNonBayarind, beforeTotalSoldItem, beforeTotalWithdrawal, beforeSaldoMerchant
//int afterTotalIncome, afterTodayIncome, afterTrxBayarind, afterTrxNonBayarind, afterTotalSoldItem, afterTotalWithdrawal, afterSaldoMerchant
//int selisihTotalIncome, selisihTodayIncome, selisihTrxBayarind, selisihTrxNonBayarind, selisihTotalSoldItem, selisihTotalWithdrawal, selisihSaldoMerchant
//
//	@BeforeTestCase
//	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
//		Mobile.startExistingApplication('sprintasia.tech.pasarind')
//			
//		totalIncome = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalPendapatan'), 0).replace('Rp', '0').replace('.', '')
//		todayIncome = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/pendapatanHariIni'), 0).replace('Rp', '0').replace('.', '')
//		CustomKeywords.'general.control.swipeDown'()
//		trxBayarind = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/trxBayarind'), 0).replace('Rp', '0').replace('.', '')
//		trxNonBayarind = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/trxNonBayarind'), 0).replace('Rp', '0').replace('.', '')
//		totalSoldItem = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalSoldItem'), 0)
//		totalWithdrawal = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalWithdrawal'), 0).replace('Rp', '0').replace('.', '')
//		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/withdrawal'), 0)
//		saldoMerchant = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Withdrawal/balanceMerchant'), 0).replace('Rp', '0').replace('.', '')
//		Mobile.pressBack()
//		CustomKeywords.'general.control.swipeUp'()
//		beforeTotalIncome = Integer.parseInt(totalIncome)
//		beforeTodayIncome = Integer.parseInt(todayIncome)
//		beforeTrxBayarind = Integer.parseInt(trxBayarind)
//		beforeTrxNonBayarind = Integer.parseInt(trxNonBayarind)
//		beforeTotalSoldItem = Integer.parseInt(totalSoldItem)
//		beforeTotalWithdrawal = Integer.parseInt(totalWithdrawal)
//		beforeSaldoMerchant = Integer.parseInt(saldoMerchant)
//	}
//	
//	@AfterTestCase
//	def sampleAfterTestCase(TestCaseContext testCaseContext) {
//		totalIncome = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalPendapatan'), 0).replace('Rp', '0').replace('.', '')
//		todayIncome = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/pendapatanHariIni'), 0).replace('Rp', '0').replace('.', '')
//		CustomKeywords.'general.control.swipeDown'()
//		trxBayarind = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/trxBayarind'), 0).replace('Rp', '0').replace('.', '')
//		trxNonBayarind = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/trxNonBayarind'), 0).replace('Rp', '0').replace('.', '')
//		totalSoldItem = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalSoldItem'), 0)
//		totalWithdrawal = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/totalWithdrawal'), 0).replace('Rp', '0').replace('.', '')
//		Mobile.tap(findTestObject('Object Repository/Pasarind/Smallscreen/Homepage/withdrawal'), 0)
//		saldoMerchant = Mobile.getText(findTestObject('Object Repository/Pasarind/Smallscreen/Withdrawal/balanceMerchant'), 0).replace('Rp', '0').replace('.', '')
//		Mobile.pressBack()
//		CustomKeywords.'general.control.swipeUp'()
//		afterTotalIncome = Integer.parseInt(totalIncome)
//		afterTodayIncome = Integer.parseInt(todayIncome)
//		afterTrxBayarind = Integer.parseInt(trxBayarind)
//		afterTrxNonBayarind = Integer.parseInt(trxNonBayarind)
//		afterTotalSoldItem = Integer.parseInt(totalSoldItem)
//		afterTotalWithdrawal = Integer.parseInt(totalWithdrawal)
//		afterSaldoMerchant = Integer.parseInt(saldoMerchant)
//		
//		
//		selisihTotalIncome = afterTotalIncome - beforeTotalIncome
//		selisihTodayIncome = afterTodayIncome - beforeTodayIncome
//		selisihTrxBayarind = afterTrxBayarind - beforeTrxBayarind
//		selisihTrxNonBayarind = afterTrxNonBayarind - beforeTrxNonBayarind
//		selisihTotalSoldItem = afterTotalSoldItem - beforeTotalSoldItem
//		selisihSaldoMerchant = afterSaldoMerchant - beforeSaldoMerchant
//		
//		println('==================================================================\n' +
//			'Total Pendapatan Sebelum Transaksi = ' +beforeTotalIncome+ '\n' +
//			'Pendapatan Hari Ini Sebelum Transaksi = ' +beforeTodayIncome+ '\n'+
//			'Transaksi Bayarind Sebelum Transaksi = ' +beforeTrxBayarind+ '\n' +
//			'Transaksi Lainnya Sebelum Transaksi = ' +beforeTrxNonBayarind+ '\n'+
//			'Product Terjual Sebelum Transaksi = ' +beforeTotalSoldItem+ '\n'+
//			'Saldo Merchant Sebelum Transaksi= ' +beforeSaldoMerchant+ '\n'+
//			'==================================================================\n'+
//			'==================================================================\n'+
//			'Total Pendapatan Setelah Transaksi = ' +afterTotalIncome+ '\n' +
//			'Pendapatan Hari Ini Setelah Transaksi = ' +afterTodayIncome+ '\n'+
//			'Transaksi Bayarind Transaksi Transaksi = ' +afterTrxBayarind+ '\n' +
//			'Transaksi Lainnya Setelah Transaksi = ' +afterTrxNonBayarind+ '\n' +
//			'Product Terjual Setelah Transaksi = ' +afterTotalSoldItem+ '\n' +
//			'Saldo Merchant Setelah Transaksi =' +afterSaldoMerchant+ '\n' +
//			'==================================================================\n' +
//			'=========================SELISIH==================================\n' +
//			'Total Pendapatan = ' +selisihTotalIncome+ '\n' +
//			'Pendapatan Hari Ini = ' +selisihTodayIncome+ '\n' +
//			'Transaksi Bayarind = ' +selisihTrxBayarind+ '\n' +
//			'Transaksi Lainnya = ' +selisihTrxNonBayarind + '\n' + 
//			'Product Terjual =' +selisihTotalSoldItem+ '\n' +
//			'Saldo Merchant =' +selisihSaldoMerchant+ '\n'+
//			'=========================SELISIH==================================\n' ) 
//	}
//}