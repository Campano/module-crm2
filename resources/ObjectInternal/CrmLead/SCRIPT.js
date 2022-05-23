// CrmLead front side hook
(function(ui) {
	if (!ui) return;
	var app = ui.getAjax();
	// Hook called by each object instance
	Simplicite.UI.hooks.CrmLead = function(o, cbk) {
		try {
			console.log("CrmLead hooks loading...");
			var p = o.locals.ui;
			if (p && o.isMainInstance()) {
				p.form.onload = function(ctn, obj) {
					var f = ui.getUIField(ctn, obj, "crmLeadAccId");
					f.ui.on("change", function() {
						if(f.ui.val()) {
							console.log(f.ui.val());
							var o = $ui.getApp().getBusinessObject('CrmContact', 'ref_ajax_CrmContact');
							
							o.filters = {crmCtcAccId: f.ui.val()};  // reset front filters
						}
				});
				};
			}
		} catch (e) {
			app.error("Error in Simplicite.UI.hooks.CrmLead: " + e.message);
		} finally {
			console.log("CrmLead hooks loaded.");
			cbk && cbk(); // final callback
		}
	};
})(window.$ui);
