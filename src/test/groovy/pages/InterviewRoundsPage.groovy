package pages

import geb.Page

class InterviewRoundsPage extends Page {
	
	static content = {
		addButton {$('#rsBtn1')}
		designation {$('designation')}
		skills {$('skills')}
		minExpYear {$('minExpYear')}
		minExpYear {$('maxExpYear')}
		
		
	}
}
