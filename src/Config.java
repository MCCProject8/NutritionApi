/**
 * Created by mitchross on 4/20/15.
 */
public class Config
{
    public static final String appId = "e07891b3";
    public static final String appKey = "3110965832cc6ca7266dc702e1d67e03";
    public static final String BASE_URL = "https://api.nutritionix.com/v1_1";
    public static String searchItem = null;
    public static String itemId = null;

    
    public static void setSearchItem(String searchItem){
    	Config.searchItem = searchItem; 	
    }
    
    public static void setItemId(String ItemId){
    	Config.itemId = ItemId;
    }
}
