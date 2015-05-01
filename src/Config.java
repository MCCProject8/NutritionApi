/**
 * Created by mitchross on 4/20/15.
 */
public class Config
{
    public static final String appId = "770c722a";
    public static final String appKey = "2c4fb428e7e2fbb438f50666888fd0eb";
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
