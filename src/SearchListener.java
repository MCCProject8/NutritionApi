import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SearchListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Config.setSearchItem(SearchPanel.searchField.getText());
		GlobalAdapter.adapter.searchForFood();
		
		SearchPanel.load.setVisible(true);
		
		for (int i = 0; i < 10; i++)
		{
			Main.label[i].setVisible(false);
		}
		
	}

}
