import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;


public class SearchPanel extends JPanel {
	
	public JTextField searchField;
	
	public SearchPanel(){
		
		setBorder(Borders.blackline);
		setLayout(null);
		
		searchField = new JTextField();
		searchField.setBounds(100, 10,300,20);
		
		
		
		Config.setSearchItem("Chicken");
		GlobalAdapter.adapter.searchForFood();
		
		add(searchField);

	}

}
