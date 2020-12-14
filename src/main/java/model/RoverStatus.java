package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RoverStatus {

    private Rover rover;
    private Environment environment;

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public class Rover
    {
        private Location location;
        private int battery;
        private Inventory[] inventory;

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public int getBattery() {
            return battery;
        }

        public void setBattery(int battery) {
            this.battery = battery;
        }

        public Inventory[] getInventory() {
            return inventory;
        }

        public void setInventory(Inventory[] inventory) {
            this.inventory = inventory;
        }
    }

    public class Environment
    {
        private int temperature;
        private int humidity;
        @JsonProperty("solar-flare")
        private boolean solarflare;
        private boolean storm;
        private String terrain;

        public int getTemperature() {
            return temperature;
        }

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
            return solarflare;
        }

        @JsonProperty("solar-flare")
        public void setSolarflare(boolean solarflare) {
            this.solarflare = solarflare;
        }

        public boolean isStorm() {
            return storm;
        }

        public void setStorm(boolean storm) {
            this.storm = storm;
        }

        public String getTerrain() {
            return terrain;
        }

        public void setTerrain(String terrain) {
            this.terrain = terrain;
        }
    }

}
