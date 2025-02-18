//package org.example;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import java.io.IOException;
//
//public class JsonParseResponsTwo {
//    public static void main (String[] args) throws IOException {
//
//        GetWeather getWeather = new GetWeather();
//        GeoResponseItem geoResponseItem = new GeoResponseItem();
//
//        //String jsonTwo = getWeather.getWeather(50.5955595, 36.5873394);
//        String jsonTwo = getWeather.getWeatherByLatLon(geoResponseItem.getLat(),  geoResponseItem.getLon());
//
//        ObjectMapper mapper = new ObjectMapper();
//        Response response = mapper.readValue(jsonTwo, Response.class);
//        System.out.println(response);
//
//        System.out.println(response.getName());
//        System.out.println("Температура: "+ response.getMain().getTemp());
//        System.out.println("Ощущается как: "+ response.getMain().getFeelsLike());
//        }
//    }
