package notification;

import weather_forecast.WeatherForecast;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: tempaertura " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure() + " hPa");
    }
}
