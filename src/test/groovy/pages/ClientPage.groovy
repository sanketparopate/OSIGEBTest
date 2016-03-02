package pages

import geb.Page

class ClientPage extends Page {
	
	static content = {
		addButton {$('#rsBtn1')}
		clientName {$('#clientName')}
		locationName {$('#location')}
	}
}
