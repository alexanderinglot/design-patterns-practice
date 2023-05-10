package notification;

import weather_forecast.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}
