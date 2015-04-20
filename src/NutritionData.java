

import java.util.ArrayList;
import java.util.List;



public class NutritionData {



private int totalHits;
private float maxScore;
private List<Hit> hits = new ArrayList<Hit>();

/**
* 
* @return
* The totalHits
*/
public int getTotalHits() {
return totalHits;
}

/**
* 
* @param totalHits
* The total_hits
*/
public void setTotalHits(int totalHits) {
this.totalHits = totalHits;
}

/**
* 
* @return
* The maxScore
*/
public float getMaxScore() {
return maxScore;
}

/**
* 
* @param maxScore
* The max_score
*/
public void setMaxScore(float maxScore) {
this.maxScore = maxScore;
}

/**
* 
* @return
* The hits
*/
public List<Hit> getHits() {
return hits;
}

/**
* 
* @param hits
* The hits
*/
public void setHits(List<Hit> hits) {
this.hits = hits;
}




}


