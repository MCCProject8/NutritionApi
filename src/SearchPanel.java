import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class SearchPanel extends JPanel {
	
	public JTextField searchField;
	public static JTextArea a;

	public SearchPanel() {
		
		this.setLayout(null);
		this.setBackground(Color.red);
		
		searchField = new JTextField();
		searchField.setBounds(70,50,200,20);
		
		searchField.setText("protein");
		Config.setSearchItem(searchField.getText());
		
		FoodList foodlistpanel = new FoodList();
		foodlistpanel.setBounds(50,100,foodlistpanel.getWidth(),foodlistpanel.getHeight());
		
		GlobalAdapter.adapter.searchForFood();
			
		add(searchField);
		add(foodlistpanel);
		
	}

}
