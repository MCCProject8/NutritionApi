import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SearchPanel extends JPanel {
	
	public static JTextField searchField;
	public JButton searchButton;
	
	public SearchPanel(){
		
		setBorder(Borders.blackline);
		setLayout(null);
		
		searchField = new JTextField();
		searchField.setBounds(100, 10,280,20);
		
		searchButton = new JButton("Search");
		searchButton.setBounds(400, 10,80,20);
		searchButton.addActionListener(new SearchListener());

	
		add(searchField);
		add(searchButton);

	}

}
