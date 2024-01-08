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

WebUI.click(findTestObject('Object Repository/Homepage/Page_OrangeHRM/p_(11) Leave Requests to Approve'))

WebUI.click(findTestObject('Object Repository/Homepage/Page_OrangeHRM/span_Admin'))

WebUI.click(findTestObject('Object Repository/Homepage/Page_OrangeHRM/span_PIM'))

WebUI.click(findTestObject('Object Repository/Homepage/Page_OrangeHRM/span_Leave'))

WebUI.click(findTestObject('Object Repository/Homepage/Page_OrangeHRM/span_Time'))

WebUI.click(findTestObject('Object Repository/Homepage/Page_OrangeHRM/i_Timesheets_oxd-icon bi-caret-down-fill ox_af480c'))

WebUI.click(findTestObject('Object Repository/Homepage/Page_OrangeHRM/a_Logout'))

