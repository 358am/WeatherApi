package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoResponseItem{

	@JsonProperty("local_names")
	private Object localNames;

	@JsonProperty("country")
	private String country;

	@JsonProperty("name")
	private String name;

	@JsonProperty("lon")
	private double lon;

	@JsonProperty("state")
	private String state;

	@JsonProperty("lat")
	private double lat;

	public Object getLocalNames(){
		return localNames;
	}

	public String getCountry(){
		return country;
	}

	public String getName(){
		return name;
	}

	public double getLon(){
		return lon;
	}

	public String getState(){
		return state;
	}

	public double getLat(){
		return lat;
	}
}