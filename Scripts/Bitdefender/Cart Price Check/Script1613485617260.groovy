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

WebUI.navigateToUrl('https://www.bitdefender.com/')

WebUI.click(findTestObject('Cart Price Check/Page_Bitdefender - Global Leader in Cyberse_298fa5/a_OK'))

WebUI.click(findTestObject('Cart Price Check/Page_Bitdefender - Global Leader in Cyberse_298fa5/a_See Solutions'))

WebUI.click(findTestObject('Cart Price Check/Page_Bitdefender Security Software Solution_2662fa/img'))

WebUI.click(findTestObject('Cart Price Check/Page_Bitdefender Security Software Solution_2662fa/a_Buy Now'))

WebUI.click(findTestObject('Cart Price Check/Page_Bitdefender - Get protection/span_60.65'))

WebUI.verifyElementText(findTestObject('Cart Price Check/Page_Bitdefender - Get protection/span_60.65'), 
    '60.65 €')

