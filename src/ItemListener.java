import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class ItemListener implements MouseListener {

	public String ITEMID;
	
	public ItemListener(String itemId) {
		
		ITEMID = itemId;
	}

	public ItemListener() {
		// TODO Auto-generated constructor stub
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
		
		for(int i = 0; i < 10; i++)
		{
			if(e.getSource() == Main.label[i])
			{
				Main.label[i].setBackground(Color.decode("#5CADFF"));
			}
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		for(int i = 0; i < 10; i++)
		{
			if(e.getSource() == Main.label[i])
			{

			}
		}
	}
	
	public void setItemId(String itemid){
		ITEMID = itemid;
	}

}
