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
		
		searchField.setText("chicken");
		Config.setSearchItem(searchField.getText());
		
		GlobalAdapter.adapter.searchForFood();
		
		a = new JTextArea();
		
		a.setBounds(30,100,400, 300);
		
		add(searchField);
		add(a);
		
	}

}
