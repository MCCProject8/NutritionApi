import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import designComponents.Borders;

@SuppressWarnings("serial")
public class SearchPanel extends JPanel {
	
	public static JTextField searchField;
	public static JButton searchButton;
	public static JLabel load;
	public static ImageIcon errorMessage;
	public static JLabel error;
	
	public SearchPanel(){
		
		setBorder(Borders.blackline);
		setBackground(Color.blue);
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
		
		errorMessage = new ImageIcon("ErrorMessage.jpg");
		error = new JLabel("<html><body>Please check your Internet connection<br> and try again</body></html>",errorMessage, JLabel.CENTER);
		error.setBounds(10,100,errorMessage.getIconWidth() + 300,errorMessage.getIconHeight());
		error.setVisible(false);
		
		add(error);
	    add(load);
		add(searchField);
		add(searchButton);
	}
}
