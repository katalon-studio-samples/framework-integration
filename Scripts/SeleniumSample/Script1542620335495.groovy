import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import test.GoogleSearchPage

WebUI.openBrowser("")

WebDriver driver = DriverFactory.getWebDriver()

// Navigate to the right place
driver.get("http://www.google.com/")

// Create a new instance of the search page class
// and initialise any WebElement fields in it.
GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class)

// And now do the search.
page.searchFor("Katalon Studio")

Thread.sleep(3000)

WebUI.closeBrowser()