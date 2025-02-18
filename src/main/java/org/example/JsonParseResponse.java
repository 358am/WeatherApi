//package org.example;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.IOException;
//
//public class JsonParseResponse {
//    public static void main(String[] args) throws IOException {
//        Geo geo = new Geo();
//
//        String json = geo.getGeoByCityName("Belgorod");
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        JsonNode rootNode = mapper.readTree(json);
//        for (JsonNode node : rootNode) {
//            GeoResponseItem geoResponseItem = mapper.treeToValue(node, GeoResponseItem.class);
//
//            System.out.println("Выбранный город: " + geoResponseItem.getName());
//            System.out.println("Ширина: " + geoResponseItem.getLat());
//            System.out.println("Долгота: " +geoResponseItem.getLon());
//
//
//        }
//
//    }
//}
