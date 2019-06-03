package lopa.sonar.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/dummy")
public class DummyController {

    @Value("${service.version}")
    private String version;

    @GetMapping()
    public Map<String, String> getVersion() {
        Map<String, String> result = new HashMap<>();
        result.put("version", version);
        return result;
    }
}