package edu.wgu.d387_sample_code.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class timeConversionController {
    @GetMapping("/ET")
    public String getETtime() {
        timeConversion response = new timeConversion();
        return response.getTimeET();
    }

    @GetMapping("/ETtoMT")
    public String getMTtime() {
        timeConversion response = new timeConversion();
        return response.getTimeMT();
    }

    @GetMapping("/ETtoUTC")
    public String getUTCtime() {
        timeConversion response = new timeConversion();
        return response.getTimeUTC();
    }
}
