import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


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
	}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	public void setItemId(String itemid){
		ITEMID = itemid;
	}
}
