import java.awt.Color;
import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import model.Hit;
import model.NutritionData;

public class Main extends JFrame {
	
	private int WIDTH = 1200;
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
				try {
					frame = new Main();
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame.setVisible(true);			
			}
		});
	} 
	
	public Main() throws MalformedURLException, IOException
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		
		 JTextPane editorpane= new JTextPane();
		 URL page = new URL("nutritionLabel.html");
		 editorpane.setPage(page);
	     
		 editorpane.setBounds(640,25,500,HEIGHT - 100);
		
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
		add(editorpane);
	}

	public static void addJlabel(NutritionData nutritionData) {
		
		int offset = 40;
		int index = 0;
				
		for(Hit h : nutritionData.hits)
		{
			label[index].setText("Brand Name: " + h.fields.brandName + "     Item Name: " + h.fields.itemName);
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
