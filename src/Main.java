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
	
	public static JButton[] label = new JButton[10];
	public static SearchPanel searchpanel;
	public static Adapter adapter = new Adapter();
	public static ItemListener[] itemListener = new ItemListener[10];
	
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
		setResizable(false);
		
		searchpanel = new SearchPanel();
		searchpanel.setBounds(10,25,WIDTH / 2,HEIGHT - 100);
		
		for (int i = 0; i < 10; i++)
		{
			itemListener[i] = new ItemListener();
			
			label[i] = new JButton();
			label[i].setVisible(false);
			label[i].addMouseListener(itemListener[i]);
	
			searchpanel.add(label[i]);
		}
		
		add(searchpanel);
	}

	public static void addJlabel(NutritionData nutritionData) {
		
		int offset = 40;
		int index = 0;
				
		for(Hit h : nutritionData.hits)
		{
			label[index].setText(h.fields.itemName);
			label[index].setBounds(40,offset,400,20);
			label[index].setVisible(true);
			itemListener[index].setItemId(h.fields.itemId);
		
			offset += 30;
			
			index++;
		}
			
		searchpanel.revalidate();
		searchpanel.repaint();

		
	}	
}
