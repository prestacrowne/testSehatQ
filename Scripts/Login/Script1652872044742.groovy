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

Mobile.startExistingApplication('com.she.sehatq', FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login/android.widget.ImageView'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.ImageView'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login/android.widget.TextView - Log in'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Email'), 'maulana.prestra24@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Password'), 'Sandi123!', 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button - Log in'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login/android.widget.TextView - Maulana'), 0)

Mobile.closeApplication()

