var View = (function() {

	// Can't use arrow function here
	var constructor = function() {
	
		this.triggerField = function() {
			var html = [
				"<div class='triggerContainerWrap'>",
					"<input type='text' placeholder='Add items' class='triggerText'></input>",
					"<button type='button' class='triggerButton'>Add</button>",
				"</div>"
			].join("");
			
			// Can't use arrow function here
			var constructor = function() {
			
				// Arrow Function Implemented
				// Works
				this.widget = () => {
					return html;
				};
				
				// Arrow Function Implemented
				// Works
				this.getButtonInstance = (contextEl) => {
					return contextEl.getElementsByClassName('triggerButton')[0];
				}
				
				// Arrow Function Implemented
				// Works
				this.getTextInstance = (contextEl) => {
					return contextEl.getElementsByClassName('triggerText')[0];
				}
			
			}
			
			return new constructor;
		};
		
		// Arrow Function Implemented
		// Works
		this.listView = () => {
			var html = [
			
				"<div class='listContainerWrap'>",
					"<ul class='listWrapper'>",
					"</ul>",
				"</div>"
			
			].join("");
			
			// Can't use arrow function here
			var constructor = function() {
			
				// Arrow Function Implemented
				// Works
				this.widget = () => {
					return html;
				}
				
				// Arrow Function Implemented
				// Works
				this.refresh = (mainView, contextEl, model) => {
					var listView = this;
					var ulContainer = contextEl.getElementsByClassName('listWrapper')[0];
					ulContainer.innerHTML = "";
					var count = model.getCount();
					var rows = [];
					var row;
					var data;
					var x;
					if(count > 0) {
						data = model.getData();
						for(x = 0; x < count; x++) {
							rows.push(mainView.listViewItem(data[x]));
						}
						ulContainer.innerHTML = rows.join("");
					}				}
				
				
				
			};
			
			return new constructor;
			
			
		
		};
		
		// Arrow Function Implemented
		// Works
		this.listViewItem = (text) => {
		
			var html = [
				"<li class='listItemWrap'>",
					"<span class='listItemTextWrap'>",
					text,
					"</span>",
					"<button type='button' value='",
					text,
					"' class='listItemButton'>Delete</button>",
				"</li>"
			].join("");
			
			return html;
		
		}

		// Arrow Function Implemented
		// Works
		this.emptyListItem = () => {
		
			var html = [
				"<li class='listItemWrap'>",
					"<span class='listItemTextWrap'>",
					"",
					"</span>",
				"</li>"
			].join("");
			
			return html;
		
		}

		// Arrow Function Implemented
		// Works
		this.summaryView = () => {
		
			var html = [
			
				"<div class='summaryViewWrapper'>",
					"<div class='summaryViewContent'></div>",					
				"</div>"
			
			].join("");
			
			// Can't use arrow function here
			var constructor = function() {
			

				// Arrow Function Implemented
				// Works
				this.widget = () => {
					return html;
				}
				
				// Arrow Function Implemented
				// Works
				this.refresh = (mainView, contextEl, model) => {
				
					var listView = this;
					var summaryContent = contextEl.getElementsByClassName('summaryViewContent')[0];
					summaryContent.innerHTML = "";
					var count = model.getCount();
					var msg = "";
					switch(count) {
						case 0:
							msg = "There are no items in the store.";
						break
						
						case 1:
							msg = "There is one item in the store.";
						break;
						
						default:
							msg = "There are " + count + " items in the store.";
						break;
					
					}
					summaryContent.innerHTML = msg;
				}
				
			};
			
			return new constructor;
		}
		
		// Arrow Function Implemented
		// Works
		this.getLayout = () => {
			var layout = [
				this.triggerField().widget(),
				this.listView().widget(),
				this.summaryView().widget()
			].join("");
			
			return layout;
		}
		
	};
	
	return new constructor();
	
})();