var Model = (function() {

	var data = [];
	var widgets = [];
	var scope;
	var view;

	// Can't use arrow function here
	var constructor = function() {

		// Arrow Function Implemented
		// Works
		this.Add = (item) => {
			data.push(item);
			this.refreshWidgets(view, this);
		};

		// Arrow Function Implemented
		// Works
		this.Delete = (val) => {
			var itemIdx = data.indexOf(val);
			data.splice(itemIdx, 1);
			this.refreshWidgets(view, this);
		
		};

		// Arrow Function Implemented
		// Works
		this.notDuplicate = (val) => {
			result = false;
			if(this.getData().indexOf(val) == -1) {
				result = true;
			}
			return result;
		}

		// Arrow Function Implemented
		// Works
		this.getData = () => {
			return data;
		}
		
		// Arrow Function Implemented
		// Works
		this.getCount = () => {
			return data.length;
		};
		
		// Arrow Function Implemented
		// Works
		this.setScope = (s) => {
			scope = s;
		};
		
		// Arrow Function Implemented
		// Works
		this.setView = (v) => {
			view = v;
		};
		
		// Arrow Function Implemented
		// Works
		this.registerWidget = (widget) => {
			// expect view to have it's refresh method
			widgets.push(widget);
		};
		
		// Arrow Function Implemented
		// Works
		this.refreshWidgets = (mainview, model) => {
			// will loop if any views are around and invoke their refresh method
			var x; l = widgets.length;
			if(l) {
				for(x = 0; x < l; x++) {
					widgets[x].refresh.apply(widgets[x], [mainview, scope, model]);
				}
			}		
		};
		
		// for testing content in console.log();
		// Arrow Function Implemented
		// Works
		this.toString = () => {
			return data.split(",");
		};
		
	};
	
	return new constructor();
	
});