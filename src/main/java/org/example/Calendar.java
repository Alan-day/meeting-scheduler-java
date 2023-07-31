package org.example;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;



public class Calendar {

int meeting_duration;


    static ArrayList <ArrayList> calendar1 = new ArrayList<>();
    static ArrayList <ArrayList> calendar2 = new ArrayList<>();


  static   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
  static  String time_1_start ="9:00";
   static String time_1_end = "20:00";
    static String time_2_start ="7:00";
    static String time_2_finish ="19:00";

    static LocalTime calendar_1_start = LocalTime.parse(time_1_start, formatter);
    static LocalTime calendar_1_end = LocalTime.parse(time_1_end, formatter);

    static LocalTime calendar_2_start = LocalTime.parse(time_2_start, formatter);
    static LocalTime calendar_2_end = LocalTime.parse(time_2_finish, formatter);


   static LocalTime [] daily_bounds1  = {calendar_1_start, calendar_1_end};
    static LocalTime [] daily_bounds2  = {calendar_2_start, calendar_2_end};



// input list of all meetings
public static void main(String[] args) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");

    Scanner scanner = new Scanner(System.in);

    System.out.println("When do you have meetings today?");

    System.out.println("Add meeting hours to calendar 1");

    int input;
    do {
        System.out.println("Press 1 to add a meeting");
        System.out.println("Press 2 to finish adding meetings");
        input = scanner.nextInt();



        switch (input) {
            case 1:
                System.out.println("Input your meeting hours");
                System.out.println("Start:");
                scanner.nextLine();
                String start = scanner.nextLine();
                LocalTime time1 = LocalTime.parse(start, formatter);

                System.out.println("Finish:");
                String finish = scanner.nextLine();
                LocalTime time2 = LocalTime.parse(finish, formatter);

                ArrayList<LocalTime> times = new ArrayList<>();
                times.add(time1);
                times.add(time2);
                TimeSlot timeSlot = new TimeSlot(times);
                calendar1.add(timeSlot.getTimeSlot());
                break;

            case 2:
                break;
        }

    } while (input != 2);


    System.out.println("Add meeting hours to calendar 2");

    do {
        System.out.println("Press 1 to add a meeting");
        System.out.println("Press 2 to finish adding meetings");
        input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.println("Input your meeting hours");
                System.out.println("Start:");
                scanner.nextLine();
                String start = scanner.nextLine();
                LocalTime time1 = LocalTime.parse(start, formatter);

                System.out.println("Finish:");
                String finish = scanner.nextLine();
                LocalTime time2 = LocalTime.parse(finish, formatter);

                ArrayList<LocalTime> times = new ArrayList<>();
                times.add(time1);
                times.add(time2);
                TimeSlot timeSlot = new TimeSlot(times);
                calendar2.add(timeSlot.getTimeSlot());
                break;

            case 2:
                break;
        }

    } while (input != 2);


    System.out.println("Calendar" + calendar1);
    System.out.println("Calendar" + calendar2);






}







}
