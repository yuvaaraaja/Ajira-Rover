package service;

import model.Environment;

import java.util.Map;

public class EnvironmentService {

    public void configureEnvironment(Environment environment)
    {
        Environment.setInstance(environment);
    }

    public void modifyEnvironment(Map<String, Object> field)
    {
        Environment environment = Environment.getInstance();
        if(field.containsKey("temperature"))
        {
            environment.setTemperature((int)field.get("temperature"));
        }
        if(field.containsKey("humidity"))
        {
            environment.setHumidity((int)field.get("humidity"));
        }
        if(field.containsKey("solar-flare"))
        {
            environment.setSolarflare((boolean)field.get("solar-flare"));
        }
        if(field.containsKey("storm"))
        {
            environment.setSolarflare((boolean)field.get("storm"));
        }
        if(field.containsKey("area-map"))
        {
            environment.setAreamap((String[][])field.get("area-map"));
        }
        Environment.setInstance(environment);
    }

}
