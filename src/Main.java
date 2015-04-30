import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Hit;
import model.NutritionData;

public class Main extends JFrame {
	
	private int WIDTH = 1000;
	private int HEIGHT = 450;
	
	public static JButton label;
	public static SearchPanel searchpanel;
	
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			
			Main frame;
			
			@Override
			public void run()
			{				
				frame = new Main();
				frame.setVisible(true);			
			}
		});
	} 
	
	public Main()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		
		searchpanel = new SearchPanel();
		searchpanel.setBounds(10,25,WIDTH / 2,HEIGHT - 100);
		
		add(searchpanel);
	}

	public static void addJlabel(NutritionData nutritionData) {
		
		int offset = 40;
		
		for(Hit h : nutritionData.hits)
		{
			label = new JButton();
			label.setText(h.fields.itemName);
			label.setBounds(40,offset,400,20);
			label.addMouseListener(new ItemListener(h.fields.itemId));
		
			offset += 30;

			searchpanel.add(label);			
			System.out.println(h.fields.itemName + " " + h.fields.itemId);
		}
		
		searchpanel.revalidate();
		searchpanel.repaint();
		
	}	
}
