package com.interview.interview_poc;

import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("greet")
public class VersioningController {

    @GetMapping("/morning/v1")
    public String greetMorningVersion1() {
        return "Good Morning from Version v1";
    }

    @GetMapping("/morning/v2")
    public String greetMorningVersion2() {
        return "Good Day from Version v2";
    }

    @GetMapping("/afternoon")
    public String greetAfternoon(@RequestParam(value="version", required = false, defaultValue = "v1")
                               String version) {
        return Objects.isNull(version) ? "Good Afternoon from " + version : "Good Noon from " + version;
    }

    @GetMapping("/evening")
    public String greetEvening(@RequestHeader(value = "version", defaultValue = "v1", required = false)
                               String version) {
        return version == "v1" ? "Good Evening from " + version : "Evening delight from " + version;
    }
}
