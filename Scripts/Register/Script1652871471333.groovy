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

Mobile.waitForElementPresent(findTestObject('Object Repository/Register/android.widget.ImageView'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - Daftar'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Nama Lengkap'), 'Maulana', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Email'), 'maulana.prestra25@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Password'), 'Sandi123!', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.CheckBox'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Daftar'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Register/android.widget.TextView - Lengkapi Profil'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - No. Telepon'), '081321516146', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Tanggal lahir'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Pilih'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Jenis Kelamin'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - Laki-laki'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Jenis Identitas'), 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.TextView - KTP'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - No. Identitas'), '320427251221015', 
    0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.Button - Lanjut'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText'), '0161', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText (1)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText (2)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText (3)'), '1', 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Register/android.widget.TextView - Verifikasi Berhasil'), 
    0)

Mobile.closeApplication()

