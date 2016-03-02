import pages.*

import static cucumber.api.groovy.EN.*

Given(~/I am on the Dashboard page/) { ->
to OsiHomePage
page.signin.click()
sleep(50000)
}

 When(~/I Click on Admin Page/) { ->
 
 page.admin.click()
 sleep(50000)
 
 }
 
 
When(~/ Add Client name and location/) { 
 page.client.click()

}

