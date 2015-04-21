package service;

import model.Fields;
import model.NutritionData;
import model.itemData;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;

import java.util.List;


public interface GetSearchFood
{
	@GET("/search/")
	void searchFoodItems (@Query("phrase") String searchTerm , @Query("results") String resultsRange, @Query("appId") String appId, @Query("appKey") String appKey , Callback<NutritionData> cb);

	@GET("/item/")
	void itemResults (@Query("id") String itemId, @Query("appId") String appId, @Query("appKey") String appKey , Callback<itemData> cb);
	
}

	
	

