package service;

import model.NutritionData;
import model.itemData;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;



public interface GetSearchFood
{
	
	@GET("/search/{phrase}")
	void searchFoodItems (@Path("phrase") String searchTerm, @Query("results") String resultsRange, @Query("appId") String appId, @Query("appKey") String appKey , Callback<NutritionData> cb);

	@GET("/item")
	void itemResults (@Query("id") String itemId, @Query("appId") String appId, @Query("appKey") String appKey , Callback<itemData> cb);
	
}

	
	

