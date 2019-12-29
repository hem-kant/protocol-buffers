package com.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.simple.Simple;
import example.simple.Simple.SimpleMessage;

import java.util.Arrays;

public class ProtoToJsonMain {

  public static void main(String[] args) throws InvalidProtocolBufferException {
    SimpleMessage.Builder builder = SimpleMessage.newBuilder();


    builder.setId(20) // setting an ID
        .setIsSimple(true) // setting the is_Simple
        .setName("Hem Kant"); // setting the Name

    // repeated fields
    // we can use builder.addSampleList(1);
    //                    .addSampleList(2);
    builder.addSampleList(1)
        .addSampleList(2)
        .addSampleList(3)
        .addAllSampleList(Arrays.asList(4,5,6));

    // Print this as a JSON
    String jsonString=JsonFormat.printer().print(builder);
    System.out.println(jsonString);

    // pares JSON into protobuf
    Simple.SimpleMessage.Builder builder2 = Simple.SimpleMessage.newBuilder();
    JsonFormat.parser().ignoringUnknownFields().merge(jsonString,builder2);
    System.out.println(builder2);

  }
}
