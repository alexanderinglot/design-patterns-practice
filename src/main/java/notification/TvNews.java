package notification;

import weather_forecast.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: tempaertura " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure() + "hPa");
    }
}
