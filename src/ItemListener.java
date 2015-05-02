import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.itemData;
import javafx.application.Platform;


public class ItemListener implements MouseListener {

	public String ITEMID;
	public static ItemList Itemlist;
	
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
		
			for(int i = 0; i < 10; i++)
			{
				if(e.getSource() == Main.label[i])
				{
					Main.label[i].setFocusPainted(false);
					Main.label[i].setFocusable(false);
				}
			}
		
			Main.load.setVisible(true);
    		Main.adapter.getItem();

			
		Platform.runLater(new Runnable() { // this will run initFX as JavaFX-Thread
            @Override
            public void run() {
            	WebPanel.initFX(Main.webpanel, Itemlist);
    			Main.load.setVisible(false);
            }
        });
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	public void setItemId(String itemid){
		ITEMID = itemid;
	}
	
	public static void getItemList(itemData itemD){
		
		Itemlist = new  ItemList(itemD.itemId, itemD.itemName, itemD.brandId, itemD.brandName, itemD.itemDesc, String.valueOf(itemD.waterGrams),
				String.valueOf(itemD.calories), String.valueOf(itemD.calFromFat),String.valueOf(itemD.totalFat), String.valueOf(itemD.satFat), String.valueOf(itemD.transFat),
				String.valueOf(itemD.polyFat),String.valueOf(itemD.monoFat), String.valueOf(itemD.cholesterol), String.valueOf(itemD.sodium), String.valueOf(itemD.totalCarbs), 
				String.valueOf(itemD.dietaryFiber), String.valueOf(itemD.sugar), String.valueOf(itemD.protein), String.valueOf(itemD.vitaminA), String.valueOf(itemD.vitaminC),
				String.valueOf(itemD.calcium), String.valueOf(itemD.iron), String.valueOf(itemD.servingPerContainer), String.valueOf(itemD.servingQty), 
				itemD.servingSizeunit, String.valueOf(itemD.weightGrams));
	}
}
