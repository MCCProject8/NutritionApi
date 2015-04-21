import model.Fields;
import model.Hit;
import model.NutritionData;
import model.itemData;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import service.GetSearchFood;

public class Main {

	public static void main(String[] args) {

		GetSearchFood getSearchFoodAPI;


		RestAdapter restAdapter = new RestAdapter.Builder()
				.setEndpoint(Config.BASE_URL)
				.setLogLevel(RestAdapter.LogLevel.FULL)
				.build();

		//Demo Search Food
		getSearchFoodAPI = restAdapter.create( GetSearchFood.class );

		getSearchFoodAPI.searchFoodItems("turkey", "0:20", Config.appId, Config.appKey, new Callback<NutritionData>() {

			@Override
			public void success(NutritionData nutritionData, Response response)
			{
				printNutritionData( nutritionData);
				
			}

			@Override
			public void failure(RetrofitError retrofitError)
			{

			}
		});
		
		GetSearchFood getItemFacts;
		
		getItemFacts = restAdapter.create(GetSearchFood.class );
		getItemFacts.itemResults("513fceb475b8dbbc210008e6", Config.appId, Config.appKey, new Callback<itemData>() {
			
			@Override
			public void success(itemData itemD, Response response)
			{
				
			}

			@Override
			public void failure(RetrofitError retrofitError)
			{

			}
		});


	}

	private static void printNutritionData( NutritionData nutritionData )
	{
		if ( nutritionData !=null && nutritionData.hits !=null )
		{

			for (Hit h : nutritionData.hits )
			{
				System.out.println(" Hit id:" + h.Id + " Hit Type: " + h.Type );
			}

			System.out.println( "Done");
		}
	}

}
