import model.itemData;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebPanel 
{			
	public static void initFX(final JFXPanel fxPanel, ItemList itemlist)
	{			
		fxPanel.setVisible(false);
		
		//	I need the loading icon right here.  You can change the sleep timer to make it a bit quicker.
		//	But this works perfectly for me.  I don't have to click twice anymore.
		
		try
		{
			Thread.sleep(9000);
			
		}
		catch (InterruptedException ex)
		{
			System.out.println("Timer inturrupted");
			Thread.currentThread().interrupt();
		}
		
		fxPanel.setVisible(true);
		
		Group group = new Group();
        Scene scene = new Scene(group);
        fxPanel.setScene(scene);
        
        WebView webView = new WebView();

        group.getChildren().add(webView);
        webView.setMinSize(330, 350);
        webView.setMaxSize(330, 350);
		WebEngine webEngine = webView.getEngine();
		
		CreateNutritionLabel htmldoc = new CreateNutritionLabel();
		htmldoc.startHtmlDocument();
		htmldoc.addTitle(ItemList.getItemName());
		htmldoc.addServingSize(ItemList.getServingSizeQty(),ItemList.getServingSizeUnit(), (ItemList.getServingWeightGrams() + "g"));
		htmldoc.addLargeBar();
		htmldoc.addAmountPerServing();
		htmldoc.addCalLine(ItemList.getCaloriesFromFat(), "Calories ", ItemList.getCalories());
		htmldoc.addMediumBar();
		htmldoc.addDailyValueLabel();
		htmldoc.addLine("Total Fat ", ItemList.getTotalFat()+"g", ItemList.getTotalFatPercentDValue());
		htmldoc.addIndentedLine("Saturated Fat", ItemList.getSaturatedFat(), ItemList.getSatFatPercentDValue());
		htmldoc.addIndentedLine("Polyunsaturated  Fat", ItemList.getPolyunsaturatedFat());
		htmldoc.addIndentedLine("Monounsaturated  Fat", ItemList.getMonounsaturatedFat());
		htmldoc.addIndentedLine("Trans  Fat", ItemList.getTransFattyAcid());
		htmldoc.addLine("Cholesterol ", ItemList.getColesterol()+"mg", ItemList.getCholesterolPercentDValue());
		htmldoc.addLine("Sodium ", ItemList.getSodium()+"mg", ItemList.getSodiumPercentDValue());
		htmldoc.addLine("Total Carbohydrates " ,ItemList.getTotalCarbohydrate()+"g", ItemList.getTotalCarbPercentDValue());
		htmldoc.addIndentedLine("Dietary Fiber", ItemList.getDietaryFiber()+"g", ItemList.getDietaryFiberPercentDValue());
		htmldoc.addIndentedLine("Sugar", ItemList.getSugars()+"g");
		htmldoc.addLine("Protein " ,ItemList.getProtein()+"g", ItemList.getProteinPercentDValue());
		htmldoc.addLargeBar();
		htmldoc.addLine("Vitamin A","",ItemList.getVitaminA());
		htmldoc.addLine("Vitamin C","",ItemList.getVitaminC());
		htmldoc.addLine("Calcium","",ItemList.getCalcium());
		htmldoc.addLine("Iron","",ItemList.getIron());
		htmldoc.endHtmlDocument();
		
		String x = String.valueOf(htmldoc.getHtml());
		
		//	This clears the html string.
		htmldoc.clearHtmlDocument();
						
		webEngine.loadContent(x);
	}
	
}
