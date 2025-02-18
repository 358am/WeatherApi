package org.example;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoResponse{

	@JsonProperty("GeoResponse")
	private List<GeoResponseItem> geoResponse;

	public List<GeoResponseItem> getGeoResponse(){
		return geoResponse;
	}
}