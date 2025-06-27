import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an Indian city name: ");
        String city = scanner.nextLine();
        scanner.close();

        String apiKey = "a9d1d1d4667320985c1753c6cfcd55a6";  // Replace with your OpenWeatherMap API key
        String urlString = String.format(
            "https://api.openweathermap.org/data/2.5/weather?q=%s,in&appid=%s&units=metric", 
            city, apiKey
        );

        try {
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                new InputStreamReader(conn.getInputStream())
            );

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            JSONObject json = new JSONObject(response.toString());
            String weather = json.getJSONArray("weather").getJSONObject(0).getString("main");
            double temperature = json.getJSONObject("main").getDouble("temp");
            int humidity = json.getJSONObject("main").getInt("humidity");

            System.out.println("\n--- Weather Report ---");
            System.out.println("City: " + city);
            System.out.println("Weather: " + weather);
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Humidity: " + humidity + "%");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
