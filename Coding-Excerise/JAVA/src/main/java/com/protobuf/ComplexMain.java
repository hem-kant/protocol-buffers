package com.protobuf;

import example.complex.Complex;
import example.complex.Complex.ComplexMessage;
import example.complex.Complex.DummyMessage;

import java.util.Arrays;

public class ComplexMain {

  public static void main(String[] args) {
    System.out.println("Complex Example");
    DummyMessage dummy = dummyMessage(22,"Dummy Message Name");

    ComplexMessage.Builder builder = ComplexMessage.newBuilder(); // singular message field
    builder.setOneDummy(dummy);

    // repeated field
    builder.addMultipleDummy(dummyMessage(22,"Message 1"));
    builder.addMultipleDummy(dummyMessage(23,"Message 2"));

    builder.addAllMultipleDummy(Arrays.asList(
       dummyMessage(22,"Message 1"),
        dummyMessage(23,"Message 2")
    ));

    ComplexMessage message = builder.build();
    System.out.println(message.toString());

    // get
    message.getMultipleDummyList();
  }

  public  static  DummyMessage dummyMessage(Integer id, String name ){
    DummyMessage.Builder builder =  DummyMessage.newBuilder();
    DummyMessage messge = builder.setName(name)
        .setId(id)
        .build();

    return  messge;
  }
}
