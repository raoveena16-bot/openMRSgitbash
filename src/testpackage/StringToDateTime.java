package testpackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToDateTime {
   public static void main(String[] args) {
       String dateTimeStr = "2018-05-05T11:50:55";
       LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr);
       System.out.println(dateTime); 
   }
}