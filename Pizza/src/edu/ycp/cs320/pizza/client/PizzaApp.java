package edu.ycp.cs320.pizza.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;

import edu.ycp.cs320.pizza.shared.Pizza;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PizzaApp implements EntryPoint {
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		FlowPanel panel = new FlowPanel();
		
		PizzaView pizzaview = new PizzaView();
		
		panel.add(pizzaview);
		Pizza model = new Pizza();
		pizzaview.setModel(model);
		pizzaview.update();
		
		RootLayoutPanel.get().add(panel);
		RootLayoutPanel.get().setWidgetTopBottom(panel, 10.0, Unit.PX, 10.0, Unit.PX);
		RootLayoutPanel.get().setWidgetLeftRight(panel, 10.0, Unit.PX, 10.0, Unit.PX);
	}
}
