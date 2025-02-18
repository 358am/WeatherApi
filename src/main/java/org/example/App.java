package org.example;

import java.io.IOException;
public class App 
{
    public static void main( String[] args ) throws IOException {
        JsonParserGeoByCityName jsonParserGeoByCityName = new JsonParserGeoByCityName();
        jsonParserGeoByCityName.getJsonGeoByCityName("Moscow");
        JsonParserWeather jsonParserWeather = new JsonParserWeather();
        jsonParserWeather.getWeather();
    }


}
