package pages

import geb.Page

class OsiHomePage extends Page {
	static at = { title == "Nisum Technologies" }
	
	static content = {
		signin {$('#signInG')}
		headings { $('#main h1') }
		admin{ $('#admin') }
		reports{ $(By.xpath('//*[@id="wrapper"]/div[1]/div[1]/div[2]/ul/li[4]/a/span'))}
		//admin {$(By.className("glyphicon glyphicon-user"))}
		//admin {$('//*[@id="wrapper"]/div[1]/ div[1]/div[2]/ul/li[5]/a/comment()')}
		client{ $('html.ng-scope.mdl-js body.ng-scope.block-ui.block-ui-anim-fade div#wrapper div.inner-container center div.ng-scope div.ng-scope md-content.md-padding.mdl-shadow--4dp.md-default-theme md-tabs.abc.ng-isolate-scope.md-default-theme md-tabs-wrapper md-tabs-canvas md-pagination-wrapper md-tab-item.md-tab.ng-scope.ng-isolate-scope.md-active span.ng-scope') }
		
		//$(By.xpath('//p[@class="xpath"]'))
	}
}
