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

WebUI.openBrowser('https://music.youtube.com/')

WebUI.waitForElementPresent(findTestObject('Page_YouTube Music/music_logo'), 3)

WebUI.click(findTestObject('Page_YouTube Music/btn_search'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_YouTube Music/input_search_box'), 'tulus hati hati di jalan')

WebUI.sendKeys(findTestObject('Page_YouTube Music/input_search_box'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Page_YouTube Music/btn_search_result'), 3)

WebUI.click(findTestObject('Page_YouTube Music/btn_search_result'))

WebUI.waitForElementVisible(findTestObject('Page_HatiHati di Jalan - YouTube Music/music_player'), 3)

WebUI.verifyElementVisible(findTestObject('Page_HatiHati di Jalan - YouTube Music/music_player'))

