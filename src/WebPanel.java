import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class WebPanel 
{	
	public static JLabel load;
	
	public static void initFX(final JFXPanel fxPanel)
	{	
		ImageIcon loading2 = new ImageIcon("ajax-loader.gif");
		load = new JLabel("loading... ", loading2, JLabel.CENTER);
		load.setBounds(250,120,100,40);
		fxPanel.add(load);
		
		CreateNutritionLabel htmldoc = new CreateNutritionLabel();
		htmldoc.startHtmlDocument();
		htmldoc.addTitle("Pizza");
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
		
		Group group = new Group();
        Scene scene = new Scene(group);
        fxPanel.setScene(scene);
        
        WebView webView = new WebView();

        group.getChildren().add(webView);
        webView.setMinSize(330, 350);
        webView.setMaxSize(330, 350);
		WebEngine webEngine = webView.getEngine();
		
		String x = String.valueOf(htmldoc.getHtml());
		
		webEngine.loadContent(x);
		
	}
}
