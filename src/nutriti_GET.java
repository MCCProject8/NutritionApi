
import retrofit.Callback;
import retrofit.RestAdapter;



public class nutriti_GET {

	String BASE_URL = "https://api.nutritionix.com/v1_1";
	
	RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
			
		NutritionApiEndpointInterface apiService = new NutritionApiEndpointInterface() {
			
			@Override
			public void getInfo(Callback<Fields> callback) {
				
			}
		};
		
		
		
}

	
	

