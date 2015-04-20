



public class Hit {

private String Index;
private String Type;
private String Id;
private float Score;
private Fields fields;

/**
* 
* @return
* The Index
*/
public String getIndex() {
return Index;
}

/**
* 
* @param Index
* The _index
*/
public void setIndex(String Index) {
this.Index = Index;
}

/**
* 
* @return
* The Type
*/
public String getType() {
return Type;
}

/**
* 
* @param Type
* The _type
*/
public void setType(String Type) {
this.Type = Type;
}

/**
* 
* @return
* The Id
*/
public String getId() {
return Id;
}

/**
* 
* @param Id
* The _id
*/
public void setId(String Id) {
this.Id = Id;
}

/**
* 
* @return
* The Score
*/
public float getScore() {
return Score;
}

/**
* 
* @param Score
* The _score
*/
public void setScore(float Score) {
this.Score = Score;
}

/**
* 
* @return
* The fields
*/
public Fields getFields() {
return fields;
}

/**
* 
* @param fields
* The fields
*/
public void setFields(Fields fields) {
this.fields = fields;
}
}
