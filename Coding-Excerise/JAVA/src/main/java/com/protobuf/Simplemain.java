package com.protobuf;

import example.simple.Simple.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Simplemain {

  public static void main(String[] args) throws IOException {
        System.out.println("Hello World");

        // this builder (static method) will allow us create simple messages directly from code
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

        System.out.println(builder.toString());

        SimpleMessage message = builder.build();

        // write the protocol buffers binary to a file
        FileOutputStream outputStream= new FileOutputStream("simple message.bin");
        message.writeTo(outputStream);

        System.out.println("Reading from the file");
        FileInputStream inputStream = new FileInputStream("simple message.bin");
        SimpleMessage messageFromFile  = SimpleMessage.parseFrom(inputStream);
        System.out.println(messageFromFile);
            //message.getId();

        // send as byte array
        //byte[] bytes = message.toByteArray();
    }
}
