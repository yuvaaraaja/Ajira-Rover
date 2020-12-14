package controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Environment;
import model.RoverConfig;
import model.RoverStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.EnvironmentService;
import service.RoverService;

import javax.xml.ws.Response;
import java.util.Map;

@RestController
public class RoverController {

    private EnvironmentService environmentService = new EnvironmentService();
    private RoverService roverService = new RoverService();

    @PostMapping("/api/environment/configure")
    public ResponseEntity configureEnvironment(@RequestBody Environment environment)
    {
        environmentService.configureEnvironment(environment);
        System.out.println(Environment.getInstance().getTemperature());
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PatchMapping("/api/environment")
    public ResponseEntity modifyEnvironment(@RequestBody Map<String, Object> field)
    {
        environmentService.modifyEnvironment(field);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping("/api/rover/configure")
    public ResponseEntity configureRover(@RequestBody RoverConfig roverConfig)
    {
        roverService.configureRover(roverConfig);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/api/rover/status")
    public ResponseEntity<RoverStatus> getRoverStatus()
    {
        RoverStatus roverStatus = roverService.getRoverStatus();
        return new ResponseEntity<>(roverStatus, HttpStatus.OK);
    }
}
