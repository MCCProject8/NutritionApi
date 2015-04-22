

import model.Hit;
import model.NutritionData;


public class ListForItemNames {

		
	public static void getItemNames(NutritionData nutritionData){
		
		
		for(Hit h: nutritionData.hits)
		{
			SearchPanel.a.append(h.fields.itemName + "\n");
		}
	}

}
