// Generated by the WOLips Templateengine Plug-in at Feb 7, 2007 9:27:22 PM

import com.webobjects.appserver.*;

import er.ajax.*;

public class AjaxGridExampleCellComponent extends WOComponent {

	public String value;
	public AjaxGrid grid;

	public AjaxGridExampleCellComponent(WOContext context) {
		super(context);
	}

	public void deleteRow() {
		grid.displayGroup().deleteObjectAtIndex(grid.displayGroup().allObjects().indexOfObject(grid.row()));
	}
}