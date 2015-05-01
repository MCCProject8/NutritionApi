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
			}
		});
	}
	
	public void getItem()
	{
		getSearchFoodAPI.itemResults(Config.itemId, Config.appId, Config.appKey, new Callback<itemData>() {
			
			@Override
			public void success(itemData itemD, Response response)
			{
				Main.itemList = new  ItemList(itemD.itemId, itemD.itemName, itemD.brandId, itemD.brandName, itemD.itemDesc, String.valueOf(itemD.waterGrams),
						String.valueOf(itemD.calories), String.valueOf(itemD.calFromFat),String.valueOf(itemD.totalFat), String.valueOf(itemD.satFat), String.valueOf(itemD.transFat),
						String.valueOf(itemD.polyFat),String.valueOf(itemD.monoFat), String.valueOf(itemD.cholesterol), String.valueOf(itemD.sodium), String.valueOf(itemD.totalCarbs), 
						String.valueOf(itemD.dietaryFiber), String.valueOf(itemD.sugar), String.valueOf(itemD.protein), String.valueOf(itemD.vitaminA), String.valueOf(itemD.vitaminC),
						String.valueOf(itemD.calcium), String.valueOf(itemD.iron), String.valueOf(itemD.servingPerContainer), String.valueOf(itemD.servingQty), 
						String.valueOf(itemD.servingSizeunit), String.valueOf(itemD.weightGrams));
			}
	
			@Override
			public void failure(RetrofitError retrofitError)
			{
				
			}
		});
	}
}
