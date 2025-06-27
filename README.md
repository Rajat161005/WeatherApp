#WeatherApp

A simple Java console application that fetches and displays real-time weather information using the [OpenWeatherMap API](https://openweathermap.org/api).

#Features

1.Fetches current weather data for any city
2.Uses REST API to get data from OpenWeather
3.Parses JSON responses using `org.json`
4.Clean and structured output on the console
5.Built using Maven

#Prerequisites

1.Java (JDK 11 or higher)
2.Maven
3.Internet connection
4.OpenWeatherMap API key (free)
> You can get a free API key by signing up at [https://openweathermap.org/api](https://openweathermap.org/api).

#Project Structure

WeatherApp/
├── pom.xml
├── .gitignore
├── README.md
└── src/
└── main/
└── java/
└── WeatherApp.java

#How to Run

1.Update your API key

In WeatherApp.java, replace:
String apiKey = "YOUR_API_KEY";
with your actual OpenWeatherMap API key.

2.Build and run the app
#Commands for run the program
(a)mvn clean compile then 
(b)mvn exec:java

3.Follow the prompt
Enter the name of any city to get the current weather.

#Technologies Used

1.Java
2.Maven
3.OpenWeatherMap API
4.org.json (for parsing)

#OUTPUT

#Terminal Output
![Image](https://github.com/user-attachments/assets/9df868b3-3b8e-45ac-a87a-c0ae83d8a53c)

Sample Output
![Image](https://github.com/user-attachments/assets/09ed52fe-d230-4c7d-aa6e-991706559c19)












