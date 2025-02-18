package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class JsonParserGeoByCityName {

    //Метод получения json модели геоданные
    public String getJsonGeoByCityName(String nameCity) throws IOException {
        // Открыть http клиент
        CloseableHttpClient httpClient = HttpClients.createDefault();

        String result = null;
        try {
            HttpGet request = new HttpGet("http://api.openweathermap.org/geo/1.0/direct?" +
                    "q=" + nameCity +
                    "&limit=1&" +
                    "appid=37aac9e1a60f286d0617ebfd1596f5fc");

            //Выполнить запрос
            CloseableHttpResponse response = httpClient.execute(request);

            try {
                // Проверить статуса ответа
                int statusCode = response.getStatusLine().getStatusCode();
                System.out.println("Response Status: " + statusCode);

                if (statusCode == 200) {
                    // Прочитать тело
                    result = EntityUtils.toString(response.getEntity(), "UTF-8");
                    // Вывести результат



                } else {
                    System.err.println("Error: " + statusCode);
                }


            } finally {
                response.close(); // Закрыть соединение
            }
        } finally {
            httpClient.close(); // Закрытие клиента
        }

        ObjectMapper mapper = new ObjectMapper();

        JsonNode rootNode = mapper.readTree(result);
        for (JsonNode node : rootNode) {
            GeoResponseItem geoResponseItem = mapper.treeToValue(node, GeoResponseItem.class);

            System.out.println("Выбранный город: " + geoResponseItem.getName());
            System.out.println("Широта: " + geoResponseItem.getLat());
            System.out.println("Долгота: " + geoResponseItem.getLon());

        }

        return result;
    }
}
