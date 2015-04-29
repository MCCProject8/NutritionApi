

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;

import model.Hit;
import model.NutritionData;


public class ListForItemNames {

	
	public static void getItemNames(NutritionData nutritionData){
		
		for(Hit h: nutritionData.hits)
		{
			FoodList fl = new FoodList(h.fields.itemId, h.fields.itemName, h.fields.brandName, h.fields.nfServingSizeQty, h.fields.nfServingSizeUnit);
		}	
		
	}
	

}
