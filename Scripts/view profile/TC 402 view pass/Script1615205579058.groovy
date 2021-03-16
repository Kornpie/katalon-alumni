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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/alumni/index.php/welcome/login')

WebUI.setText(findTestObject('Object Repository/Page_/input__idstd'), '614259048')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_/input__login'))

WebUI.click(findTestObject('Object Repository/Page_Show-user/button_'))

WebUI.click(findTestObject('Object Repository/Page_Show-user/a_'))

WebUI.verifyTextPresent('ชื่อ :นาย ศิวกร รามเรือง', false)

WebUI.closeBrowser()

