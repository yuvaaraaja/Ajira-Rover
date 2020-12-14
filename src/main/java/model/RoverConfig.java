package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class RoverConfig {

    private ArrayList<Scenario> scenarios;
    private ArrayList<State> states;
    @JsonProperty("deploy-point")
    private Location location;
    @JsonProperty("initial-battery")
    private int battery;
    private Inventory[] inventory = new Inventory[7];

    private static RoverConfig instance = null;

    public static RoverConfig getInstance()
    {
        if(instance == null)
        {
            instance = new RoverConfig();
        }
        return instance;
    }

    public static void setInstance(RoverConfig roverConfig)
    {
        instance = roverConfig;
    }

    private RoverConfig() { }

    public ArrayList<Scenario> getScenarios() {
        return scenarios;
    }

    public void setScenarios(ArrayList<Scenario> scenarios) {
        this.scenarios = scenarios;
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    @JsonProperty("deploy-point")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("deploy-point")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("initial-battery")
    public int getBattery() {
        return battery;
    }

    @JsonProperty("initial-battery")
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
