package model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class NutritionData {

    @SerializedName("total_hits")
    public Integer totalHits;

    @SerializedName("max_score")
    public Double maxScore;

    public List<Hit> hits = new ArrayList<Hit>();


}


