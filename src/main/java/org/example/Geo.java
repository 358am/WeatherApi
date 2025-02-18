package org.example;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Geo {

    public String getGeoByCityName(String nameCity) throws IOException {
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
                    System.out.println(result);


                } else {
                    System.err.println("Error: " + statusCode);
                }


            } finally {
                response.close(); // Закрыть соединение
            }
        } finally {
            httpClient.close(); // Закрытие клиента
        }
        return result;
    }
}

