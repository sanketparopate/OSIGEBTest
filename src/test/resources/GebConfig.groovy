

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver

 //Use firefox as the default
 //See: http://code.google.com/p/selenium/wiki/FirefoxDriver
//driver = { new FirefoxDriver() }
driver = { new ChromeDriver() }

environments {
	
	// run as â€œgradle -Dgeb.env=chrome cucumberâ€�
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}
	
	// run as â€œgradle -Dgeb.env=phantomjs cucumberâ€�
	// See: https://github.com/detro/ghostdriver
	phantomjs {
		driver = { new PhantomJSDriver() }
	}

}

baseUrl = "http://localhost:8080/osi-recruitment-portal/main.html"

baseNavigatorWaiting = true