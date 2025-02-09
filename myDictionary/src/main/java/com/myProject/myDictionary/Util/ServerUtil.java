package com.myProject.myDictionary.Util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ServerUtil {

    public static String ipAddress = "";

    public static String getLocalDateTime(){
        LocalDateTime date = LocalDateTime.now(ZoneId.of("Asia/Rangoon"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return date.format(formatter);
    }
    public static String getLocalDate(){
        LocalDate date = LocalDate.now(ZoneId.of("Asia/Rangoon"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy:MM:dd");
        return date.format(formatter);
    }

}
