package com.protobuf;
import example.enumerations.EnumExample;
import example.enumerations.EnumExample.DayOfTheWeek;
import example.enumerations.EnumExample.EnumMessage;
public class EnumMain {

  public static void main(String[] args) {
    System.out.println("Example of emun");
    EnumMessage.Builder builder = EnumMessage.newBuilder();

    builder.setId(123);
    // Exxample of Enum
    builder.setDayOfTheWeek(DayOfTheWeek.MONDAY);
    EnumMessage message= builder.build();
    System.out.println(message);
  }

}
