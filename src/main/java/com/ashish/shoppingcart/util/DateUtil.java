package com.ashish.shoppingcart.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

   static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    static LocalDateTime now = LocalDateTime.now();
    //String formatDateTime = now.format(format);

    public static String getCurrentDateTime(){
        return now.format(format);
    }
}
