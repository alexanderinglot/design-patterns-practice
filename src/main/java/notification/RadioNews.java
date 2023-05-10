package notification;

import weather_forecast.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: tempaertura " + weatherForecast.getTemperature() + " stopni, ciśnienie: " + weatherForecast.getPressure() + " hPa");
    }
}
