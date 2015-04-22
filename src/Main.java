import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;

import model.Hit;
import model.NutritionData;
import model.itemData;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import service.GetSearchFood;

public class Main extends JFrame {
	
	private int WIDTH = 1000;
	private int HEIGHT = 450;

	public static void main(String[] args) {

		
		EventQueue.invokeLater(new Runnable() {
			
			Main frame;
			
			@Override
			public void run(){
					
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
		
		SearchPanel searchPanel = new SearchPanel();
		searchPanel.setBounds(0, 0, WIDTH / 2, HEIGHT);
		
		add(searchPanel);

	}

	
}
