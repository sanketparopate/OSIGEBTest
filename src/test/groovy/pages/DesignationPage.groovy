package pages

import geb.Page

class DesignationPage extends Page {
	
	static content = {
		addButton {$('#rsBtn1')}
		designation {$('#designation')}
		skills {$('#skills')}
		minExpYear {$('#minExpYear')}
		minExpYear {$('#maxExpYear')}
		
		
	}
}
