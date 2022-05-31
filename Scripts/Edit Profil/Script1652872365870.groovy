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

Mobile.startExistingApplication('com.she.sehatq')

Mobile.waitForElementPresent(findTestObject('Object Repository/Edit Profil/android.widget.ImageView'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Edit Profil/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Edit Profil/android.widget.TextView - Lihat Profil'), 0)

Mobile.scrollToText('Edit Profil', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Edit Profil/android.widget.Button - Edit Profil'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profil/android.widget.EditText - Preestra'), 'Maulana', 0)

Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Edit Profil/android.widget.Button - Simpan'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Edit Profil/android.widget.TextView - Perubahan Berhasil Disimpan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Edit Profil/android.widget.Button - Ok'), 0)

Mobile.waitForElementPresent(findTestObject('Edit Profil/android.widget.TextView - Maulana'), 0)

Mobile.scrollToText('Edit Profil', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Edit Profil/android.widget.Button - Edit Profil'), 0)

Mobile.setText(findTestObject('Object Repository/Edit Profil/android.widget.EditText - Maulana'), 'Preestra', 0)

Mobile.scrollToText('Simpan', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Edit Profil/android.widget.Button - Simpan'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Edit Profil/android.widget.TextView - Perubahan Berhasil Disimpan'), 
    0)

Mobile.tap(findTestObject('Object Repository/Edit Profil/android.widget.Button - Ok'), 0)

Mobile.waitForElementPresent(findTestObject('Edit Profil/android.widget.TextView - Preestra'), 0)

Mobile.closeApplication()

