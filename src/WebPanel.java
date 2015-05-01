import java.awt.Color;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;



public class WebPanel 
{
	public static void initFX(final JFXPanel fxPanel)
	{
		
		Group group = new Group();
        Scene scene = new Scene(group);
        fxPanel.setScene(scene);

        WebView webView = new WebView();

        group.getChildren().add(webView);
        webView.setMinSize(300, 300);
        webView.setMaxSize(500, 500);
		WebEngine webEngine = webView.getEngine();
		webEngine.load("http://www.google.com/");
		
	}
}
