import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javafx.application.Platform;


public class ItemListener implements MouseListener {

	public String ITEMID;
	
	public ItemListener(String itemId) {
		
		ITEMID = itemId;
	}

	public ItemListener() {}

	@Override
	public void mouseClicked(MouseEvent arg0) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent e) {
		Config.setItemId(ITEMID);
		Main.adapter.getItem();
		
			for(int i = 0; i < 10; i++)
			{
				if(e.getSource() == Main.label[i])
				{
					Main.label[i].setFocusPainted(false);
					Main.label[i].setFocusable(false);
				}
			}
		
			Main.load.setVisible(true);
			
		Platform.runLater(new Runnable() { // this will run initFX as JavaFX-Thread
            @Override
            public void run() {
            	WebPanel.initFX(Main.webpanel);
    			Main.load.setVisible(false);
            }
        });
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	public void setItemId(String itemid){
		ITEMID = itemid;
	}
}
