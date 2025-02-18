package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sys{

	@JsonProperty("country")
	private String country;

	@JsonProperty("sunrise")
	private int sunrise;

	@JsonProperty("sunset")
	private int sunset;

	public String getCountry(){
		return country;
	}

	public int getSunrise(){
		return sunrise;
	}

	public int getSunset(){
		return sunset;
	}
}