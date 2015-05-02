import model.NutritionData;
import model.itemData;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import service.GetSearchFood;


public class Adapter {
	
	GetSearchFood getSearchFoodAPI;

	RestAdapter restAdapter = new RestAdapter.Builder()
			.setEndpoint(Config.BASE_URL)
			.build();
	
	public void searchForFood() 
	{
		getSearchFoodAPI = restAdapter.create( GetSearchFood.class );
		getSearchFoodAPI.searchFoodItems(Config.searchItem, "0:10", Config.appId, Config.appKey, new Callback<NutritionData>() {

			@Override
			public void success(NutritionData nutritionData, Response response)
			{
				Main.addJlabel(nutritionData);
				SearchPanel.load.setVisible(false);
			}

			@Override
			public void failure(RetrofitError retrofitError)
			{
				retrofitError.getResponse().getReason();
				SearchPanel.load.setVisible(false);
			}
		});
	}
	
	public void getItem()
	{
		getSearchFoodAPI.itemResults(Config.itemId, Config.appId, Config.appKey, new Callback<itemData>() {
			
			@Override
			public void success(itemData itemD, Response response)
			{
				ItemListener.getItemList(itemD);
			}
	
			@Override
			public void failure(RetrofitError retrofitError)
			{
				System.out.println(retrofitError.getMessage() + " " + retrofitError.getResponse().getReason());
			}
		});
	}
}
