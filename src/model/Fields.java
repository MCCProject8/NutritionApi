package model;

import com.google.gson.annotations.SerializedName;

public class Fields
{
        @SerializedName("item_id")
        public String itemId;
    
        @SerializedName("item_name")
        public String itemName;
    
        @SerializedName("brand_id")
        public String brandId;
    
        @SerializedName("brand_name")
        public String brandName;
    
        @SerializedName("nf_serving_size_qty")
        public Integer nfServingSizeQty;
    
        @SerializedName("nf_serving_size_unit")
        public String nfServingSizeUnit;
        
}