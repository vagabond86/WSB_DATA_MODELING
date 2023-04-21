package edu.wsb.datamodellingdemo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class DemoController {

    //http://localhost:8080/demo/time
    @GetMapping("/demo/time")
    @ResponseBody
    public String time() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    //http://localhost:8080/demo/capitalize?text=wsb
    @GetMapping("/demo/capitalize")
    @ResponseBody
    public String capitalize(@RequestParam String word) {
        return "Dostaliśmy: \"" + word + "\"\nWielkimi literami to będzie: \"" + word.toUpperCase() + "\"";
    }

}

