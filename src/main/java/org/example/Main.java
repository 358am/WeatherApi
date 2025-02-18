package org.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main{

	@JsonProperty("temp")
	private double temp;

	@JsonProperty("temp_min")
	private Object tempMin;

	@JsonProperty("grnd_level")
	private int grndLevel;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("pressure")
	private int pressure;

	@JsonProperty("sea_level")
	private int seaLevel;

	@JsonProperty("feels_like")
	private double feelsLike;

	@JsonProperty("temp_max")
	private Object tempMax;
	@JsonProperty("temp")
	public double getTemp(){
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}

	public Object getTempMin(){
		return tempMin;
	}

	public int getGrndLevel(){
		return grndLevel;
	}

	public int getHumidity(){
		return humidity;
	}

	public int getPressure(){
		return pressure;
	}

	public int getSeaLevel(){
		return seaLevel;
	}

	public double getFeelsLike(){
		return feelsLike;
	}

	public Object getTempMax(){
		return tempMax;
	}
}