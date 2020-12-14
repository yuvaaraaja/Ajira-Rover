package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Environment {

    private int temperature;
    private int humidity;
    @JsonProperty("solar-flare")
    private boolean solar_flare;
    private boolean storm;
    @JsonProperty("area-map")
    private String[][] area_map;

    public int getTemperature() {
        return temperature;
    }

    private Environment() {}

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("solar-flare")
    public boolean isSolarflare() {
        return solar_flare;
    }

    @JsonProperty("solar-flare")
    public void setSolarflare(boolean solar_flare) {
        this.solar_flare = solar_flare;
    }

    public boolean isStorm() {
        return storm;
    }

    public void setStorm(boolean storm) {
        this.storm = storm;
    }

    @JsonProperty("area-map")
    public String[][] getAreamap() {
        return area_map;
    }

    @JsonProperty("area-map")
    public void setAreamap(String[][] area_map) {
        this.area_map = area_map;
    }

    private static Environment instance = null;
    public static Environment getInstance() {
        if(instance == null)
        {
            instance = new Environment();
        }
        return instance;
    }
    public static void setInstance(Environment environment)
    {
        instance = environment;
    }
}
