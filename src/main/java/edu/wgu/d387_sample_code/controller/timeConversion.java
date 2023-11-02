package edu.wgu.d387_sample_code.controller;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class timeConversion {
    LocalTime time = LocalTime.of(11, 0);  //Time is set in ET
    public String getTimeET(){
        return AMPMConversion(time);
    }
    public String getTimeMT(){
        return AMPMConversion(time.minusHours(2));
    }

    public String getTimeUTC(){
        return AMPMConversion(time.plusHours(4));
    }

    public String AMPMConversion(LocalTime timein24) {
        String timeStr =timein24.toString();
        LocalTime localTime = LocalTime.parse(timeStr);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
        return localTime.format(formatter);
    }
}
