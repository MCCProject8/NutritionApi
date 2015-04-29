import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import model.NutritionData;

//	FoodList.java by Kyle Wolff and Brandon VanderMey on 4/22/2015


//	Example of request: https://api.nutritionix.com/v1_1/search/turkey?results=0:10&appId=781dbb8d&appKey=e77d941048fab5a248b15903bf9fdca4
//	Fields that we will use that the example request returns:
//		"item_id": "513fceb475b8dbbc210008e6"
//		"item_name": "Turkey - 0.5 breast, bone removed"
//		"brand_name": "USDA"
//		"nf_serving_size_qty": 1
//		"nf_serving_size_unit": "serving"

public class FoodList extends JPanel implements MouseListener
{
	private String itemID;
	private String itemName;
	private String brandName;
	private int ServingSizeQty;
	private String ServingSizeUnit;
	
	public static JLabel x;
	
	public FoodList(String itemID, String itemName, String brandName, int ServingSizeQty, String ServingSizeUnit)
	{
		this.itemID = itemID;
		this.itemName = itemName;
		this.brandName = brandName;
		this.ServingSizeQty = ServingSizeQty;
		this.ServingSizeUnit = ServingSizeUnit;
	}
	
	
	public FoodList()
	{
		setSize(400,300);
		setBackground(Color.blue);
		
		x = new JLabel("Hello");
	
		
		add(x);
		
	}
	
	
	//	Getters:
	public String getItemID()
	{
		return itemID;
	}
	
	public String getItemName()
	{
		return itemName;
	}
	
	public String getBrandName()
	{
		return brandName;
	}
	
	public int getServingSizeQty()
	{
		return ServingSizeQty;
	}
	
	public String getServingSizeUnit()
	{
		return ServingSizeUnit;
	}
	
	//	Setters:
	public void setItemID(String itemID)
	{
		this.itemID = itemID;
	}
	
	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}
	
	public void setBrandName(String brandName)
	{
		this.brandName = brandName;
	}
	
	public void setServingSizeQty(int ServingSizeQty)
	{
		this.ServingSizeQty = ServingSizeQty;
	}
	
	public void setServingSizeUnit(String ServingSizeUnit)
	{
		this.ServingSizeUnit = ServingSizeUnit;
	}
	
	//	When the object is clicked
	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		//	I need to call one of your methods to get the variables needed in the ItemList class.
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {}

	@Override
	public void mouseExited(MouseEvent arg0) {}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
}
