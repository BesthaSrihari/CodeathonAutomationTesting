import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SocialMedia {
	@Given("Open Browser")
	def open_Browser() {
		WebUI.openBrowser('')
		WebUI.delay(6)
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(GlobalVariable.URL)
	}

	@Then("Click and Verify SignUp page")
	def signUp_Page() {
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/SocialMedia/SignUp'))
	}

	@Then("Fill Mandatory Fields of SignUp Page")
	def fill_signUP_Page() {
		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_UserName'), 'srihari')
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_Email_signUP'), 'srihari@gmail.com')
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_Password_Signup'), 'Srihari@123')
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_confirmPassword'), 'Srihari@123')
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/SocialMedia/Submit'))
	}

	@Then("Verify the vaildation of Password and Confirm Password")
	def validation_Pass_Confirm_Pass() {
		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_UserName'), 'srihari')
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_Email_signUP'), 'Srihari@gmail.com')
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_Password_Signup'), 'Srihari@123')
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_confirmPassword'), '@123')
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/SocialMedia/Submit'))
	}

	@Then("Verify the Error Message")
	def verify_error_Message() {
		WebUI.delay(3)
		WebUI.verifyElementPresent(findTestObject('Object Repository/SocialMedia/Pass_error'),10)
	}
	@Then("Enter valid Credentials")
	def enter_Valid_creds() {
		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_Email'),'srihari@gmail.com')
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_Password'), 'Srihari@123')
	}


	@Then("Enter Invalid Credentials")
	def enter_InValid_creds() {
		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_Email'),'sri@gmail.com')
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_Password'), 'Sri@1234')
	}

	@Then("Enter Blank Credentials")
	def enter_Blank_creds() {
		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_Email'),'')
		WebUI.setText(findTestObject('Object Repository/SocialMedia/input_Password'), '')
	}

	@Then("Verify User is able to login or not")
	def user_login() {
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/SocialMedia/btn_Login'))
		if(WebUI.verifyElementPresent(findTestObject('Object Repository/SocialMedia/GitHub_DashBoard'), 0)) {
			println("Credentials are valid")
		}
		else {
			println("Credentials are invalid")
		}
	}
	
	@Then("Verify the Search box in dashboard page")
	def Verify_search_Box() {
		WebUI.delay(3)
		WebUI.verifyElementPresent(findTestObject('Object Repository/SocialMedia/Search_Box'),10)
	}
	
	@Then("Verify functionalities of dashboard")
	def verify_dashboard() {
		WebUI.delay(3)
		WebUI.verifyElementPresent(findTestObject('Object Repository/SocialMedia/Search_Box'),10)
		WebUI.verifyElementPresent(findTestObject('Object Repository/SocialMedia/Project Stats'),10)
		WebUI.verifyElementPresent(findTestObject('Object Repository/SocialMedia/Repositories by Year'),10)
	}
}