package edu.ycp.cs320.pizza.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.ListBox;

import edu.ycp.cs320.pizza.shared.Pizza;
import edu.ycp.cs320.pizza.shared.Size;

public class PizzaView extends Composite {
		private Pizza model;
		
		private InlineLabel sizeLabl;
		private InlineLabel toppingsLabel;
		private ListBox sizeComboBox;
		
		public PizzaView(){
			LayoutPanel layoutPanel = new LayoutPanel();
			initWidget(layoutPanel);
			
			sizeLabl = new InlineLabel("Size");
			layoutPanel.add(sizeLabl);
			layoutPanel.setWidgetLeftWidth(sizeLabl, 27.0, Unit.PX, 90.0, Unit.PX);
			layoutPanel.setWidgetTopHeight(sizeLabl, 55.0, Unit.PX, 18.0, Unit.PX);
			
			toppingsLabel = new InlineLabel("Toppings");
			layoutPanel.add(toppingsLabel);
			layoutPanel.setWidgetLeftWidth(toppingsLabel, 27.0, Unit.PX, 90.0, Unit.PX);
			layoutPanel.setWidgetTopHeight(toppingsLabel, 103.0, Unit.PX, 18.0, Unit.PX);
			
			sizeComboBox = new ListBox();
			layoutPanel.add(sizeComboBox);
			layoutPanel.setWidgetLeftWidth(sizeComboBox, 173.0, Unit.PX, 177.0, Unit.PX);
			layoutPanel.setWidgetTopHeight(sizeComboBox, 55.0, Unit.PX, 26.0, Unit.PX);
		}
		
		public void setModel(Pizza model){
			this.model = model;
		}
		
		public void update() {
			
			if(sizeComboBox.getItemCount() == 0){
				Size[] sizes = Size.values();
				for()
			}

	}
}
