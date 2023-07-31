package org.example;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TimeSlot {
    static ArrayList<LocalTime> timeSlot = new ArrayList<>(2);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");



    public TimeSlot(ArrayList<LocalTime> timeSlot) {
        this.timeSlot = timeSlot;
    }


    public ArrayList<LocalTime> getTimeSlot() {
        return timeSlot;
    }

}
