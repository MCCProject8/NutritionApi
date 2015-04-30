import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SearchPanel extends JPanel {
	
	public static JTextField searchField;
	public JButton searchButton;
	public static JLabel load;
	
	public SearchPanel(){
		
		setBorder(Borders.blackline);
		setLayout(null);
		
		searchField = new JTextField();
		searchField.setBounds(100, 10,280,20);
		
		searchButton = new JButton("Search");
		searchButton.setBounds(400, 10,80,20);
		searchButton.addActionListener(new SearchListener());
		
		ImageIcon loading = new ImageIcon("ajax-loader.gif");
	    load = new JLabel("loading... ", loading, JLabel.CENTER);
	    load.setBounds(200,100,100,40);
		SearchPanel.load.setVisible(false);


	    add(load);
		add(searchField);
		add(searchButton);

	}

}
