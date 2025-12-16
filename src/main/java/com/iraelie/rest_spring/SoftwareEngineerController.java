package com.iraelie.rest_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getEngineers () {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Elie",
                        List.of("Python", "JavaScript", "TypeScript", "ExpressJs", "FastAPI")
                ),
                new SoftwareEngineer(
                        2,
                        "Irakoze",
                        List.of("Java", "Spring Boot", "Docker", "AWS", "GCP")
                )
        );
    }
}
