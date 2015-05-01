import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		
		Platform.runLater(new Runnable() { // this will run initFX as JavaFX-Thread
            @Override
            public void run() {
            	WebPanel.initFX(Main.webpanel);
        		WebPanel.load.setVisible(false);
            }
        });
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	public void setItemId(String itemid){
		ITEMID = itemid;
	}
}
