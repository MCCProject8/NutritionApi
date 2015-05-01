package model;

import com.google.gson.annotations.SerializedName;

public class itemData {

@SerializedName("old_api_id")
public String oldApiId;
	
@SerializedName("item_id")
public String itemId;

@SerializedName("item_name")
public String itemName;

@SerializedName("brand_id")
public String brandId;

@SerializedName("brand_name")
public String brandName;

@SerializedName("item_description")
public String itemDesc;

@SerializedName("nf_ingredient_statement")
public String ingrStm;

@SerializedName("nf_water_grams")
public Float waterGrams;

@SerializedName("nf_calories")
public Float calories;

@SerializedName("nf_calories_from_fat")
public Float calFromFat;

@SerializedName("nf_total_fat")
public Float totalFat;

@SerializedName("nf_saturated_fat")
public Float satFat;

@SerializedName("nf_trans_fatty_acid")
public Float transFat;

@SerializedName("nf_polyunsaturated_fat")
public Float polyFat;

@SerializedName("nf_monounsaturated_fat")
public Float monoFat;

@SerializedName("nf_cholesterol")
public Float cholesterol;

@SerializedName("nf_sodium")
public Float sodium;

@SerializedName("nf_total_carbohydrate")
public Float totalCarbs;

@SerializedName("nf_dietary_fiber")
public Float dietaryFiber;

@SerializedName("nf_sugars")
public Float sugar;

@SerializedName("nf_protein")
public Float protein;

@SerializedName("nf_vitamin_a_dv")
public int vitaminA;

@SerializedName("nf_vitamin_c_dv")
public int vitaminC;

@SerializedName("nf_calcium_dv")
public int calcium;

@SerializedName("nf_iron_dv")
public int iron;

@SerializedName("nf_refuse_pct")
public int refuse;

@SerializedName("nf_servings_per_container")
public float servingPerContainer;

@SerializedName("nf_serving_size_qty")
public float servingQty;

@SerializedName("nf_serving_size_unit")
public String servingSizeunit;

@SerializedName("nf_serving_weight_grams")
public int weightGrams;

@SerializedName("allergen_contains_milk")
public String containsMilk;

@SerializedName("allergen_contains_eggs")
public String containsEggs;

@SerializedName("allergen_contains_fish")
public String containsFish;

@SerializedName("allergen_contains_shellfish")
public String containsShellfish;

@SerializedName("allergen_contains_tree_nuts")
public String containsTreeNuts;

@SerializedName("allergen_contains_peanuts")
public String containsPeanuts;

@SerializedName("allergen_contains_wheat")
public String containsWheat;

@SerializedName("allergen_contains_soybeans")
public String containsSoybeans;

@SerializedName("allergen_contains_gluten")
public String containsGluten;

}