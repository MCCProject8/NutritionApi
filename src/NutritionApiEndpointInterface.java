import retrofit.Callback;
import retrofit.http.GET;


public interface NutritionApiEndpointInterface{

		    @GET("/search/turkey?appId=781dbb8d&appKey=e77d941048fab5a248b15903bf9fdca4")
		        void getInfo(Callback<Fields> callback);

		    }