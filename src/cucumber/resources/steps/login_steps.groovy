/**
 * Example of writing custom application-specific steps
 */

import pages.*

import static cucumber.api.groovy.EN.*
//import org.openqa.selenium.firefox.FirefoxDriver

Given(~/I am on the Osi home page/) { ->
//driver = { new FirefoxDriver() }
	to OsiHomePage
}


When(~/^I click on signin with google$/) { ->
page.signin.click()
sleep(50000)	


When(~/^I enter valid credentials$/) { ->
withWindow("myWindow") {
        assert title == "Sign - Google Accounts - Google Chrome"
    }





//browser.find("#signInG").click()
/*withWindow( {$('title').text() == 'Sign in - Google Accounts' }){
	sleep(20000)	
	browser.find("#Email").value("pavan247215@gmail.com")
	
 */
}
}

