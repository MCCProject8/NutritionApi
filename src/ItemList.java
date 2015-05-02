import java.text.DecimalFormat;

//	ItemList.java by Kyle Wolff and Brandon VanderMey on 4/22/2015

// API -  https://api.nutritionix.com/v1_1/item?id=513fceb475b8dbbc210008e6&appId=781dbb8d&appKey=e77d941048fab5a248b15903bf9fdca4


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
		
		percentDailyValues(totalFatIn, saturatedFatIn, transFattyAcidIn, polyunsaturatedFatIn, monounsaturatedFatIn, colesterolIn, sodiumIn, totalCarbohydrateIn, dietaryFiberIn, proteinIn);
		
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
	
	public static String getSatFatPercentDValue() {
		return satFatPercentDValue;
	}

	public static void setSatFatPercentDValue(String satFatPercentDValue) {
		ItemList.satFatPercentDValue = satFatPercentDValue;
	}

	public static String getTotalFatPercentDValue() {
		return totalFatPercentDValue;
	}

	public static void setTotalFatPercentDValue(String totalFatPercentDValue) {
		ItemList.totalFatPercentDValue = totalFatPercentDValue;
	}

	public static String getCholesterolPercentDValue() {
		return cholesterolPercentDValue;
	}

	public static void setCholesterolPercentDValue(
			String cholesterolPercentDValue) {
		ItemList.cholesterolPercentDValue = cholesterolPercentDValue;
	}

	public static String getSodiumPercentDValue() {
		return sodiumPercentDValue;
	}

	public static void setSodiumPercentDValue(String sodiumPercentDValue) {
		ItemList.sodiumPercentDValue = sodiumPercentDValue;
	}

	public static String getTotalCarbPercentDValue() {
		return totalCarbPercentDValue;
	}

	public static void setTotalCarbPercentDValue(String totalCarbPercentDValue) {
		ItemList.totalCarbPercentDValue = totalCarbPercentDValue;
	}

	public static String getDietaryFiberPercentDValue() {
		return dietaryFiberPercentDValue;
	}

	public static void setDietaryFiberPercentDValue(
			String dietaryFiberPercentDValue) {
		ItemList.dietaryFiberPercentDValue = dietaryFiberPercentDValue;
	}

	public static String getProteinPercentDValue() {
		return proteinPercentDValue;
	}

	public static void setProteinPercentDValue(String proteinPercentDValue) {
		ItemList.proteinPercentDValue = proteinPercentDValue;
	}

	public static String getVitaminAPercentDValue() {
		return vitaminAPercentDValue;
	}

	public static void setVitaminAPercentDValue(String vitaminAPercentDValue) {
		ItemList.vitaminAPercentDValue = vitaminAPercentDValue;
	}

	public static String getVitaminCPercentDValue() {
		return vitaminCPercentDValue;
	}

	public static void setVitaminCPercentDValue(String vitaminCPercentDValue) {
		ItemList.vitaminCPercentDValue = vitaminCPercentDValue;
	}

	public static String getCalciumPercentDValue() {
		return calciumPercentDValue;
	}

	public static void setCalciumPercentDValue(String calciumPercentDValue) {
		ItemList.calciumPercentDValue = calciumPercentDValue;
	}

	public static String getIronPercentDValue() {
		return ironPercentDValue;
	}

	public static void setIronPercentDValue(String ironPercentDValue) {
		ItemList.ironPercentDValue = ironPercentDValue;
	}
	
	
	public static void percentDailyValues(String totalFatIn, String saturatedFatIn, String transFattyAcidIn, String polyunsaturatedFatIn,String monounsaturatedFatIn,
			String colesterolIn,String sodiumIn, String totalCarbohydrateIn, String dietaryFiberIn, String proteinIn)
	{
		int totalfat = 65;
		int saturatedFat = 20;
		int Cholesterol	= 300;
		int Sodium = 2400;
		int TotalCarbohydrate = 300;
		int DietaryFiber = 25;
		int Protein	= 50;
		
		DecimalFormat df = new DecimalFormat("#,###");
		
		if(totalFatIn.equals("null"))
		{
			totalFatIn = "0";
		}
		if(saturatedFatIn.equals("null"))
		{
			saturatedFatIn = "0";
		}
		if(transFattyAcidIn.equals("null"))
		{
			transFattyAcidIn = "0";
		}
		if(polyunsaturatedFatIn.equals("null"))
		{
			polyunsaturatedFatIn = "0";
		}
		if(monounsaturatedFatIn.equals("null"))
		{
			monounsaturatedFatIn = "0";
		}
		if(colesterolIn.equals("null"))
		{
			colesterolIn = "0";
		}
		if(sodiumIn.equals("null"))
		{
			sodiumIn = "0";
		}
		if(totalCarbohydrateIn.equals("null"))
		{
			totalCarbohydrateIn = "0";
		}
		if(dietaryFiberIn.equals("null"))
		{
			dietaryFiberIn = "0";
		}
		if(proteinIn.equals("null"))
		{
			proteinIn = "0";
		}
		
		try {
		
		float ftTotalFat = Float.valueOf(totalFatIn) / totalfat;	
		String fatpercent = String.valueOf(df.format(ftTotalFat * 100));
		setTotalFatPercentDValue(fatpercent);
		
		float ftSatFat= Float.valueOf(saturatedFatIn) / saturatedFat;
		String satPercent = String.valueOf(df.format(ftSatFat * 100));
		setSatFatPercentDValue(satPercent);
		
		float ftCholesterol= Float.valueOf(colesterolIn) / Cholesterol;
		String cholPercent = String.valueOf(df.format(ftCholesterol * 100));
		setCholesterolPercentDValue(cholPercent);
		
		float ftSodium= Float.valueOf(sodiumIn) / Sodium;
		String sodiumPercent = String.valueOf(df.format(ftSodium * 100));
		setSodiumPercentDValue(String.valueOf(sodiumPercent));
		
		float ftCarb= Float.valueOf(totalCarbohydrateIn) / TotalCarbohydrate;
		String carbPercent = String.valueOf(df.format(ftCarb * 100));
		setTotalCarbPercentDValue(String.valueOf(carbPercent));
		
		float ftFiber= Float.valueOf(dietaryFiber) / DietaryFiber;
		String fiberPercent = String.valueOf(df.format(ftFiber * 100));
		setDietaryFiberPercentDValue(String.valueOf(fiberPercent));

		float ftProtein= Float.valueOf(proteinIn) / Protein;
		String proteinPercent = String.valueOf(df.format(ftProtein * 100));
		setProteinPercentDValue(proteinPercent);
		
		} catch(NumberFormatException e)
			{
				e.getCause().getMessage();
			}
	}
}












