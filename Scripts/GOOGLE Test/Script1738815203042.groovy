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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://playwright.dev/')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Page_Fast and reliable end-to-end testing f_6ed2b1/a_Get started'))

WebUI.click(findTestObject('Object Repository/Page_Installation  Playwright/a_Writing tests'))

WebUI.click(findTestObject('Object Repository/Page_Writing tests  Playwright/a_Getting started'))

WebUI.click(findTestObject('Object Repository/Page_Installation  Playwright/span_Search'))

WebUI.setText(findTestObject('Object Repository/Page_Installation  Playwright/input_Search_docsearch-input'), 'web')

WebUI.click(findTestObject('Object Repository/Page_Installation  Playwright/mark_Web'))

WebUI.click(findTestObject('Object Repository/Page_WebView2  Playwright/div_Migrating from Protractor'))

WebUI.closeBrowser()

