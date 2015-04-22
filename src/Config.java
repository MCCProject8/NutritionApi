/**
 * Created by mitchross on 4/20/15.
 */
public class Config
{
    public static final String appId = "781dbb8d";
    public static final String appKey = "e77d941048fab5a248b15903bf9fdca4";
    public static final String BASE_URL = "https://api.nutritionix.com/v1_1";
    public static String searchItem = null;
    
    public static void setSearchItem(String searchItem){
    	Config.searchItem = searchItem; 	
    }
    
    
    public static String getSearchItem(){
    	
    	return searchItem;
    }
}
