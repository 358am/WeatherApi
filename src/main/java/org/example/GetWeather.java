//package org.example;
//
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//import java.io.IOException;
//
//
//
//public class GetWeather {
//
//            public String getWeatherByLatLon(double lat, double lon) throws IOException {
//            String result = null;
//            CloseableHttpClient httpClient = HttpClients.createDefault();
//
//            try {
//                HttpGet request = new HttpGet("https://api.openweathermap.org/data/2.5/weather?" +
//                        "lat=52.8676823&" +
//                        "lon=34.6497554&" +
//                        "appid=37aac9e1a60f286d0617ebfd1596f5fc&" +
//                        "lang=ru&" +
//                        "units=metric");
//
//
//
//                // Выполнение запроса
//                CloseableHttpResponse response = httpClient.execute(request);
//
//                try {
//                    // Проверка статуса ответа
//                    int statusCode = response.getStatusLine().getStatusCode();
//                    System.out.println("Response Status: " + statusCode);
//
//                    if (statusCode == 200) {
//                        // Чтение тела ответа
//                        result = EntityUtils.toString(response.getEntity(), "UTF-8");
//
//                        // Вывод результата
//                        System.out.println(result);
//
//                    } else {
//                        System.err.println("Error: " + statusCode);
//                    }
//                } finally {
//                    response.close(); // Закрытие соединения
//                }
//
//            } finally {
//                httpClient.close(); // Закрытие клиента
//            }
//            return result;
//        }
//    }
//
//
