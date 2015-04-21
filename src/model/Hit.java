package model;


import com.google.gson.annotations.SerializedName;

public class Hit {

    @SerializedName("_index")
    public String Index;

    @SerializedName("_type")
    public String Type;

    @SerializedName("_id")
    public String Id;

    @SerializedName("_score")
    public Double Score;

    public Fields fields;
}
