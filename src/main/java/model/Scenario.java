package model;

import java.util.ArrayList;

public class Scenario {

    private String name;
    private ArrayList<Conditions> conditions;
    private ArrayList<Rover> rover;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(ArrayList<Conditions> conditions) {
        this.conditions = conditions;
    }

    public ArrayList<Rover> getRover() {
        return rover;
    }

    public void setRover(ArrayList<Rover> rover) {
        this.rover = rover;
    }
}
