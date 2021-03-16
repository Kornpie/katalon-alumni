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

WebUI.navigateToUrl('http://localhost/alumni/index.php/welcome/regis')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__fname'), 'แมน')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__lname'), 'รามเรือง')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__idcard'), '0258147369258')

WebUI.click(findTestObject('Object Repository/Page_register-software/label_'))

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__job'), 'โจร')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__tel'), '0852741963')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input_Facebook_face'), 'man')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input_E-mail()_email'), 'man@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__House-No'), '1')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__Moo-home'), '1')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__road-home'), '-')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__Province-home'), 'นครปฐม')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__Area-home'), 'ดอนตูม')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__Sub-area-home'), 'สามง่าม')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__Postal-Code-home'), '74185')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input_()_Tel-home'), '0992126344')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__Work-No'), '1')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__Moo-work'), '1')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__road-work'), '-')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__Province-work'), '')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__Area-work'), 'ดอนตูม')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__Sub-area-work'), 'สามง่าม')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__Postal-Code-work'), '85274')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input_()_Tel-work'), '0992126344')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_register-software/select_              2553              2554_b3bc1e'), 
    '2554', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_register-software/select_              2556              2557_c816f6'), 
    '2558', true)

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__sec'), '61/47')

WebUI.setText(findTestObject('Object Repository/Page_register-software/input__idstd'), '614259026')

WebUI.click(findTestObject('Object Repository/Page_register-software/button_'))

WebUI.verifyTextPresent('เข้าสู่ระบบ', false)

