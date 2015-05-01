import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.itemData;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebPanel 
{		
	public static ItemList itemlist;
	
	public static void initFX(final JFXPanel fxPanel)
	{	
		Main.adapter.getItem();
		
		fxPanel.setVisible(true);
		
		Group group = new Group();
        Scene scene = new Scene(group);
        fxPanel.setScene(scene);
        
        WebView webView = new WebView();
        
        CreateNutritionLabel htmldoc = new CreateNutritionLabel();
		htmldoc.startHtmlDocument();
		htmldoc.addTitle(ItemList.getItemName());
		htmldoc.addServingSize("1", "90g");
		htmldoc.addLargeBar();
		htmldoc.addAmountPerServing();
		htmldoc.addMediumBar();
		htmldoc.addDailyValueLabel();
		htmldoc.addLine("Total Fat ", "90g");
		htmldoc.addLine("Bananas", "90g", "30");
		htmldoc.addIndentedLine("Trans Fat", "7g", "5");
		
		for(int i = 0; i < 20; i++)
		{
			htmldoc.addLine("Brandon VanderMey", "400");
		}
		
		htmldoc.endHtmlDocument();

        group.getChildren().add(webView);
        webView.setMinSize(330, 350);
        webView.setMaxSize(330, 350);
		WebEngine webEngine = webView.getEngine();
		
		String x = String.valueOf(htmldoc.getHtml());
						
		webEngine.loadContent(x);
	}
	
	public static void getItemInformation(itemData itemD)
	{
		itemlist = new  ItemList(itemD.itemId, itemD.itemName, itemD.brandId, itemD.brandName, itemD.itemDesc, String.valueOf(itemD.waterGrams),
				String.valueOf(itemD.calories), String.valueOf(itemD.calFromFat),String.valueOf(itemD.totalFat), String.valueOf(itemD.satFat), String.valueOf(itemD.transFat),
				String.valueOf(itemD.polyFat),String.valueOf(itemD.monoFat), String.valueOf(itemD.cholesterol), String.valueOf(itemD.sodium), String.valueOf(itemD.totalCarbs), 
				String.valueOf(itemD.dietaryFiber), String.valueOf(itemD.sugar), String.valueOf(itemD.protein), String.valueOf(itemD.vitaminA), String.valueOf(itemD.vitaminC),
				String.valueOf(itemD.calcium), String.valueOf(itemD.iron), String.valueOf(itemD.servingPerContainer), String.valueOf(itemD.servingQty), 
				String.valueOf(itemD.servingSizeunit), String.valueOf(itemD.weightGrams));
	}
}
