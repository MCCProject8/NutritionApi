//	ItemList.java by Kyle Wolff and Brandon VanderMey on 4/22/2015

//	Request Example: https://api.nutritionix.com/v1_1/item?id=513fceb475b8dbbc210008e6&appId=781dbb8d&appKey=e77d941048fab5a248b15903bf9fdca4
//	Items from Response:
//		item_id": "513fceb475b8dbbc210008e6"
//		"item_name": "Turkey - 0.5 breast, bone removed"
//		brand_id": "513fcc648110a4cafb90ca5e"
//		"brand_name": "USDA"
//		"item_description": null
//		"nf_water_grams": 546.22
//		"nf_calories": 1632.96
//		"nf_calories_from_fat": 576.2
//		"nf_total_fat": 64.02
//		"nf_saturated_fat": 18.14
//		"nf_trans_fatty_acid": null
//		"nf_polyunsaturated_fat": 15.55
//		"nf_monounsaturated_fat": 21.17
//		"nf_cholesterol": 639.36
//		"nf_sodium": 544.32
//		"nf_total_carbohydrate": 0
//		"nf_dietary_fiber": 0
//		"nf_sugars": null
//		"nf_protein": 248.05,
//		"nf_vitamin_a_dv": 0
//		"nf_vitamin_c_dv": 0
//		"nf_calcium_dv": 18
//		"nf_iron_dv": 67
//		"nf_servings_per_container": null
//		"nf_serving_size_qty": 0.5
//		"nf_serving_size_unit": "breast, bone removed"
//		"nf_serving_weight_grams": 864

public class ItemList
{
	private static String itemID;
	private static String itemName;
	private static String brandID;
	private static String brandName;
	private static String itemDesc;
	private static String waterGrams;
	private static String calories;
	private static String caloriesFromFat;
	private static String totalFat;
	private static String saturatedFat;
	private static String transFattyAcid;
	private static String polyunsaturatedFat;
	private static String monounsaturatedFat;
	private static String colesterol;
	private static String sodium;
	private static String totalCarbohydrate;
	private static String dietaryFiber;
	private static String sugars;
	private static String protein;
	private static String vitaminA;
	private static String vitaminC;
	private static String calcium;
	private static String iron;
	private static String servingsPerContainer;
	private static String servingSizeQty;
	private static String servingSizeUnit;
	private static String servingWeightGrams;
	private static String totalFatPercentDValue;
	private static String satFatPercentDValue;
	private static String cholesterolPercentDValue;
	private static String sodiumPercentDValue;
	private static String totalCarbPercentDValue;
	private static String dietaryFiberPercentDValue;
	private static String proteinPercentDValue;
	private static String vitaminAPercentDValue;
	private static String vitaminCPercentDValue;
	private static String calciumPercentDValue;
	private static String ironPercentDValue;
	
	public ItemList(String itemIDIn, String itemNameIn, String brandIDIn, String brandNameIn, String itemDescIn, String waterGramsIn, String caloriesIn, 
			String caloriesFromFatIn, String totalFatIn, String saturatedFatIn, String transFattyAcidIn, String polyunsaturatedFatIn, String monounsaturatedFatIn,
			String colesterolIn, String sodiumIn, String totalCarbohydrateIn, String dietaryFiberIn, String sugarsIn, String proteinIn, String vitaminAIn, 
			String vitaminCIn, String calciumIn, String ironIn, String servingsPerContainerIn, String servingSizeQtyIn, String servingSizeUnitIn, 
			String servingWeightGramsIn)
	{
		itemID = itemIDIn;
		itemName = itemNameIn;
		brandID = brandIDIn;
		brandName = brandNameIn;
		itemDesc = itemDescIn;
		waterGrams = waterGramsIn;
		calories = caloriesIn;
		caloriesFromFat = caloriesFromFatIn;
		totalFat = totalFatIn;
		saturatedFat = saturatedFatIn;
		transFattyAcid = transFattyAcidIn;
		polyunsaturatedFat = polyunsaturatedFatIn;
		monounsaturatedFat = monounsaturatedFatIn;
		colesterol = colesterolIn;
		sodium = sodiumIn;
		totalCarbohydrate = totalCarbohydrateIn;
		dietaryFiber = dietaryFiberIn;
		sugars = sugarsIn;
		protein = proteinIn;
		vitaminA = vitaminAIn;
		vitaminC = vitaminCIn;
		calcium = calciumIn;
		iron = ironIn;
		servingsPerContainer = servingsPerContainerIn;
		servingSizeQty = servingSizeQtyIn;
		servingSizeUnit = servingSizeUnitIn;
		servingWeightGrams = servingWeightGramsIn;
	}

	public static String getItemID()
	{
		return itemID;
	}

	public static String getItemName()
	{
		return itemName;
	}

	public static String getBrandID()
	{
		return brandID;
	}

	public static String getBrandName()
	{
		return brandName;
	}

	public static String getItemDesc()
	{
		return itemDesc;
	}

	public static String getWaterGrams()
	{
		return waterGrams;
	}

	public static String getCalories()
	{
		return calories;
	}

	public static String getCaloriesFromFat()
	{
		return caloriesFromFat;
	}

	public static String getTotalFat()
	{
		return totalFat;
	}

	public static String getSaturatedFat()
	{
		return saturatedFat;
	}

	public static String getTransFattyAcid()
	{
		return transFattyAcid;
	}

	public static String getPolyunsaturatedFat()
	{
		return polyunsaturatedFat;
	}

	public static String getMonounsaturatedFat()
	{
		return monounsaturatedFat;
	}

	public static String getColesterol()
	{
		return colesterol;
	}

	public static String getSodium()
	{
		return sodium;
	}

	public static String getTotalCarbohydrate()
	{
		return totalCarbohydrate;
	}

	public static String getDietaryFiber()
	{
		return dietaryFiber;
	}

	public static String getSugars()
	{
		return sugars;
	}

	public static String getProtein()
	{
		return protein;
	}

	public static String getVitaminA()
	{
		return vitaminA;
	}

	public static String getVitaminC()
	{
		return vitaminC;
	}

	public static String getCalcium()
	{
		return calcium;
	}

	public static String getIron()
	{
		return iron;
	}

	public static String getServingsPerContainer()
	{
		return servingsPerContainer;
	}

	public static String getServingSizeQty()
	{
		return servingSizeQty;
	}

	public static String getServingSizeUnit()
	{
		return servingSizeUnit;
	}

	public static String getServingWeightGrams()
	{
		return servingWeightGrams;
	}

	public static void setItemID(String itemIDIn)
	{
		itemID = itemIDIn;
	}

	public static void setItemName(String itemNameIn)
	{
		itemName = itemNameIn;
	}

	public static void setBrandID(String brandIDIn)
	{
		brandID = brandIDIn;
	}

	public static void setBrandName(String brandNameIn)
	{
		brandName = brandNameIn;
	}

	public static void setItemDesc(String itemDescIn)
	{
		itemDesc = itemDescIn;
	}

	public static void setWaterGrams(String waterGramsIn)
	{
		waterGrams = waterGramsIn;
	}

	public static void setCalories(String caloriesIn)
	{
		calories = caloriesIn;
	}

	public static void setCaloriesFromFat(String caloriesFromFatIn)
	{
		caloriesFromFat = caloriesFromFatIn;
	}

	public static void setTotalFat(String totalFatIn)
	{
		totalFat = totalFatIn;
	}

	public static void setSaturatedFat(String saturatedFatIn)
	{
		saturatedFat = saturatedFatIn;
	}

	public static void setTransFattyAcid(String transFattyAcidIn)
	{
		transFattyAcid = transFattyAcidIn;
	}

	public static void setPolyunsaturatedFat(String polyunsaturatedFatIn)
	{
		polyunsaturatedFat = polyunsaturatedFatIn;
	}

	public static void setMonounsaturatedFat(String monounsaturatedFatIn)
	{
		monounsaturatedFat = monounsaturatedFatIn;
	}

	public static void setColesterol(String colesterolIn)
	{
		colesterol = colesterolIn;
	}

	public static void setSodium(String sodiumIn)
	{
		sodium = sodiumIn;
	}

	public static void setTotalCarbohydrate(String totalCarbohydrateIn)
	{
		totalCarbohydrate = totalCarbohydrateIn;
	}

	public static void setDietaryFiber(String dietaryFiberIn)
	{
		dietaryFiber = dietaryFiberIn;
	}

	public static void setSugars(String sugarsIn)
	{
		sugars = sugarsIn;
	}

	public static void setProtein(String proteinIn)
	{
		protein = proteinIn;
	}

	public static void setVitaminA(String vitaminAIn)
	{
		vitaminA = vitaminAIn;
	}

	public static void setVitaminC(String vitaminCIn)
	{
		vitaminC = vitaminCIn;
	}

	public static void setCalcium(String calciumIn)
	{
		calcium = calciumIn;
	}

	public static void setIron(String ironIn)
	{
		iron = ironIn;
	}

	public static void setServingsPerContainer(String servingsPerContainerIn)
	{
		servingsPerContainer = servingsPerContainerIn;
	}

	public static void setServingSizeQty(String servingSizeQtyIn)
	{
		servingSizeQty = servingSizeQtyIn;
	}

	public static void setServingSizeUnit(String servingSizeUnitIn)
	{
		servingSizeUnit = servingSizeUnitIn;
	}

	public static void setServingWeightGrams(String servingWeightGramsIn)
	{
		servingWeightGrams = servingWeightGramsIn;
	}
	
	public static void percentDailyValues(String totalFatIn, String saturatedFatIn, String transFattyAcidIn, String polyunsaturatedFatIn,String monounsaturatedFatIn,
			String colesterolIn,String sodiumIn, String totalCarbohydrateIn, String dietaryFiberIn, String proteinIn, String vitaminAIn, String vitaminCIn,
			String calciumIn, String ironIn)
	{
		int totalfat = 65;
		int saturatedFat = 20;
		int Cholesterol	= 300;
		int Sodium = 2400;
		int Potassium = 3500;
		int TotalCarbohydrate = 300;
		int DietaryFiber = 25;
		int Protein	= 50;
		int VitaminA = 5000;
		int VitaminC = 60;
		int Calcium	= 1000;
		int Iron = 18;
		int VitaminD = 400;
		int VitaminE = 30;
		int VitaminK = 80;
		float Thiamin = 1.5f;
		float Riboflavin = 1.7f;
		int Niacin = 20;
		int VitaminB6 = 2;
		int Folate = 400;
		int VitaminB12 =6;
		int Biotin = 300;
		int Pantothenic_acid = 10;
		int Phosphorus	= 1000;
		int Iodine = 150;
		int Magnesium = 400;
		int Zinc = 15;
		int Selenium = 70;
		int Copper = 2;
		int Manganese = 2;
		int Chromium = 120;
		int Molybdenum = 75;
		int Chloride = 3400;
		
		totalFatPercentDValue = String.valueOf(Integer.valueOf(totalFatIn) / totalfat);
		satFatPercentDValue = String.valueOf(Integer.valueOf(saturatedFatIn) / saturatedFat);
		cholesterolPercentDValue = String.valueOf(Integer.valueOf(colesterolIn) / Cholesterol);
		sodiumPercentDValue = String.valueOf(Integer.valueOf(sodiumIn) / Sodium);
		totalCarbPercentDValue = String.valueOf(Integer.valueOf(totalCarbohydrateIn) / TotalCarbohydrate);
		dietaryFiberPercentDValue = String.valueOf(Integer.valueOf(dietaryFiberIn) / DietaryFiber);
		proteinPercentDValue = String.valueOf(Integer.valueOf(proteinIn) / Protein);
		vitaminAPercentDValue = String.valueOf(Integer.valueOf(vitaminAIn) / VitaminA);
		vitaminCPercentDValue = String.valueOf(Integer.valueOf(vitaminCIn) / VitaminC);
		calciumPercentDValue = String.valueOf(Integer.valueOf(calciumIn) / Calcium);
		ironPercentDValue = String.valueOf(Integer.valueOf(ironIn) / Iron);

	}
}












