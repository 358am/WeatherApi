package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coord{

	@JsonProperty("lon")
	private Object lon;

	@JsonProperty("lat")
	private Object lat;

	public Object getLon(){
		return lon;
	}

	public Object getLat(){
		return lat;
	}
}