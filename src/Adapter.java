import model.Hit;
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
				ListForItemNames.getItemNames(nutritionData);		
			}

			@Override
			public void failure(RetrofitError retrofitError)
			{
				retrofitError.getResponse();
			}
		});
	
	}
	
	public void getItem()
	{
		getSearchFoodAPI.itemResults("513fceb375b8dbbc210000e4", Config.appId, Config.appKey, new Callback<itemData>() {
			
			@Override
			public void success(itemData itemD, Response response)
			{
				System.out.println(itemD.itemName);
			}
	
			@Override
			public void failure(RetrofitError retrofitError)
			{
	
			}
		});
	}
}
