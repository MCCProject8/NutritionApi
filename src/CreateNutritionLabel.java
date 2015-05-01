public class CreateNutritionLabel
{
	/*
	 * Instructions on use:
	 * 		First create object of this class.
	 * 		Call 'startHtmlDocument'.
	 * 		Call 'addTitle' and pass it a title in String format.
	 * 		Call 'addServingSize' pass it the quantity and weight.  Don't forget to add the "g" for example: "190g".
	 * 		Call 'addLargeBar'.
	 * 		Call 'addAmountPerServing'.
	 * 
	 * 		At the very end of building the htmlDocument, call the 'endHtmlDocument' method to finalize.
	 * 
	 * 		You can call the clearHtmlDocument' to clear the html StringBuilder.
	 * 		
	 * 		That was the setup that makes it look like all other labels.  It is highly recommended you call the 'addLine' method
	 * 		and pass it 'Calories, 14g, 24' for example.  And then call the 'addMediumBar' after that.  Finally call 'addDailyValueLabel'
	 * 		From there on, it is all custom (try to keep the order standard, usually Total Fat is the next thing).
	 * 
	 * 		Also, when adding weights, remember to add a 'g' or 'mg' at the end of it.
	 */
	
	private StringBuilder html = new StringBuilder("");
	
	public CreateNutritionLabel()
	{
		
	}
	
	public StringBuilder getHtml()
	{
		return html;
	}
	
	public void startHtmlDocument()
	{		
		html.append("<html><head><style type=\"text/css\">/*latin*/@font-face{font-family:'ArchivoBlack';font-style:normal;font-weight:400;src:local"
				+ "('ArchivoBlackRegular'),local('ArchivoBlack-Regular'),url(https://fonts.gstatic.com/s/archivoblack/v4/WoAoVT7K3k7hHfxKbvB6B6GwZw"
				+ "AVuVwqynDPq0VH9Ho.woff2)format('woff2');unicode-range:U+0000-00FF,U+0131,U+0152-0153,U+02C6,U+02DA,U+02DC,U+2000-206F,U+2074,U+2"
				+ "0AC,U+2212,U+2215,U+E0FF,U+EFFD,U+F000;}.viewMealCol1{float:left;width:300px;}.nutritionLabel.line{line-height:normal;}.nutritio"
				+ "nLabel.title{padding-bottom:6px;}html,body{margin:000px;padding:0}.nutritionLabel{font-size:115%!important}}.list-other-items{ma"
				+ "rgin:0010px0;padding:0}body{font-family:'OpenSans',sans-serif;font-size:11px;color:#202020;line-height:14px;position:relative;pa"
				+ "dding-bottom:50px;background-repeat:repeat-x;background-position:0-298px;background-color:#fff}.bar1{height:10px;line-height:0;f"
				+ "ont-size:1px;background:#333}.nutritionLabel.bar2{height:5px;line-height:0;font-size:1px;background:#333}.nutritionLabel.dvCalor"
				+ "ieDiet{color:#777}.nutritionLabel.calorieNote{padding:.60em00.70em}.nutritionLabel.star{margin-left:-7px}.nutritionLabel.tblCalo"
				+ "rieDiettd{padding:0;line-height:normal;font-size:.7em;color:#777}.nutritionLabel.ar{text-align:right}.nutritionLabel.fr{float:ri"
				+ "ght}.nutritionLabel.fl{float:left}.nutritionLabel{font-size:90%;margin-bottom:1.1em;padding:.68em;color:#333;font-family:Arial,H"
				+ "elvetica,sans-serif;border:2pxsolid#000;line-height:normal}.nutritionLabel.title{line-height:.83em;font-size:2.7em;padding-botto"
				+ "m:4px;font-family:'ArchivoBlack';white-space:nowrap;letter-spacing:-2px}.nutritionLabel.m{font-size:.9em}.nutritionLabel.serving"
				+ "{font-size:1.1em;line-height:1.28em;padding-bottom:2px}.nutritionLabel.name{font-size:1.1em;line-height:1.3em}.nutritionLabel.dv"
				+ "CalorieDiet,.nutritionLabel#calcDisclaimer{font-size:.9em}.nutritionLabel.line{border-top:1pxsolid#333;padding:1px0}.nutritionLa"
				+ "bel.line.indent{margin-left:15px}.nutritionLabel.dv{float:right}.nutritionLabela.unitQuantityUp{padding-bottom:1px;background:tr"
				+ "ansparenturl(\"//www.nutritionix.com/images/up.png\")lefttopno-repeat;z-index:9999}.nutritionLabela.unitQuantityDown{padding-top"
				+ ":1px;background:transparenturl(\"//www.nutritionix.com/images/down.png\")leftbottomno-repeat;z-index:9999}.nutritionLabel.servin"
				+ "gSizeField{float:left;margin-top:.2em;margin-bottom:.2em;margin-right:.4em}.nutritionLabel.servingUnit{float:left;padding:0;marg"
				+ "in-top:.3em;margin-bottom:.2em}.nutritionLabel.servingWeightGrams{padding:000.3em;margin-top:.3em;margin-bottom:.2em}.nutritionL"
				+ "abel.servingSizeText{padding-right:.3em;margin-top:.3em}.nutritionLabel.servingUnitQuantity{margin-top:.3em;padding-right:.3em}."
				+ "cf:before,.cf:after{content:\"\";display:table}.cf:after{clear:both}.cf{*zoom:1}.nutritionLabel.servingSizeText{display:inline-b"
				+ "lock}.ingredientListDiv.scroll{overflow-y:scroll!important}.nutritionLabela.unitQuantityUp{background:transparenturl(\"//www.nut"
				+ "ritionix.com/images/up.png\")lefttopno-repeat}.nutritionLabela.unitQuantityDown{background:transparenturl(\"//www.nutritionix.co"
				+ "m/images/down.png\")leftbottomno-repeat}</style></head><body><divid=\"colsWrap\"class=\"\"><divclass=\"viewMealCol1\"><divid=\"n"
				+ "utritionLabel\"><div class=\"nutritionLabel\"style=\"width:283px;\"><div class=\"title\">NutritionFacts</div>");
	}
	
	public void addTitle(String title)
	{
		html.append("<div class=\"name \">" + title + "</div>");
	}
	
	public void addServingSize(String servingOrder, String servingWeight)
	{
		html.append("<div class=\"serving\"><div class=\"cf\"><div class=\"servingSizeText fl\">ServingSize:" + servingOrder + "</div><div class=\"servingUnit fl unitHasText"
				+ "box\">Order</div><div class=\"servingWeightGrams fl gramsHasTextbox\">(" + servingWeight + ")</div></div></div>");
	}
	
	public void addLargeBar()
	{
		html.append("<div class=\"bar1\"></div>");
	}
	
	public void addAmountPerServing()
	{
		html.append("<div class=\"line m\"><b>Amount Per Serving</b></div>");
	}
	
	public void addMediumBar()
	{
		html.append("<div class=\"bar2\"></div>");
	}
	
	public void addDailyValueLabel()
	{
		html.append("<div class=\"line ar\"><b>% Daily Value<sup>*</sup></b></div>");
	}
	
	public void addLine(String label, String weight, String percent)
	{
		html.append("<div class=\"line\"><div class=\"dv\"><b>" + percent + "</b>%</div><b>" + label + "</b>" + weight + "</div>");
	}
	
	public void addLine(String label, String weight)
	{
		html.append("<div class=\"line\"><b>" + label + "</b>" + weight + "</div>");
	}
	
	public void addIndentedLine(String label, String weight, String percent)
	{
		html.append("<div class=\"line indent\"><div class=\"dv\"><b>" + percent + "</b>%</div>" + label + " " + weight + "</div>");
	}
	
	public void addIndentedLine(String label, String weight)
	{
		html.append("<div class=\"line indent\">" + label + " " + weight + "</div>");
	}
	
	public void endHtmlDocument()
	{
		html.append("<div class=\"dvCalorieDiet line\"><div class=\"calorieNote\"><span class=\"star\">*</span> Percent Daily Values are based "
				+ "on a 2000 calorie diet.</div></div></div></div></div></body></html>");
	}
	
	public void clearHtmlDocument()
	{
		html.setLength(0);
	}
}
