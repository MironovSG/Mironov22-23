package Help.api.weather;
import lombok.Data;

@Data
public class Weather {
    private final Clouds clouds;
    private final Humidity humidity;
    private final Pressure pressure;
    private final Rain rain;
    private final Snow snow;
    private final Temperature temperature;
    private final Visibility visibility;
    private final Wind wind;

    public Weather(Clouds clouds, Humidity humidity, Pressure pressure, Rain rain, Snow snow,
                   Temperature temperature, Visibility visibility, Wind wind) {
        this.clouds = clouds;
        this.humidity = humidity;
        this.pressure = pressure;
        this.rain = rain;
        this.snow = snow;
        this.temperature = temperature;
        this.visibility = visibility;
        this.wind = wind;
    }
}

