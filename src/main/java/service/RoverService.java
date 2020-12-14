package service;

import model.Environment;
import model.RoverConfig;
import model.RoverStatus;

public class RoverService {

    public void configureRover(RoverConfig roverConfig)
    {
        RoverConfig.setInstance(roverConfig);
    }

    public RoverStatus getRoverStatus()
    {
        RoverConfig roverConfig = RoverConfig.getInstance();
        RoverStatus roverStatus = new RoverStatus();

        RoverStatus.Rover rover = roverStatus.new Rover();

        rover.setBattery(roverConfig.getBattery());
        rover.setInventory(roverConfig.getInventory());
        rover.setLocation(roverConfig.getLocation());

        RoverStatus.Environment environment = roverStatus.new Environment();

        environment.setHumidity(Environment.getInstance().getHumidity());
        environment.setTemperature(Environment.getInstance().getTemperature());
        environment.setSolarflare(Environment.getInstance().isSolarflare());
        environment.setStorm(Environment.getInstance().isStorm());

        int row = roverConfig.getLocation().getRow();
        int column = roverConfig.getLocation().getColumn();

        environment.setTerrain(Environment.getInstance().getAreamap()[row-1][column-1]);

        roverStatus.setRover(rover);
        roverStatus.setEnvironment(environment);

        return roverStatus;
    }

}
