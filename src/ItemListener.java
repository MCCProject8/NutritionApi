import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ItemListener implements MouseListener {

	public String ITEMID;
	
	public ItemListener(String itemId) {
		
		ITEMID = itemId;
	}

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
		System.out.println(ITEMID);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {}

}
